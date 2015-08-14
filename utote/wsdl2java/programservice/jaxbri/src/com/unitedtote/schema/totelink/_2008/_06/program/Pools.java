
package com.unitedtote.schema.totelink._2008._06.program;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pools">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pool" type="{http://schema.unitedtote.com/ToteLink/2008/06/Program}Pool" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pools", propOrder = {
    "pool"
})
public class Pools {

    @XmlElement(name = "Pool", nillable = true)
    protected List<Pool> pool;

    /**
     * Gets the value of the pool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pool }
     * 
     * 
     */
    public List<Pool> getPool() {
        if (pool == null) {
            pool = new ArrayList<Pool>();
        }
        return this.pool;
    }

}
