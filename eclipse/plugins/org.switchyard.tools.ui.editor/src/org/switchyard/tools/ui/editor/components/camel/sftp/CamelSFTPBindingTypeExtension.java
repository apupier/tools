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
package org.switchyard.tools.ui.editor.components.camel.sftp;

import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelSFTPBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel FTP bindings.
 */
public class CamelSFTPBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelSFTPBindingFactory(), "SFTP",
                "A Camel SFTP based endpoint.", ImageProvider.IMG_16_SFTP) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_SFTP);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelSftpBindingType.class.isAssignableFrom(type);
    }

    @Override
    public IBindingComposite createComposite(Binding binding) {
        if (binding.eContainer() instanceof Service) {
            return new CamelSFTPConsumerComposite();
        }
        return new CamelSFTPProducerComposite();
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-ftp");
    }

    @Override
    public String getTypeName(Binding object) {
        return "SFTP";
    }
}