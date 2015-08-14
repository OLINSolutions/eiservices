
package com.unitedtote.schema.totelink._2008._06.result;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoolPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prices" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}Prices" minOccurs="0"/>
 *         &lt;element name="PoolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CarryOver" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolPrice", propOrder = {
    "prices",
    "poolId",
    "poolName",
    "refund",
    "carryOver"
})
public class PoolPrice {

    @XmlElementRef(name = "Prices", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<Prices> prices;
    @XmlElement(name = "PoolId", required = true, nillable = true)
    protected String poolId;
    @XmlElementRef(name = "PoolName", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> poolName;
    @XmlElement(name = "Refund")
    protected Boolean refund;
    @XmlElementRef(name = "CarryOver", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> carryOver;

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Prices }{@code >}
     *     
     */
    public JAXBElement<Prices> getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Prices }{@code >}
     *     
     */
    public void setPrices(JAXBElement<Prices> value) {
        this.prices = ((JAXBElement<Prices> ) value);
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the poolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoolName() {
        return poolName;
    }

    /**
     * Sets the value of the poolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoolName(JAXBElement<String> value) {
        this.poolName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefund(Boolean value) {
        this.refund = value;
    }

    /**
     * Gets the value of the carryOver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCarryOver() {
        return carryOver;
    }

    /**
     * Sets the value of the carryOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCarryOver(JAXBElement<BigDecimal> value) {
        this.carryOver = ((JAXBElement<BigDecimal> ) value);
    }

}
