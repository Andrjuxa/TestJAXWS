//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 05:02:02 PM MSK 
//


package ru.host.ws000.bean;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESS"/>
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="PING"/>
 *     &lt;enumeration value="ACCEPT"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="RESULT"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="NOTIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType", namespace = "http://smev.gosuslugi.ru/rev120315")
@XmlEnum
public enum StatusType {

    PROCESS,
    REQUEST,
    PING,
    ACCEPT,
    FAILURE,
    STATE,
    RESULT,
    REJECT,
    CANCEL,
    INVALID,
    NOTIFY;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
