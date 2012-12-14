/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.switchyard.tools.models.switchyard1_0.camel.core.util.CamelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelItemProviderAdapterFactory extends CamelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public CamelItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledPollConsumerTypeItemProvider scheduledPollConsumerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createScheduledPollConsumerTypeAdapter() {
        if (scheduledPollConsumerTypeItemProvider == null) {
            scheduledPollConsumerTypeItemProvider = new ScheduledPollConsumerTypeItemProvider(this);
        }

        return scheduledPollConsumerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledBatchPollConsumerTypeItemProvider scheduledBatchPollConsumerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createScheduledBatchPollConsumerTypeAdapter() {
        if (scheduledBatchPollConsumerTypeItemProvider == null) {
            scheduledBatchPollConsumerTypeItemProvider = new ScheduledBatchPollConsumerTypeItemProvider(this);
        }

        return scheduledBatchPollConsumerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericFileConsumerTypeItemProvider genericFileConsumerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGenericFileConsumerTypeAdapter() {
        if (genericFileConsumerTypeItemProvider == null) {
            genericFileConsumerTypeItemProvider = new GenericFileConsumerTypeItemProvider(this);
        }

        return genericFileConsumerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericFileProducerTypeItemProvider genericFileProducerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGenericFileProducerTypeAdapter() {
        if (genericFileProducerTypeItemProvider == null) {
            genericFileProducerTypeItemProvider = new GenericFileProducerTypeItemProvider(this);
        }

        return genericFileProducerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JmsBindingTypeItemProvider jmsBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJmsBindingTypeAdapter() {
        if (jmsBindingTypeItemProvider == null) {
            jmsBindingTypeItemProvider = new JmsBindingTypeItemProvider(this);
        }

        return jmsBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelBindingTypeItemProvider camelBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCamelBindingTypeAdapter() {
        if (camelBindingTypeItemProvider == null) {
            camelBindingTypeItemProvider = new CamelBindingTypeItemProvider(this);
        }

        return camelBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelDirectBindingTypeItemProvider camelDirectBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCamelDirectBindingTypeAdapter() {
        if (camelDirectBindingTypeItemProvider == null) {
            camelDirectBindingTypeItemProvider = new CamelDirectBindingTypeItemProvider(this);
        }

        return camelDirectBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelTimerBindingTypeItemProvider camelTimerBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCamelTimerBindingTypeAdapter() {
        if (camelTimerBindingTypeItemProvider == null) {
            camelTimerBindingTypeItemProvider = new CamelTimerBindingTypeItemProvider(this);
        }

        return camelTimerBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSedaBindingTypeItemProvider camelSedaBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCamelSedaBindingTypeAdapter() {
        if (camelSedaBindingTypeItemProvider == null) {
            camelSedaBindingTypeItemProvider = new CamelSedaBindingTypeItemProvider(this);
        }

        return camelSedaBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMockBindingTypeItemProvider camelMockBindingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCamelMockBindingTypeAdapter() {
        if (camelMockBindingTypeItemProvider == null) {
            camelMockBindingTypeItemProvider = new CamelMockBindingTypeItemProvider(this);
        }

        return camelMockBindingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot}.
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
        if (scheduledPollConsumerTypeItemProvider != null) scheduledPollConsumerTypeItemProvider.dispose();
        if (scheduledBatchPollConsumerTypeItemProvider != null) scheduledBatchPollConsumerTypeItemProvider.dispose();
        if (genericFileConsumerTypeItemProvider != null) genericFileConsumerTypeItemProvider.dispose();
        if (genericFileProducerTypeItemProvider != null) genericFileProducerTypeItemProvider.dispose();
        if (jmsBindingTypeItemProvider != null) jmsBindingTypeItemProvider.dispose();
        if (camelBindingTypeItemProvider != null) camelBindingTypeItemProvider.dispose();
        if (camelDirectBindingTypeItemProvider != null) camelDirectBindingTypeItemProvider.dispose();
        if (camelTimerBindingTypeItemProvider != null) camelTimerBindingTypeItemProvider.dispose();
        if (camelSedaBindingTypeItemProvider != null) camelSedaBindingTypeItemProvider.dispose();
        if (camelMockBindingTypeItemProvider != null) camelMockBindingTypeItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
    }

}
