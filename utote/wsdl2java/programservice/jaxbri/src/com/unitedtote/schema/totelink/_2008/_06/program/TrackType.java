
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JaiAlai"/>
 *     &lt;enumeration value="Thoroughbred"/>
 *     &lt;enumeration value="Greyhound"/>
 *     &lt;enumeration value="Quarterhorse"/>
 *     &lt;enumeration value="Harness"/>
 *     &lt;enumeration value="Arabian"/>
 *     &lt;enumeration value="Mixed"/>
 *     &lt;enumeration value="Cycle"/>
 *     &lt;enumeration value="Boat"/>
 *     &lt;enumeration value="Vehicle"/>
 *     &lt;enumeration value="Sports"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackType")
@XmlEnum
public enum TrackType {

    @XmlEnumValue("JaiAlai")
    JAI_ALAI("JaiAlai"),
    @XmlEnumValue("Thoroughbred")
    THOROUGHBRED("Thoroughbred"),
    @XmlEnumValue("Greyhound")
    GREYHOUND("Greyhound"),
    @XmlEnumValue("Quarterhorse")
    QUARTERHORSE("Quarterhorse"),
    @XmlEnumValue("Harness")
    HARNESS("Harness"),
    @XmlEnumValue("Arabian")
    ARABIAN("Arabian"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("Cycle")
    CYCLE("Cycle"),
    @XmlEnumValue("Boat")
    BOAT("Boat"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Sports")
    SPORTS("Sports"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TrackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackType fromValue(String v) {
        for (TrackType c: TrackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
