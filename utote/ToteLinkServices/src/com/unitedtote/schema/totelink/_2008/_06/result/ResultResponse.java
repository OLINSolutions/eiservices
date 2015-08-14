
package com.unitedtote.schema.totelink._2008._06.result;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse;


/**
 * <p>Java class for ResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.unitedtote.com/ToteLink/2008/06/Common}ToteLinkResponse">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RaceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RaceResults" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}ResultEntity" minOccurs="0"/>
 *         &lt;element name="PoolPrices" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}PoolPrices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultResponse", propOrder = {
    "eventId",
    "eventName",
    "raceId",
    "currencyId",
    "raceResults",
    "poolPrices"
})
public class ResultResponse
    extends ToteLinkResponse
{

    @XmlElementRef(name = "EventId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> eventId;
    @XmlElementRef(name = "EventName", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> eventName;
    @XmlElement(name = "RaceId")
    protected Integer raceId;
    @XmlElementRef(name = "CurrencyId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> currencyId;
    @XmlElementRef(name = "RaceResults", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<ResultEntity> raceResults;
    @XmlElementRef(name = "PoolPrices", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<PoolPrices> poolPrices;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventId(JAXBElement<String> value) {
        this.eventId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventName(JAXBElement<String> value) {
        this.eventName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the raceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRaceId() {
        return raceId;
    }

    /**
     * Sets the value of the raceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRaceId(Integer value) {
        this.raceId = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyId(JAXBElement<String> value) {
        this.currencyId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the raceResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultEntity }{@code >}
     *     
     */
    public JAXBElement<ResultEntity> getRaceResults() {
        return raceResults;
    }

    /**
     * Sets the value of the raceResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultEntity }{@code >}
     *     
     */
    public void setRaceResults(JAXBElement<ResultEntity> value) {
        this.raceResults = ((JAXBElement<ResultEntity> ) value);
    }

    /**
     * Gets the value of the poolPrices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PoolPrices }{@code >}
     *     
     */
    public JAXBElement<PoolPrices> getPoolPrices() {
        return poolPrices;
    }

    /**
     * Sets the value of the poolPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PoolPrices }{@code >}
     *     
     */
    public void setPoolPrices(JAXBElement<PoolPrices> value) {
        this.poolPrices = ((JAXBElement<PoolPrices> ) value);
    }

}
