
package com.unitedtote.schema.totelink._2008._06.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Finishers" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}Finishers"/>
 *         &lt;element name="PositionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position", propOrder = {
    "finishers",
    "positionId"
})
public class Position {

    @XmlElement(name = "Finishers", required = true, nillable = true)
    protected Finishers finishers;
    @XmlElement(name = "PositionId")
    protected int positionId;

    /**
     * Gets the value of the finishers property.
     * 
     * @return
     *     possible object is
     *     {@link Finishers }
     *     
     */
    public Finishers getFinishers() {
        return finishers;
    }

    /**
     * Sets the value of the finishers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Finishers }
     *     
     */
    public void setFinishers(Finishers value) {
        this.finishers = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     */
    public int getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     */
    public void setPositionId(int value) {
        this.positionId = value;
    }

}
