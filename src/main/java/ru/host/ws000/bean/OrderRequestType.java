//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 05:02:02 PM MSK 
//


package ru.host.ws000.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceInfo" type="{http://lanit.ru/ws/pgu/changeorderinfo}ServiceInfoType"/>
 *         &lt;element name="pguId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRequestType", namespace = "http://lanit.ru/ws/pgu/changeorderinfo", propOrder = {
    "serviceInfo",
    "pguId"
})
public class OrderRequestType {

    @XmlElement(namespace = "http://lanit.ru/ws/pgu/changeorderinfo", required = true, nillable = true)
    protected ServiceInfoType serviceInfo;
    @XmlElement(namespace = "http://lanit.ru/ws/pgu/changeorderinfo", required = true, nillable = true)
    protected String pguId;

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoType }
     *     
     */
    public ServiceInfoType getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoType }
     *     
     */
    public void setServiceInfo(ServiceInfoType value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the pguId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPguId() {
        return pguId;
    }

    /**
     * Sets the value of the pguId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPguId(String value) {
        this.pguId = value;
    }

}
