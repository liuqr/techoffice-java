//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.18 at 10:19:16 AM CST 
//


package com.techoffice.javaee.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The dispatcher has four legal values: FORWARD, REQUEST, INCLUDE,
 * 	and ERROR. A value of FORWARD means the Filter will be applied
 * 	under RequestDispatcher.forward() calls.  A value of REQUEST
 * 	means the Filter will be applied under ordinary client calls to
 * 	the path or servlet. A value of INCLUDE means the Filter will be
 * 	applied under RequestDispatcher.include() calls.  A value of
 * 	ERROR means the Filter will be applied under the error page
 * 	mechanism.  The absence of any dispatcher elements in a
 * 	filter-mapping indicates a default of applying filters only under
 * 	ordinary client calls to the path or servlet.
 * 
 *       
 * 
 * <p>Java class for dispatcherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dispatcherType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/javaee&gt;string"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dispatcherType")
public class DispatcherType
    extends String
{


}