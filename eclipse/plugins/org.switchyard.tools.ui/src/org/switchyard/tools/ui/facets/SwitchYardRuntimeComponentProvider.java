/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.facets;

import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.FSW_RUNTIME_ID;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.FSW_RUNTIME_VERSION_6_0;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.FSW_RUNTIME_VERSION_6_1;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_ID;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_LABEL_KEY;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_VERSION_1_0;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_VERSION_1_1;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_VERSION_2_0;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_VERSION_KEY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IPath;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.eclipse.wst.common.project.facet.core.runtime.RuntimeManager;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.internal.facets.RuntimeFacetComponentProviderDelegate;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SwitchYardRuntimeComponentProvider
 * <p/>
 * Identifies SwitchYard runtime components that may be installed on servers.
 * 
 * TODO: we should probably add a cache for the file operations (e.g. manifest
 * scanning).
 */
@SuppressWarnings("restriction")
public class SwitchYardRuntimeComponentProvider extends RuntimeFacetComponentProviderDelegate {

    private static final Pattern DEPLOY_JAR_NAME_PATTERN = Pattern.compile("switchyard-deploy-(jboss-as7|wildfly)-(.*?)\\.jar"); //$NON-NLS-1$
    private static final Pattern INTEGRATION_DEPLOY_JAR_NAME_PATTERN = Pattern.compile("switchyard-component-bpm-(.*?)\\.jar"); //$NON-NLS-1$
    private static final String SWITCHYARD_AS_DEPLOY_MODULE_PATH = "modules/system/layers/soa/org/switchyard/main"; //$NON-NLS-1$
    private static final String INTEGRATION_AS_DEPLOY_MODULE_PATH = "modules/system/layers/fuse-integration/org/fuse/integration/switchyard/component/bpm/main"; //$NON-NLS-1$
    private static final String FSW_PRODUCT_MANIFEST_PATH = "modules/system/layers/soa/org/jboss/as/product/soa/dir/META-INF/MANIFEST.MF"; //$NON-NLS-1$
    private static final String FUSE_BUNDLE_INFO_FILE = "bundle.info"; //$NON-NLS-1$
    private static final String FUSE_DATA_DIR = "data"; //$NON-NLS-1$
    private static final String FUSE_DATA_CACHE_DIR = "cache"; //$NON-NLS-1$
    private static final String BUNDLE_VERSION = "Bundle-Version"; //$NON-NLS-1$
    
    private static final Name JBOSS_PRODUCT_RELEASE_NAME = new Name("JBoss-Product-Release-Name"); //$NON-NLS-1$
    private static final Name JBOSS_PRODUCT_RELEASE_VERSION = new Name("JBoss-Product-Release-Version"); //$NON-NLS-1$

    // facet framework runtime component ids, versions

