/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.util.ScaSwitch;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchyardItemProviderAdapterFactory extends SwitchyardAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(Switchyard_1EditPlugin.INSTANCE, SwitchyardPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchyardItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArtifactsTypeItemProvider artifactsTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createArtifactsTypeAdapter() {
        if (artifactsTypeItemProvider == null) {
            artifactsTypeItemProvider = new ArtifactsTypeItemProvider(this);
        }

        return artifactsTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArtifactTypeItemProvider artifactTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createArtifactTypeAdapter() {
        if (artifactTypeItemProvider == null) {
            artifactTypeItemProvider = new ArtifactTypeItemProvider(this);
        }

        return artifactTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextMapperTypeItemProvider contextMapperTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createContextMapperTypeAdapter() {
        if (contextMapperTypeItemProvider == null) {
            contextMapperTypeItemProvider = new ContextMapperTypeItemProvider(this);
        }

        return contextMapperTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDocumentRootAdapter() {
        if (documentRootItemProvider == null) {
            documentRootItemProvider = new DocumentRootItemProvider(this);
        }

        return documentRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DomainTypeItemProvider domainTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDomainTypeAdapter() {
        if (domainTypeItemProvider == null) {
            domainTypeItemProvider = new DomainTypeItemProvider(this);
        }

        return domainTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EsbInterfaceItemProvider esbInterfaceItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEsbInterfaceAdapter() {
        if (esbInterfaceItemProvider == null) {
            esbInterfaceItemProvider = new EsbInterfaceItemProvider(this);
        }

        return esbInterfaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HandlersTypeItemProvider handlersTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createHandlersTypeAdapter() {
        if (handlersTypeItemProvider == null) {
            handlersTypeItemProvider = new HandlersTypeItemProvider(this);
        }

        return handlersTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.HandlerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HandlerTypeItemProvider handlerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.HandlerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createHandlerTypeAdapter() {
        if (handlerTypeItemProvider == null) {
            handlerTypeItemProvider = new HandlerTypeItemProvider(this);
        }

        return handlerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageComposerTypeItemProvider messageComposerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMessageComposerTypeAdapter() {
        if (messageComposerTypeItemProvider == null) {
            messageComposerTypeItemProvider = new MessageComposerTypeItemProvider(this);
        }

        return messageComposerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertiesTypeItemProvider propertiesTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPropertiesTypeAdapter() {
        if (propertiesTypeItemProvider == null) {
            propertiesTypeItemProvider = new PropertiesTypeItemProvider(this);
        }

        return propertiesTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyTypeItemProvider propertyTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPropertyTypeAdapter() {
        if (propertyTypeItemProvider == null) {
            propertyTypeItemProvider = new PropertyTypeItemProvider(this);
        }

        return propertyTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceTypeItemProvider resourceTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResourceTypeAdapter() {
        if (resourceTypeItemProvider == null) {
            resourceTypeItemProvider = new ResourceTypeItemProvider(this);
        }

        return resourceTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchYardTypeItemProvider switchYardTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSwitchYardTypeAdapter() {
        if (switchYardTypeItemProvider == null) {
            switchYardTypeItemProvider = new SwitchYardTypeItemProvider(this);
        }

        return switchYardTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformsTypeItemProvider transformsTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformsTypeAdapter() {
        if (transformsTypeItemProvider == null) {
            transformsTypeItemProvider = new TransformsTypeItemProvider(this);
        }

        return transformsTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValidatesTypeItemProvider validatesTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createValidatesTypeAdapter() {
        if (validatesTypeItemProvider == null) {
            validatesTypeItemProvider = new ValidatesTypeItemProvider(this);
        }

        return validatesTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JavaOperationSelectorTypeItemProvider javaOperationSelectorTypeItemProvider;

				/**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createJavaOperationSelectorTypeAdapter() {
        if (javaOperationSelectorTypeItemProvider == null) {
            javaOperationSelectorTypeItemProvider = new JavaOperationSelectorTypeItemProvider(this);
        }

        return javaOperationSelectorTypeItemProvider;
    }

				/**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RegexOperationSelectorTypeItemProvider regexOperationSelectorTypeItemProvider;

				/**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createRegexOperationSelectorTypeAdapter() {
        if (regexOperationSelectorTypeItemProvider == null) {
            regexOperationSelectorTypeItemProvider = new RegexOperationSelectorTypeItemProvider(this);
        }

        return regexOperationSelectorTypeItemProvider;
    }

				/**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StaticOperationSelectorTypeItemProvider staticOperationSelectorTypeItemProvider;

				/**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createStaticOperationSelectorTypeAdapter() {
        if (staticOperationSelectorTypeItemProvider == null) {
            staticOperationSelectorTypeItemProvider = new StaticOperationSelectorTypeItemProvider(this);
        }

        return staticOperationSelectorTypeItemProvider;
    }

				/**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XPathOperationSelectorTypeItemProvider xPathOperationSelectorTypeItemProvider;

				/**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createXPathOperationSelectorTypeAdapter() {
        if (xPathOperationSelectorTypeItemProvider == null) {
            xPathOperationSelectorTypeItemProvider = new XPathOperationSelectorTypeItemProvider(this);
        }

        return xPathOperationSelectorTypeItemProvider;
    }

				/**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityTypeItemProvider securityTypeItemProvider;

                /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSecurityTypeAdapter() {
        if (securityTypeItemProvider == null) {
            securityTypeItemProvider = new SecurityTypeItemProvider(this);
        }

        return securityTypeItemProvider;
    }

                /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
        return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (artifactsTypeItemProvider != null) artifactsTypeItemProvider.dispose();
        if (artifactTypeItemProvider != null) artifactTypeItemProvider.dispose();
        if (contextMapperTypeItemProvider != null) contextMapperTypeItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
        if (domainTypeItemProvider != null) domainTypeItemProvider.dispose();
        if (esbInterfaceItemProvider != null) esbInterfaceItemProvider.dispose();
        if (handlersTypeItemProvider != null) handlersTypeItemProvider.dispose();
        if (handlerTypeItemProvider != null) handlerTypeItemProvider.dispose();
        if (messageComposerTypeItemProvider != null) messageComposerTypeItemProvider.dispose();
        if (propertiesTypeItemProvider != null) propertiesTypeItemProvider.dispose();
        if (propertyTypeItemProvider != null) propertyTypeItemProvider.dispose();
        if (resourceTypeItemProvider != null) resourceTypeItemProvider.dispose();
        if (switchYardTypeItemProvider != null) switchYardTypeItemProvider.dispose();
        if (transformsTypeItemProvider != null) transformsTypeItemProvider.dispose();
        if (validatesTypeItemProvider != null) validatesTypeItemProvider.dispose();
        if (javaOperationSelectorTypeItemProvider != null) javaOperationSelectorTypeItemProvider.dispose();
        if (regexOperationSelectorTypeItemProvider != null) regexOperationSelectorTypeItemProvider.dispose();
        if (staticOperationSelectorTypeItemProvider != null) staticOperationSelectorTypeItemProvider.dispose();
        if (xPathOperationSelectorTypeItemProvider != null) xPathOperationSelectorTypeItemProvider.dispose();
        if (securityTypeItemProvider != null) securityTypeItemProvider.dispose();
    }

    /**
     * A child creation extender for the {@link ScaPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class ScaChildCreationExtender implements IChildCreationExtender {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends ScaSwitch<Object> {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
            /**
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			@Override
			public Object caseBinding(Binding object) {
                newChildDescriptors.add
                    (createChildParameter
                        (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                         FeatureMapUtil.createEntry
                            (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                             SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType())));

                newChildDescriptors.add
                    (createChildParameter
                        (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                         FeatureMapUtil.createEntry
                            (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                             SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType())));

                newChildDescriptors.add
                    (createChildParameter
                        (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                         FeatureMapUtil.createEntry
                            (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                             SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType())));

                newChildDescriptors.add
                    (createChildParameter
                        (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                         FeatureMapUtil.createEntry
                            (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                             SwitchyardFactory.eINSTANCE.createXPathOperationSelectorType())));

                return null;
            }
												/**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseContract(Contract object) {
                newChildDescriptors.add
                    (createChildParameter
                        (ScaPackage.eINSTANCE.getContract_InterfaceGroup(),
                         FeatureMapUtil.createEntry
                            (ScaPackage.eINSTANCE.getContract_Interface(),
                             SwitchyardFactory.eINSTANCE.createEsbInterface())));

                return null;
            }
 
            /*
			 * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
			 * @generated
			 */
            protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
            ArrayList<Object> result = new ArrayList<Object>();
           new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
           return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator() {
            return Switchyard_1EditPlugin.INSTANCE;
        }
    }

}
