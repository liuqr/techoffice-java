//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.18 at 10:19:16 AM CST 
//


package com.techoffice.javaee.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	The login-configType is used to configure the authentication
 * 	method that should be used, the realm name that should be
 * 	used for this application, and the attributes that are
 * 	needed by the form login mechanism.
 * 
 * 	Used in: web-app
 * 
 *       
 * 
 * <p>Java class for login-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="login-configType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth-method" type="{http://java.sun.com/xml/ns/javaee}auth-methodType" minOccurs="0"/&gt;
 *         &lt;element name="realm-name" type="{http://java.sun.com/xml/ns/javaee}string" minOccurs="0"/&gt;
 *         &lt;element name="form-login-config" type="{http://java.sun.com/xml/ns/javaee}form-login-configType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login-configType", propOrder = {
    "authMethod",
    "realmName",
    "formLoginConfig"
})
public class LoginConfigType {

    @XmlElement(name = "auth-method")
    protected AuthMethodType authMethod;
    @XmlElement(name = "realm-name")
    protected com.techoffice.javaee.webapp.model.String realmName;
    @XmlElement(name = "form-login-config")
    protected FormLoginConfigType formLoginConfig;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the authMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AuthMethodType }
     *     
     */
    public AuthMethodType getAuthMethod() {
        return authMethod;
    }

    /**
     * Sets the value of the authMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthMethodType }
     *     
     */
    public void setAuthMethod(AuthMethodType value) {
        this.authMethod = value;
    }

    /**
     * Gets the value of the realmName property.
     * 
     * @return
     *     possible object is
     *     {@link com.techoffice.javaee.webapp.model.String }
     *     
     */
    public com.techoffice.javaee.webapp.model.String getRealmName() {
        return realmName;
    }

    /**
     * Sets the value of the realmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.techoffice.javaee.webapp.model.String }
     *     
     */
    public void setRealmName(com.techoffice.javaee.webapp.model.String value) {
        this.realmName = value;
    }

    /**
     * Gets the value of the formLoginConfig property.
     * 
     * @return
     *     possible object is
     *     {@link FormLoginConfigType }
     *     
     */
    public FormLoginConfigType getFormLoginConfig() {
        return formLoginConfig;
    }

    /**
     * Sets the value of the formLoginConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormLoginConfigType }
     *     
     */
    public void setFormLoginConfig(FormLoginConfigType value) {
        this.formLoginConfig = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
