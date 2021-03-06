/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Inbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener <em>Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getBatchCommit <em>Batch Commit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAInboundInteraction()
 * @model extendedMetaData="name='JCAInboundInteraction' kind='elementOnly'"
 * @generated
 */
public interface JCAInboundInteraction extends EObject {
    /**
     * Returns the value of the '<em><b>Listener</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listener</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listener</em>' attribute.
     * @see #setListener(String)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAInboundInteraction_Listener()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
     * @generated
     */
    String getListener();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener <em>Listener</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listener</em>' attribute.
     * @see #getListener()
     * @generated
     */
    void setListener(String value);

    /**
     * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint</em>' containment reference.
     * @see #setEndpoint(Endpoint)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAInboundInteraction_Endpoint()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
     * @generated
     */
    Endpoint getEndpoint();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint <em>Endpoint</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Endpoint</em>' containment reference.
     * @see #getEndpoint()
     * @generated
     */
    void setEndpoint(Endpoint value);

    /**
     * Returns the value of the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transacted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transacted</em>' attribute.
     * @see #setTransacted(Object)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAInboundInteraction_Transacted()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    Object getTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #getTransacted()
     * @generated
     */
    void setTransacted(Object value);

    /**
     * Returns the value of the '<em><b>Batch Commit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch Commit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Commit</em>' containment reference.
     * @see #setBatchCommit(BatchCommit)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAInboundInteraction_BatchCommit()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='batchCommit' namespace='##targetNamespace'"
     * @generated
     */
    BatchCommit getBatchCommit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getBatchCommit <em>Batch Commit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Commit</em>' containment reference.
     * @see #getBatchCommit()
     * @generated
     */
    void setBatchCommit(BatchCommit value);

} // JCAInboundInteraction
