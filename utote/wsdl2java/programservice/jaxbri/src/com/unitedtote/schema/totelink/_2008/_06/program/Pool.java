
package com.unitedtote.schema.totelink._2008._06.program;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PoolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PoolNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoolRaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RaceList" type="{http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04}CompressedList" minOccurs="0"/>
 *         &lt;element name="Legs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Unordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Combine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Quick" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Wheel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Box" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Leading" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeyWheel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeyBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SingleBetMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MultipleBetMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WagerMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Parlay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Probables" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WBMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Multiple" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Auto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Segmented" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Straight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FractionalMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}ExchangeWagers" minOccurs="0"/>
 *         &lt;element name="Fractional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pool", propOrder = {
    "poolId",
    "poolNumber",
    "poolName",
    "poolRaces",
    "raceList",
    "legs",
    "unordered",
    "combine",
    "quick",
    "string",
    "wheel",
    "box",
    "powerBox",
    "leading",
    "keyWheel",
    "keyBox",
    "singleBetMinimum",
    "multipleBetMinimum",
    "wagerMinimum",
    "maximum",
    "parlay",
    "probables",
    "wbMaximum",
    "multiple",
    "auto",
    "segmented",
    "straight",
    "fractionalMinimum",
    "exchange",
    "fractional"
})
public class Pool {

