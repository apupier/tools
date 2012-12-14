/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaFactoryImpl extends EFactoryImpl implements JpaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JpaFactory init() {
        try {
            JpaFactory theJpaFactory = (JpaFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-jpa:config:1.0"); 
            if (theJpaFactory != null) {
                return theJpaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JpaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case JpaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case JpaPackage.JPA_PRODUCER_TYPE: return createJpaProducerType();
            case JpaPackage.JPA_CONSUMER_TYPE: return createJpaConsumerType();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE: return createCamelJPABindingType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaProducerType createJpaProducerType() {
        JpaProducerTypeImpl jpaProducerType = new JpaProducerTypeImpl();
        return jpaProducerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaConsumerType createJpaConsumerType() {
        JpaConsumerTypeImpl jpaConsumerType = new JpaConsumerTypeImpl();
        return jpaConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelJPABindingType createCamelJPABindingType() {
        CamelJPABindingTypeImpl camelJPABindingType = new CamelJPABindingTypeImpl();
        return camelJPABindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaPackage getJpaPackage() {
        return (JpaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JpaPackage getPackage() {
        return JpaPackage.eINSTANCE;
    }

} //JpaFactoryImpl
