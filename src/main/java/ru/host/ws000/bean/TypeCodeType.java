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
 * <p>Java class for TypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GSRV"/>
 *     &lt;enumeration value="GFNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCodeType", namespace = "http://smev.gosuslugi.ru/rev120315")
@XmlEnum
public enum TypeCodeType {

    GSRV,
    GFNC;

    public String value() {
        return name();
    }

    public static TypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