    @XmlElement(name = "PoolId", required = true, nillable = true)
    protected String poolId;
    @XmlElement(name = "PoolNumber")
    protected Integer poolNumber;
    @XmlElementRef(name = "PoolName", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> poolName;
    @XmlElement(name = "PoolRaces")
    protected Integer poolRaces;
    @XmlElementRef(name = "RaceList", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> raceList;
    @XmlElement(name = "Legs")
    protected Integer legs;
    @XmlElement(name = "Unordered")
    protected Boolean unordered;
    @XmlElement(name = "Combine")
    protected Integer combine;
    @XmlElement(name = "Quick")
    protected Boolean quick;
    @XmlElement(name = "String")
    protected Boolean string;
    @XmlElement(name = "Wheel")
    protected Boolean wheel;
    @XmlElement(name = "Box")
    protected Boolean box;
    @XmlElement(name = "PowerBox")
    protected Boolean powerBox;
    @XmlElement(name = "Leading")
    protected Boolean leading;
    @XmlElement(name = "KeyWheel")
    protected Boolean keyWheel;
    @XmlElement(name = "KeyBox")
    protected Boolean keyBox;
    @XmlElementRef(name = "SingleBetMinimum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> singleBetMinimum;
    @XmlElementRef(name = "MultipleBetMinimum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> multipleBetMinimum;
    @XmlElementRef(name = "WagerMinimum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> wagerMinimum;
    @XmlElementRef(name = "Maximum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> maximum;
    @XmlElement(name = "Parlay")
    protected Boolean parlay;
    @XmlElement(name = "Probables")
    protected Boolean probables;
    @XmlElementRef(name = "WBMaximum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> wbMaximum;
    @XmlElement(name = "Multiple")
    protected Boolean multiple;
    @XmlElement(name = "Auto")
    protected Boolean auto;
    @XmlElement(name = "Segmented")
    protected Boolean segmented;
    @XmlElement(name = "Straight")
    protected Boolean straight;
    @XmlElementRef(name = "FractionalMinimum", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> fractionalMinimum;
    @XmlElementRef(name = "Exchange", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<ExchangeWagers> exchange;
    @XmlElement(name = "Fractional")
    protected Boolean fractional;

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
     * Gets the value of the poolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoolNumber() {
        return poolNumber;
    }

    /**
     * Sets the value of the poolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoolNumber(Integer value) {
        this.poolNumber = value;
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
     * Gets the value of the poolRaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoolRaces() {
        return poolRaces;
    }

    /**
     * Sets the value of the poolRaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoolRaces(Integer value) {
        this.poolRaces = value;
    }

    /**
     * Gets the value of the raceList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaceList() {
        return raceList;
    }

    /**
     * Sets the value of the raceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaceList(JAXBElement<String> value) {
        this.raceList = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegs(Integer value) {
        this.legs = value;
    }

    /**
     * Gets the value of the unordered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnordered() {
        return unordered;
    }

    /**
     * Sets the value of the unordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnordered(Boolean value) {
        this.unordered = value;
    }

    /**
     * Gets the value of the combine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCombine() {
        return combine;
    }

    /**
     * Sets the value of the combine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCombine(Integer value) {
        this.combine = value;
    }

    /**
     * Gets the value of the quick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuick() {
        return quick;
    }

    /**
     * Sets the value of the quick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuick(Boolean value) {
        this.quick = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setString(Boolean value) {
        this.string = value;
    }

    /**
     * Gets the value of the wheel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheel() {
        return wheel;
    }

    /**
     * Sets the value of the wheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheel(Boolean value) {
        this.wheel = value;
    }

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBox(Boolean value) {
        this.box = value;
    }

    /**
     * Gets the value of the powerBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerBox() {
        return powerBox;
    }

    /**
     * Sets the value of the powerBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerBox(Boolean value) {
        this.powerBox = value;
    }

    /**
     * Gets the value of the leading property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeading() {
        return leading;
    }

    /**
     * Sets the value of the leading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeading(Boolean value) {
        this.leading = value;
    }

    /**
     * Gets the value of the keyWheel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyWheel() {
        return keyWheel;
    }

    /**
     * Sets the value of the keyWheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyWheel(Boolean value) {
        this.keyWheel = value;
    }

    /**
     * Gets the value of the keyBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyBox() {
        return keyBox;
    }

    /**
     * Sets the value of the keyBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyBox(Boolean value) {
        this.keyBox = value;
    }

    /**
     * Gets the value of the singleBetMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSingleBetMinimum() {
        return singleBetMinimum;
    }

    /**
     * Sets the value of the singleBetMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSingleBetMinimum(JAXBElement<BigDecimal> value) {
        this.singleBetMinimum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the multipleBetMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMultipleBetMinimum() {
        return multipleBetMinimum;
    }

    /**
     * Sets the value of the multipleBetMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMultipleBetMinimum(JAXBElement<BigDecimal> value) {
        this.multipleBetMinimum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the wagerMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWagerMinimum() {
        return wagerMinimum;
    }

    /**
     * Sets the value of the wagerMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWagerMinimum(JAXBElement<BigDecimal> value) {
        this.wagerMinimum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaximum(JAXBElement<BigDecimal> value) {
        this.maximum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the parlay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParlay() {
        return parlay;
    }

    /**
     * Sets the value of the parlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParlay(Boolean value) {
        this.parlay = value;
    }

    /**
     * Gets the value of the probables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProbables() {
        return probables;
    }

    /**
     * Sets the value of the probables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProbables(Boolean value) {
        this.probables = value;
    }

    /**
     * Gets the value of the wbMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWBMaximum() {
        return wbMaximum;
    }

    /**
     * Sets the value of the wbMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWBMaximum(JAXBElement<BigDecimal> value) {
        this.wbMaximum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the multiple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiple(Boolean value) {
        this.multiple = value;
    }

    /**
     * Gets the value of the auto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuto(Boolean value) {
        this.auto = value;
    }

    /**
     * Gets the value of the segmented property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSegmented() {
        return segmented;
    }

    /**
     * Sets the value of the segmented property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSegmented(Boolean value) {
        this.segmented = value;
    }

    /**
     * Gets the value of the straight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStraight() {
        return straight;
    }

    /**
     * Sets the value of the straight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStraight(Boolean value) {
        this.straight = value;
    }

    /**
     * Gets the value of the fractionalMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFractionalMinimum() {
        return fractionalMinimum;
    }

    /**
     * Sets the value of the fractionalMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFractionalMinimum(JAXBElement<BigDecimal> value) {
        this.fractionalMinimum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExchangeWagers }{@code >}
     *     
     */
    public JAXBElement<ExchangeWagers> getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExchangeWagers }{@code >}
     *     
     */
    public void setExchange(JAXBElement<ExchangeWagers> value) {
        this.exchange = ((JAXBElement<ExchangeWagers> ) value);
    }

    /**
     * Gets the value of the fractional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFractional() {
        return fractional;
    }

    /**
     * Sets the value of the fractional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFractional(Boolean value) {
        this.fractional = value;
    }

}
