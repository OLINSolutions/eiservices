
package com.unitedtote.schema.totelink._2008._06.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest;
import com.unitedtote.schema.totelink._2008._06.program.EventsRequest;
import com.unitedtote.schema.totelink._2008._06.program.RaceRequest;


/**
 * <p>Java class for ToteLinkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToteLinkRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://schema.unitedtote.com/ToteLink/2008/06/Common}Source"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToteLinkRequest", propOrder = {
    "source"
})
@XmlSeeAlso({
    EventDetailRequest.class,
    RaceRequest.class,
    EventsRequest.class
})
public class ToteLinkRequest {

    @XmlElement(name = "Source", required = true)
    protected Source source;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

}
