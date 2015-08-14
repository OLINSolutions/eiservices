
package com.unitedtote.schema.totelink._2008._06.result;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultRequest" type="{http://schema.unitedtote.com/ToteLink/2008/06/Result}ResultRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultRequest"
})
@XmlRootElement(name = "GetResult")
public class GetResult {

    @XmlElementRef(name = "ResultRequest", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", type = JAXBElement.class)
    protected JAXBElement<ResultRequest> resultRequest;

    /**
     * Gets the value of the resultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultRequest }{@code >}
     *     
     */
    public JAXBElement<ResultRequest> getResultRequest() {
        return resultRequest;
    }

    /**
     * Sets the value of the resultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultRequest }{@code >}
     *     
     */
    public void setResultRequest(JAXBElement<ResultRequest> value) {
        this.resultRequest = ((JAXBElement<ResultRequest> ) value);
    }

}
