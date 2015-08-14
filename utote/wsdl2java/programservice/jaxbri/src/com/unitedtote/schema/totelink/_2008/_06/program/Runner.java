
package com.unitedtote.schema.totelink._2008._06.program;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Runner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Runner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RunnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Entries" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}Entries" minOccurs="0"/>
 *         &lt;element name="Scratch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Odds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runner", propOrder = {
    "runnerId",
    "entries",
    "scratch",
    "odds"
})
public class Runner {

    @XmlElement(name = "RunnerId")
    protected int runnerId;
    @XmlElementRef(name = "Entries", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<Entries> entries;
    @XmlElement(name = "Scratch")
    protected Boolean scratch;
    @XmlElementRef(name = "Odds", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Program", type = JAXBElement.class)
    protected JAXBElement<String> odds;

    /**
     * Gets the value of the runnerId property.
     * 
     */
    public int getRunnerId() {
        return runnerId;
    }

    /**
     * Sets the value of the runnerId property.
     * 
     */
    public void setRunnerId(int value) {
        this.runnerId = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entries }{@code >}
     *     
     */
    public JAXBElement<Entries> getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entries }{@code >}
     *     
     */
    public void setEntries(JAXBElement<Entries> value) {
        this.entries = ((JAXBElement<Entries> ) value);
    }

    /**
     * Gets the value of the scratch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScratch() {
        return scratch;
    }

    /**
     * Sets the value of the scratch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScratch(Boolean value) {
        this.scratch = value;
    }

    /**
     * Gets the value of the odds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdds() {
        return odds;
    }

    /**
     * Sets the value of the odds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdds(JAXBElement<String> value) {
        this.odds = ((JAXBElement<String> ) value);
    }

}
