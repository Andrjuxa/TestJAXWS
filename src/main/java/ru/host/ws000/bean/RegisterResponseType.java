//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 05:02:02 PM MSK 
//


package ru.host.ws000.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RegisterResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://smev.gosuslugi.ru/rev120315}MessageType" minOccurs="0"/>
 *         &lt;element name="MessageData" type="{http://smev.gosuslugi.ru/rev120315}ServiceMessageDataResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterResponseType", namespace = "http://smev.gosuslugi.ru/rev120315", propOrder = {
    "message",
    "messageData"
})
public class RegisterResponseType {

    @XmlElement(name = "Message", namespace = "http://smev.gosuslugi.ru/rev120315")
    protected MessageType message;
    @XmlElement(name = "MessageData", namespace = "http://smev.gosuslugi.ru/rev120315")
    protected ServiceMessageDataResponseType messageData;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     *     
     */
    public void setMessage(MessageType value) {
        this.message = ((MessageType) value);
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceMessageDataResponseType }{@code >}
     *     
     */
    public ServiceMessageDataResponseType getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceMessageDataResponseType }{@code >}
     *     
     */
    public void setMessageData(ServiceMessageDataResponseType value) {
        this.messageData = ((ServiceMessageDataResponseType) value);
    }

}
