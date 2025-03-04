
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RaceResponse" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}RaceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "raceResponse"
})
@XmlRootElement(name = "GetRaceResponse")
public class GetRaceResponse {

    @XmlElementRef(name = "RaceResponse", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<RaceResponse> raceResponse;

    /**
     * Gets the value of the raceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RaceResponse }{@code >}
     *     
     */
    public JAXBElement<RaceResponse> getRaceResponse() {
        return raceResponse;
    }

    /**
     * Sets the value of the raceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RaceResponse }{@code >}
     *     
     */
    public void setRaceResponse(JAXBElement<RaceResponse> value) {
        this.raceResponse = ((JAXBElement<RaceResponse> ) value);
    }

}
