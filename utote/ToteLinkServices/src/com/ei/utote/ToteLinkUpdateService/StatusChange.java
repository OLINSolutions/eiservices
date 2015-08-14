
package com.ei.utote.ToteLinkUpdateService;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for StatusChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RaceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChange", propOrder = {
    "siteId",
    "runId",
    "messageTime",
    "transactionTime",
    "action",
    "eventId",
    "raceId",
    "source",
    "status",
    "mtp",
    "sourceIds"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
public class StatusChange {

    @XmlElement(name = "SiteId", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected String siteId;
    @XmlElement(name = "RunId", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected String runId;
    @XmlElement(name = "MessageTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected XMLGregorianCalendar messageTime;
    @XmlElement(name = "TransactionTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "Action", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected String action;
    @XmlElementRef(name = "EventId", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> eventId;
    @XmlElementRef(name = "RaceId", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<Integer> raceId;
    @XmlElementRef(name = "Source", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> source;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> status;
    @XmlElementRef(name = "MTP", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<Long> mtp;
    @XmlElementRef(name = "SourceIds", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> sourceIds;

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the runId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public String getRunId() {
        return runId;
    }

    /**
     * Sets the value of the runId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setRunId(String value) {
        this.runId = value;
    }

    /**
     * Gets the value of the messageTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public XMLGregorianCalendar getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setMessageTime(XMLGregorianCalendar value) {
        this.messageTime = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setEventId(JAXBElement<String> value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the raceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<Integer> getRaceId() {
        return raceId;
    }

    /**
     * Sets the value of the raceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setRaceId(JAXBElement<Integer> value) {
        this.raceId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the mtp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<Long> getMTP() {
        return mtp;
    }

    /**
     * Sets the value of the mtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setMTP(JAXBElement<Long> value) {
        this.mtp = value;
    }

    /**
     * Gets the value of the sourceIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSourceIds() {
        return sourceIds;
    }

    /**
     * Sets the value of the sourceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setSourceIds(JAXBElement<String> value) {
        this.sourceIds = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
