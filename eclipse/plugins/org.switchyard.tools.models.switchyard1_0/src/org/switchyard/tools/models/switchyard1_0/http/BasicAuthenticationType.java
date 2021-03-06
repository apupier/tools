/**
 */
package org.switchyard.tools.models.switchyard1_0.http;

import java.math.BigInteger;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Authentication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getUser <em>User</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getRealm <em>Realm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType()
 * @model extendedMetaData="name='BasicAuthenticationType' kind='elementOnly'"
 * @generated
 */
public interface BasicAuthenticationType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * User name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>User</em>' attribute.
     * @see #setUser(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType_User()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
     * @generated
     */
    String getUser();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getUser <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' attribute.
     * @see #getUser()
     * @generated
     */
    void setUser(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Password.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Realm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Authentication Realm.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Realm</em>' attribute.
     * @see #setRealm(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType_Realm()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='realm' namespace='##targetNamespace'"
     * @generated
     */
    String getRealm();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getRealm <em>Realm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realm</em>' attribute.
     * @see #getRealm()
     * @generated
     */
    void setRealm(String value);

    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Authentication Host.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Authentication Port.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(Object)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getBasicAuthenticationType_Port()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    Object getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(Object value);

} // BasicAuthenticationType
