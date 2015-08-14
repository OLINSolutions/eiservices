
package com.unitedtote.schema.totelink._2008._06.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest;


/**
 * <p>Java class for ResultRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.unitedtote.com/ToteLink/2008/06/Common}ToteLinkRequest">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RaceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultRequest", propOrder = {
    "eventId",
    "raceId"
})
public class ResultRequest
    extends ToteLinkRequest
{

    @XmlElement(name = "EventId", required = true, nillable = true)
    protected String eventId;
    @XmlElement(name = "RaceId")
    protected int raceId;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the raceId property.
     * 
     */
    public int getRaceId() {
        return raceId;
    }

    /**
     * Sets the value of the raceId property.
     * 
     */
    public void setRaceId(int value) {
        this.raceId = value;
    }

}
