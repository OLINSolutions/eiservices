
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
 *         &lt;element name="RaceRequest" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}RaceRequest" minOccurs="0"/>
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
    "raceRequest"
})
@XmlRootElement(name = "GetRace")
public class GetRace {

    @XmlElementRef(name = "RaceRequest", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<RaceRequest> raceRequest;

    /**
     * Gets the value of the raceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RaceRequest }{@code >}
     *     
     */
    public JAXBElement<RaceRequest> getRaceRequest() {
        return raceRequest;
    }

    /**
     * Sets the value of the raceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RaceRequest }{@code >}
     *     
     */
    public void setRaceRequest(JAXBElement<RaceRequest> value) {
        this.raceRequest = ((JAXBElement<RaceRequest> ) value);
    }

}
