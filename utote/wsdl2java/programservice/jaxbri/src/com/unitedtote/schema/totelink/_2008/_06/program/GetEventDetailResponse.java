
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
 *         &lt;element name="EventsResponse" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}EventDetailResponse" minOccurs="0"/>
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
    "eventsResponse"
})
@XmlRootElement(name = "GetEventDetailResponse")
public class GetEventDetailResponse {

    @XmlElementRef(name = "EventsResponse", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<EventDetailResponse> eventsResponse;

    /**
     * Gets the value of the eventsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventDetailResponse }{@code >}
     *     
     */
    public JAXBElement<EventDetailResponse> getEventsResponse() {
        return eventsResponse;
    }

    /**
     * Sets the value of the eventsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventDetailResponse }{@code >}
     *     
     */
    public void setEventsResponse(JAXBElement<EventDetailResponse> value) {
        this.eventsResponse = ((JAXBElement<EventDetailResponse> ) value);
    }

}
