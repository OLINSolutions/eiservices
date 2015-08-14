
package com.unitedtote.schema.totelink._2008._06.result;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Positions" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}Positions" minOccurs="0"/>
 *         &lt;element name="Winners" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scratches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultEntity", propOrder = {
    "positions",
    "winners",
    "scratches"
})
public class ResultEntity {

    @XmlElementRef(name = "Positions", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<Positions> positions;
    @XmlElementRef(name = "Winners", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> winners;
    @XmlElementRef(name = "Scratches", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<String> scratches;

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Positions }{@code >}
     *     
     */
    public JAXBElement<Positions> getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Positions }{@code >}
     *     
     */
    public void setPositions(JAXBElement<Positions> value) {
        this.positions = ((JAXBElement<Positions> ) value);
    }

    /**
     * Gets the value of the winners property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWinners() {
        return winners;
    }

    /**
     * Sets the value of the winners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWinners(JAXBElement<String> value) {
        this.winners = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scratches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScratches() {
        return scratches;
    }

    /**
     * Sets the value of the scratches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScratches(JAXBElement<String> value) {
        this.scratches = ((JAXBElement<String> ) value);
    }

}
