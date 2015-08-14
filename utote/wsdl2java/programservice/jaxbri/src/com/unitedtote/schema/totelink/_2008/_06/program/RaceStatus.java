
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RaceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RaceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Post"/>
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="UnCancel"/>
 *     &lt;enumeration value="UnOfficial"/>
 *     &lt;enumeration value="Begin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RaceStatus")
@XmlEnum
public enum RaceStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("UnCancel")
    UN_CANCEL("UnCancel"),
    @XmlEnumValue("UnOfficial")
    UN_OFFICIAL("UnOfficial"),
    @XmlEnumValue("Begin")
    BEGIN("Begin");
    private final String value;

    RaceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaceStatus fromValue(String v) {
        for (RaceStatus c: RaceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
