
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse;


/**
 * <p>Java class for EventDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.unitedtote.com/ToteLink/2008/06/Common}ToteLinkResponse">
 *       &lt;sequence>
 *         &lt;element name="TournamentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDetail" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}Event" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDetailResponse", propOrder = {
    "tournamentId",
    "contestId",
    "eventDetail"
})
public class EventDetailResponse
    extends ToteLinkResponse
{

    @XmlElementRef(name = "TournamentId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> tournamentId;
    @XmlElementRef(name = "ContestId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> contestId;
    @XmlElementRef(name = "EventDetail", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<Event> eventDetail;

    /**
     * Gets the value of the tournamentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTournamentId() {
        return tournamentId;
    }

    /**
     * Sets the value of the tournamentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTournamentId(JAXBElement<String> value) {
        this.tournamentId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContestId() {
        return contestId;
    }

    /**
     * Sets the value of the contestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContestId(JAXBElement<String> value) {
        this.contestId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eventDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Event }{@code >}
     *     
     */
    public JAXBElement<Event> getEventDetail() {
        return eventDetail;
    }

    /**
     * Sets the value of the eventDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Event }{@code >}
     *     
     */
    public void setEventDetail(JAXBElement<Event> value) {
        this.eventDetail = ((JAXBElement<Event> ) value);
    }

}
