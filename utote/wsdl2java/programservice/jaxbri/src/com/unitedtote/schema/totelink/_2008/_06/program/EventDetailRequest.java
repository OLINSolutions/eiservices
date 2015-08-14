
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest;


/**
 * <p>Java class for EventDetailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDetailRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.unitedtote.com/ToteLink/2008/06/Common}ToteLinkRequest">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TournamentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Races" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pools" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Runners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDetailRequest", propOrder = {
    "eventId",
    "tournamentId",
    "contestId",
    "program",
    "races",
    "pools",
    "runners"
})
public class EventDetailRequest
    extends ToteLinkRequest
{

    @XmlElement(name = "EventId", required = true, nillable = true)
    protected String eventId;
    @XmlElementRef(name = "TournamentId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> tournamentId;
    @XmlElementRef(name = "ContestId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> contestId;
    @XmlElement(name = "Program")
    protected Boolean program;
    @XmlElement(name = "Races")
    protected Boolean races;
    @XmlElement(name = "Pools")
    protected Boolean pools;
    @XmlElement(name = "Runners")
    protected Boolean runners;

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
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProgram(Boolean value) {
        this.program = value;
    }

    /**
     * Gets the value of the races property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaces() {
        return races;
    }

    /**
     * Sets the value of the races property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaces(Boolean value) {
        this.races = value;
    }

    /**
     * Gets the value of the pools property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPools() {
        return pools;
    }

    /**
     * Sets the value of the pools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPools(Boolean value) {
        this.pools = value;
    }

    /**
     * Gets the value of the runners property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunners() {
        return runners;
    }

    /**
     * Sets the value of the runners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunners(Boolean value) {
        this.runners = value;
    }

}
