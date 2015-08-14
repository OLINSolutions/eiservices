
package com.unitedtote.schema.totelink._2008._06.program;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Race complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Race">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pools" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}Pools" minOccurs="0"/>
 *         &lt;element name="Runners" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}Runners" minOccurs="0"/>
 *         &lt;element name="RaceChanges" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}RaceChanges" minOccurs="0"/>
 *         &lt;element name="RaceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RaceStatus" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}RaceStatus" minOccurs="0"/>
 *         &lt;element name="TrackType" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}TrackType" minOccurs="0"/>
 *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumberOfRunners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Finish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Odds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RaceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Claim" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Live" type="{http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04}CompressedList" minOccurs="0"/>
 *         &lt;element name="PoolList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Race", propOrder = {
    "pools",
    "runners",
    "raceChanges",
    "raceId",
    "raceStatus",
    "trackType",
    "current",
    "postTime",
    "numberOfRunners",
    "finish",
    "program",
    "odds",
    "conditions",
    "raceType",
    "surface",
    "distance",
    "purse",
    "sex",
    "age",
    "claim",
    "live",
    "poolList"
})
public class Race {

    @XmlElementRef(name = "Pools", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<Pools> pools;
    @XmlElementRef(name = "Runners", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<Runners> runners;
    @XmlElementRef(name = "RaceChanges", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<RaceChanges> raceChanges;
    @XmlElement(name = "RaceId")
    protected int raceId;
    @XmlElementRef(name = "RaceStatus", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<RaceStatus> raceStatus;
    @XmlElementRef(name = "TrackType", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<TrackType> trackType;
    @XmlElement(name = "Current")
    protected Boolean current;
    @XmlElementRef(name = "PostTime", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> postTime;
    @XmlElement(name = "NumberOfRunners")
    protected Integer numberOfRunners;
    @XmlElementRef(name = "Finish", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> finish;
    @XmlElement(name = "Program")
    protected Boolean program;
    @XmlElement(name = "Odds")
    protected Boolean odds;
    @XmlElementRef(name = "Conditions", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> conditions;
    @XmlElementRef(name = "RaceType", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> raceType;
    @XmlElementRef(name = "Surface", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> surface;
    @XmlElementRef(name = "Distance", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> distance;
    @XmlElement(name = "Purse")
    protected BigDecimal purse;
    @XmlElementRef(name = "Sex", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "Age", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> age;
    @XmlElement(name = "Claim")
    protected BigDecimal claim;
    @XmlElementRef(name = "Live", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> live;
    @XmlElementRef(name = "PoolList", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> poolList;

    /**
     * Gets the value of the pools property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Pools }{@code >}
     *     
     */
    public JAXBElement<Pools> getPools() {
        return pools;
    }

    /**
     * Sets the value of the pools property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Pools }{@code >}
     *     
     */
    public void setPools(JAXBElement<Pools> value) {
        this.pools = ((JAXBElement<Pools> ) value);
    }

    /**
     * Gets the value of the runners property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Runners }{@code >}
     *     
     */
    public JAXBElement<Runners> getRunners() {
        return runners;
    }

    /**
     * Sets the value of the runners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Runners }{@code >}
     *     
     */
    public void setRunners(JAXBElement<Runners> value) {
        this.runners = ((JAXBElement<Runners> ) value);
    }

    /**
     * Gets the value of the raceChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RaceChanges }{@code >}
     *     
     */
    public JAXBElement<RaceChanges> getRaceChanges() {
        return raceChanges;
    }

    /**
     * Sets the value of the raceChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RaceChanges }{@code >}
     *     
     */
    public void setRaceChanges(JAXBElement<RaceChanges> value) {
        this.raceChanges = ((JAXBElement<RaceChanges> ) value);
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

    /**
     * Gets the value of the raceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RaceStatus }{@code >}
     *     
     */
    public JAXBElement<RaceStatus> getRaceStatus() {
        return raceStatus;
    }

    /**
     * Sets the value of the raceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RaceStatus }{@code >}
     *     
     */
    public void setRaceStatus(JAXBElement<RaceStatus> value) {
        this.raceStatus = ((JAXBElement<RaceStatus> ) value);
    }

    /**
     * Gets the value of the trackType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     
     */
    public JAXBElement<TrackType> getTrackType() {
        return trackType;
    }

    /**
     * Sets the value of the trackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     
     */
    public void setTrackType(JAXBElement<TrackType> value) {
        this.trackType = ((JAXBElement<TrackType> ) value);
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the postTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPostTime() {
        return postTime;
    }

    /**
     * Sets the value of the postTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPostTime(JAXBElement<XMLGregorianCalendar> value) {
        this.postTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the numberOfRunners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRunners() {
        return numberOfRunners;
    }

    /**
     * Sets the value of the numberOfRunners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRunners(Integer value) {
        this.numberOfRunners = value;
    }

    /**
     * Gets the value of the finish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinish() {
        return finish;
    }

    /**
     * Sets the value of the finish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinish(JAXBElement<String> value) {
        this.finish = ((JAXBElement<String> ) value);
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
     * Gets the value of the odds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdds() {
        return odds;
    }

    /**
     * Sets the value of the odds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdds(Boolean value) {
        this.odds = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConditions(JAXBElement<String> value) {
        this.conditions = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the raceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaceType() {
        return raceType;
    }

    /**
     * Sets the value of the raceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaceType(JAXBElement<String> value) {
        this.raceType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurface(JAXBElement<String> value) {
        this.surface = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistance(JAXBElement<String> value) {
        this.distance = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the purse property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurse() {
        return purse;
    }

    /**
     * Sets the value of the purse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurse(BigDecimal value) {
        this.purse = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAge(JAXBElement<String> value) {
        this.age = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaim(BigDecimal value) {
        this.claim = value;
    }

    /**
     * Gets the value of the live property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLive(JAXBElement<String> value) {
        this.live = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the poolList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoolList() {
        return poolList;
    }

    /**
     * Sets the value of the poolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoolList(JAXBElement<String> value) {
        this.poolList = ((JAXBElement<String> ) value);
    }

}
