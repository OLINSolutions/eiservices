
package com.unitedtote.schema.totelink._2008._06.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Finishers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Finishers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Finisher" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}Finisher" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Finishers", propOrder = {
    "finisher"
})
public class Finishers {

    @XmlElement(name = "Finisher", nillable = true)
    protected List<Finisher> finisher;

    /**
     * Gets the value of the finisher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finisher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinisher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Finisher }
     * 
     * 
     */
    public List<Finisher> getFinisher() {
        if (finisher == null) {
            finisher = new ArrayList<Finisher>();
        }
        return this.finisher;
    }

}
