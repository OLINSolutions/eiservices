
package com.unitedtote.schema.totelink._2008._06.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.unitedtote.schema.totelink._2008._06.result.ResultResponse;


/**
 * <p>Java class for ToteLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToteLinkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://schema.unitedtote.com/ToteLink/2008/06/Common}Error" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://schema.unitedtote.com/ToteLink/2008/06/Common}Source" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToteLinkResponse", propOrder = {
    "runId",
    "groupId",
    "error",
    "source"
})
@XmlSeeAlso({
    ResultResponse.class
})
public class ToteLinkResponse {

    @XmlElementRef(name = "RunId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", type = JAXBElement.class)
    protected JAXBElement<String> runId;
    @XmlElementRef(name = "GroupId", namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", type = JAXBElement.class)
    protected JAXBElement<String> groupId;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "Source")
    protected Source source;

    /**
     * Gets the value of the runId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRunId() {
        return runId;
    }

    /**
     * Sets the value of the runId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRunId(JAXBElement<String> value) {
        this.runId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupId(JAXBElement<String> value) {
        this.groupId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

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
