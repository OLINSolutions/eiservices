
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeWagers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeWagers">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Exchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeWagers")
@XmlEnum
public enum ExchangeWagers {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange");
    private final String value;

    ExchangeWagers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeWagers fromValue(String v) {
        for (ExchangeWagers c: ExchangeWagers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
