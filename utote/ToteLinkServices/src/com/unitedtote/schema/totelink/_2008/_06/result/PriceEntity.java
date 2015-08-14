
package com.unitedtote.schema.totelink._2008._06.result;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Finish" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Winnings" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Wager" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceEntity", propOrder = {
    "finish",
    "exchange",
    "hold",
    "winnings",
    "wager",
    "priceAmount",
    "required",
    "payoff"
})
public class PriceEntity {

    @XmlElement(name = "Finish", required = true, nillable = true)
    protected String finish;
    @XmlElement(name = "Exchange")
    protected Boolean exchange;
    @XmlElement(name = "Hold")
    protected Boolean hold;
    @XmlElementRef(name = "Winnings", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> winnings;
    @XmlElementRef(name = "Wager", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> wager;
    @XmlElementRef(name = "PriceAmount", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> priceAmount;
    @XmlElementRef(name = "Required", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> required;
    @XmlElementRef(name = "Payoff", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> payoff;

    /**
     * Gets the value of the finish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinish() {
        return finish;
    }

    /**
     * Sets the value of the finish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinish(String value) {
        this.finish = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchange(Boolean value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHold() {
        return hold;
    }

    /**
     * Sets the value of the hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHold(Boolean value) {
        this.hold = value;
    }

    /**
     * Gets the value of the winnings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWinnings() {
        return winnings;
    }

    /**
     * Sets the value of the winnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWinnings(JAXBElement<BigDecimal> value) {
        this.winnings = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the wager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWager() {
        return wager;
    }

    /**
     * Sets the value of the wager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWager(JAXBElement<BigDecimal> value) {
        this.wager = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceAmount(JAXBElement<BigDecimal> value) {
        this.priceAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequired(JAXBElement<String> value) {
        this.required = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPayoff() {
        return payoff;
    }

    /**
     * Sets the value of the payoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPayoff(JAXBElement<BigDecimal> value) {
        this.payoff = ((JAXBElement<BigDecimal> ) value);
    }

}