    @Override
    public List<IRuntimeComponent> getRuntimeComponents(IRuntime runtime) {
        final IPath runtimeLocation = runtime.getLocation();
        IRuntimeComponent switchYardRuntime = null;
        SwitchYardRuntimeMetaData switchYardMetaData = null;
        if (runtimeLocation == null) {
            /*
             * We shouldn't get here since we don't support "stripped" runtimes
             * (which are configured to support all SY versions anyway), so
             * we'll just return the latest version.
             */
            switchYardRuntime = getDefaultRuntimeComponent(null);
        } else {
            if (runtime.getRuntimeType().getId().startsWith("org.fusesource.ide")) {
                switchYardMetaData = getSwitchYardVersionFromKarafRuntime(runtimeLocation);
            } else {
                switchYardMetaData = getIntegrationVersionFromRuntime(runtimeLocation);
                if (switchYardMetaData == null) {
                    switchYardMetaData = getSwitchYardVersionFromRuntime(runtimeLocation);
                }
                final File productManifest = runtimeLocation.append(FSW_PRODUCT_MANIFEST_PATH).toFile();
                if (productManifest.exists()) {
                    try {
                        InputStream is = new FileInputStream(productManifest);
                        try {
                            Manifest manifest = new Manifest(is);
                            if (manifest.getMainAttributes().containsKey(JBOSS_PRODUCT_RELEASE_NAME)) {
                                String productName = String.class.cast(manifest.getMainAttributes().get(
                                        JBOSS_PRODUCT_RELEASE_NAME));
                                if (productName.matches(".* Fuse Service Works")) { //$NON-NLS-1$
                                    switchYardMetaData._name = productName;
                                    if (manifest.getMainAttributes().containsKey(JBOSS_PRODUCT_RELEASE_VERSION)) {
                                        switchYardMetaData._runtimeVersion = String.class.cast(manifest.getMainAttributes()
                                                .get(JBOSS_PRODUCT_RELEASE_VERSION));
                                    }
                                    if (switchYardMetaData._runtimeVersion != null) {
                                        if (switchYardMetaData._runtimeVersion.startsWith("6.0.")) { //$NON-NLS-1$
                                            switchYardRuntime = RuntimeManager.createRuntimeComponent(
                                                    RuntimeManager.getRuntimeComponentType(FSW_RUNTIME_ID).getVersion(
                                                            FSW_RUNTIME_VERSION_6_0),
                                                    createRuntimeComponentProperties(switchYardMetaData));
                                        } else if (switchYardMetaData._runtimeVersion.startsWith("6.1.")) { //$NON-NLS-1$
                                            switchYardRuntime = RuntimeManager.createRuntimeComponent(
                                                    RuntimeManager.getRuntimeComponentType(FSW_RUNTIME_ID).getVersion(
                                                            FSW_RUNTIME_VERSION_6_1),
                                                    createRuntimeComponentProperties(switchYardMetaData));
                                        }
                                    }
                                    if (switchYardRuntime == null) {
                                        /*
                                         * we know it's FSW, so we'll assume the
                                         * latest version.
                                         */
                                        switchYardRuntime = getDefaultFSWRuntimeComponent(null);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.fillInStackTrace();
                        } finally {
                            try {
                                is.close();
                            } catch (IOException e) {
                                e.fillInStackTrace();
                            }
                        }
                    } catch (Exception e) {
                        e.fillInStackTrace();
                    }
                }
            }
            if (switchYardRuntime == null && switchYardMetaData != null) {
                /*
                 * if we don't have the runtime from product, check for
                 * community release
                 */
                if (switchYardMetaData._runtimeVersion == null && switchYardMetaData._integrationBOMVersion != null) {
                    switchYardRuntime = RuntimeManager.createRuntimeComponent(
                            RuntimeManager.getRuntimeComponentType(SWITCHYARD_RUNTIME_ID)
                                    .getVersion(SWITCHYARD_RUNTIME_VERSION_2_0),
                            createRuntimeComponentProperties(switchYardMetaData));
                } else if (switchYardMetaData._runtimeVersion.startsWith("1.0.") //$NON-NLS-1$
                        || switchYardMetaData._runtimeVersion.startsWith("0.")) { //$NON-NLS-1$
                    switchYardRuntime = RuntimeManager.createRuntimeComponent(
                            RuntimeManager.getRuntimeComponentType(SWITCHYARD_RUNTIME_ID)
                                    .getVersion(SWITCHYARD_RUNTIME_VERSION_1_0),
                            createRuntimeComponentProperties(switchYardMetaData));
                } else if (switchYardMetaData._runtimeVersion.startsWith("1.1.")) { //$NON-NLS-1$
                    switchYardRuntime = RuntimeManager.createRuntimeComponent(
                            RuntimeManager.getRuntimeComponentType(SWITCHYARD_RUNTIME_ID)
                                    .getVersion(SWITCHYARD_RUNTIME_VERSION_1_1),
                            createRuntimeComponentProperties(switchYardMetaData));
                } else if (switchYardMetaData._runtimeVersion.startsWith("2.0.")) { //$NON-NLS-1$
                    switchYardRuntime = RuntimeManager.createRuntimeComponent(
                            RuntimeManager.getRuntimeComponentType(SWITCHYARD_RUNTIME_ID)
                                    .getVersion(SWITCHYARD_RUNTIME_VERSION_2_0),
                            createRuntimeComponentProperties(switchYardMetaData));
                } else {
                    switchYardRuntime = getDefaultRuntimeComponent(switchYardMetaData);
                }
            }
            /*
             * else: if we couldn't get switchYardVersion, SwitchYard is not
             * installed.
             */
        }

        if (switchYardRuntime == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(switchYardRuntime);
    }

    private IRuntimeComponent getDefaultRuntimeComponent(final SwitchYardRuntimeMetaData switchYardVersion) {
        try {
            return RuntimeManager.createRuntimeComponent(RuntimeManager.getRuntimeComponentType(SWITCHYARD_RUNTIME_ID)
                    .getLatestVersion(), createRuntimeComponentProperties(switchYardVersion));
        } catch (Exception e) {
            return null;
        }
    }

    private IRuntimeComponent getDefaultFSWRuntimeComponent(final SwitchYardRuntimeMetaData switchYardMetaData) {
        try {
            return RuntimeManager.createRuntimeComponent(RuntimeManager.getRuntimeComponentType(FSW_RUNTIME_ID)
                    .getLatestVersion(), createRuntimeComponentProperties(switchYardMetaData));
        } catch (Exception e) {
            return null;
        }
    }

    private Map<String, String> createRuntimeComponentProperties(final SwitchYardRuntimeMetaData switchYardMetaData) {
        if (switchYardMetaData == null) {
            return null;
        }
        final Map<String, String> properties = new HashMap<String, String>();
        properties.put(SWITCHYARD_RUNTIME_LABEL_KEY, switchYardMetaData.createLabel());
        properties.put(SWITCHYARD_RUNTIME_VERSION_KEY, switchYardMetaData.getVersion());
        return properties;
    }

    private String readBundleInfoFileForSwitchYardAPIString(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            String line = br.readLine();

            while (line != null) {
                if (line.contains("org.switchyard")) {
                    return line;
                }
                line = br.readLine();
            }
            return null;
        } finally {
            br.close();
        }
    }    
    
    private String readBundleInfoFileForIntegrationString(File[] fileList) throws IOException {
        for (File file : fileList) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String line = br.readLine();

                while (line != null) {
                    if (line.contains("org.jboss.integration.fuse")) {
                        return line;
                    }
                    line = br.readLine();
                }
                return null;
            } finally {
                br.close();
            }
        }
        return null;
    }

    private File findNamedDir(String name, File dir, int depth) {
        if (name.equals(dir.getName())) {
            return dir;
        }
        if (depth == 0) {
            return null;
        }
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (files != null) {
            int size = files.length;
            for (int i = 0; i < size;) {
                File innerDir = findNamedDir(name, files[i++], depth - 1);
                if (innerDir != null) {
                    return innerDir;
                }
            }
        }
        return null;
    }

    private SwitchYardRuntimeMetaData getSwitchYardVersionFromKarafRuntime(IPath runtimeLocation) {
        final File rootDir = runtimeLocation.toFile();
        final File dataDir = findNamedDir(FUSE_DATA_DIR, rootDir, 2);
        if (dataDir != null) {
            final File cacheDir = findNamedDir(FUSE_DATA_CACHE_DIR, dataDir, 2);
            if (cacheDir != null) {
                final File[] folders = cacheDir.listFiles();
                if (folders == null || folders.length == 0) {
                    return null;
                }
                SwitchYardRuntimeMetaData symetadata = null;
                SwitchYardRuntimeMetaData integmetadata = null;
                
                for (File folder : folders) {
                    File[] fileList = folder.listFiles(new FilenameFilter() {
                        
                        @Override
                        public boolean accept(File dir, String name) {
                            if (name.equalsIgnoreCase(FUSE_BUNDLE_INFO_FILE)) {
                                return true;
                            }
                            return false;
                        }
                    });
                    if (fileList != null && fileList.length >= 1) {
                        try {
                            String integContents = readBundleInfoFileForIntegrationString(fileList);
                            if (integContents != null) {
                                String[] splitStr = integContents.split("/"); //$NON-NLS-1$
                                if (splitStr != null && splitStr.length > 1) {
                                    integmetadata = new SwitchYardRuntimeMetaData();
                                    String version = splitStr[splitStr.length - 1];
                                    integmetadata._integrationBOMVersion = version;
                                    integmetadata._name = "SwitchYard: Integration Extension";
                                    integmetadata._libraryVersion = version;
                                }
                            }
                            String contents = readBundleInfoFileForSwitchYardAPIString(fileList[0]);
                            if (contents == null) {
                                continue;
                            }
                            String[] splitStr = contents.split("/"); //$NON-NLS-1$
                            if (splitStr != null && splitStr.length > 1) {
                                symetadata = new SwitchYardRuntimeMetaData();
                                String version = splitStr[splitStr.length - 1];
                                symetadata._runtimeVersion = version;
                                symetadata._name = "SwitchYard: Karaf Extension";
                                symetadata._libraryVersion = version;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (integmetadata != null) {
                    return integmetadata;
                }
                if (symetadata != null) {
                    return symetadata;
                }
            }
        }
        return null;
    }
    
    private SwitchYardRuntimeMetaData getSwitchYardVersionFromRuntime(IPath runtimeLocation) {
        final File mainDirectory = runtimeLocation.append(SWITCHYARD_AS_DEPLOY_MODULE_PATH).toFile();
        final String[] files = mainDirectory.list();
        if (files == null) {
            return null;
        }
        for (String file : files) {
            final Matcher matcher = DEPLOY_JAR_NAME_PATTERN.matcher(file);
            if (matcher.matches()) {
                try {
                    final JarFile runtimeJar = new JarFile(new File(mainDirectory, file));
                    try {
                        final Manifest manifest = runtimeJar.getManifest();
                        if (manifest == null) {
                            continue;
                        }
                        SwitchYardRuntimeMetaData metadata = new SwitchYardRuntimeMetaData();
                        if (manifest.getMainAttributes().containsKey(Name.IMPLEMENTATION_VERSION)) {
                            metadata._libraryVersion = String.class.cast(manifest.getMainAttributes().get(
                                    Name.IMPLEMENTATION_VERSION));
                            metadata._runtimeVersion = metadata._libraryVersion;
                        } else {
                            metadata._libraryVersion = matcher.group(1);
                            metadata._runtimeVersion = metadata._libraryVersion;
                        }
                        metadata._name = String.class.cast(manifest.getMainAttributes().get(Name.IMPLEMENTATION_TITLE));
                        return metadata;
                    } catch (IOException e) {
                        SwitchYardRuntimeMetaData metadata = new SwitchYardRuntimeMetaData();
                        metadata._name = Messages.SwitchYardRuntimeComponentProvider_label_runtimeComponentName;
                        metadata._libraryVersion = matcher.group(1);
                        metadata._runtimeVersion = metadata._libraryVersion;
                        return metadata;
                    } finally {
                        try {
                            runtimeJar.close();
                        } catch (IOException e) {
                            e.fillInStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        return null;
    }

    private SwitchYardRuntimeMetaData getIntegrationVersionFromRuntime(IPath runtimeLocation) {
        final File mainDirectory = runtimeLocation.append(INTEGRATION_AS_DEPLOY_MODULE_PATH).toFile();
        final String[] files = mainDirectory.list();
        if (files == null) {
            return null;
        }
        for (String file : files) {
            final Matcher matcher = INTEGRATION_DEPLOY_JAR_NAME_PATTERN.matcher(file);
            if (matcher.matches()) {
                try {
                    final JarFile runtimeJar = new JarFile(new File(mainDirectory, file));
                    try {
                        final Manifest manifest = runtimeJar.getManifest();
                        if (manifest == null) {
                            continue;
                        }
                        SwitchYardRuntimeMetaData metadata = new SwitchYardRuntimeMetaData();
                        if (manifest.getMainAttributes().containsKey(BUNDLE_VERSION)) {
                            metadata._integrationBOMVersion = String.class
                                    .cast(manifest.getMainAttributes().get(BUNDLE_VERSION));
                            metadata._runtimeVersion = metadata._libraryVersion;
                        } else {
                            metadata._integrationBOMVersion = matcher.group(1);
                            metadata._runtimeVersion = metadata._libraryVersion;
                        }
                        String bundleTitle = String.class
                                .cast(manifest.getMainAttributes().get(Name.IMPLEMENTATION_TITLE));
                        bundleTitle = bundleTitle.substring(0, bundleTitle.indexOf(':'));
                        metadata._name = bundleTitle;
                        return metadata;
                    } catch (IOException e) {
                        SwitchYardRuntimeMetaData metadata = new SwitchYardRuntimeMetaData();
                        metadata._name = Messages.SwitchYardRuntimeComponentProvider_label_runtimeComponentName;
                        metadata._integrationBOMVersion = matcher.group(1);
                        metadata._runtimeVersion = metadata._libraryVersion;
                        return metadata;
                    } finally {
                        try {
                            runtimeJar.close();
                        } catch (IOException e) {
                            e.fillInStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        return null;
    }

    private static final class SwitchYardRuntimeMetaData {
        private String _libraryVersion;
        private String _name;
        private String _runtimeVersion;
        private String _integrationBOMVersion;

        private String createLabel() {
            final String version;
            if (_integrationBOMVersion != null && _integrationBOMVersion.length() > 0) {
                version = _integrationBOMVersion;
            } else if (_runtimeVersion == null || _runtimeVersion.length() == 0) {
                if (_libraryVersion == null || _libraryVersion.length() == 0) {
                    version = null;
                } else {
                    version = _libraryVersion;
                }
            } else {
                version = _runtimeVersion;
            }
            return "" + _name + ' ' + version; //$NON-NLS-1$
        }
        
        private String getVersion() {
            if (_integrationBOMVersion != null && _integrationBOMVersion.length() > 0) {
                return _integrationBOMVersion;
            }
            return _libraryVersion;
        }
    }
}
