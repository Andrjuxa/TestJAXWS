//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.01 at 12:04:42 PM MSK 
//


package ru.host.ws000.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderKind" type="{http://lanit.ru/ws/pgu/types}SenderKindType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderInfoType", namespace = "http://lanit.ru/ws/pgu/types", propOrder = {
    "senderKind"
})
public class SenderInfoType {

    @XmlElement(namespace = "http://lanit.ru/ws/pgu/types", required = true)
    protected String senderKind;

    /**
     * Gets the value of the senderKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderKind() {
        return senderKind;
    }

    /**
     * Sets the value of the senderKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderKind(String value) {
        this.senderKind = value;
    }

}
