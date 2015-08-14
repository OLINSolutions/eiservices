
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
 * <p>Java class for Updates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Updates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Track" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RaceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Updates", propOrder = {
    "siteId",
    "runId",
    "messageTime",
    "transactionTime",
    "type",
    "data",
    "section",
    "group",
    "track",
    "post",
    "eventId",
    "raceId",
    "source",
    "sourceIds",
    "trackCode"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
public class Updates {

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
    @XmlElement(name = "Type", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected String type;
    @XmlElementRef(name = "Data", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> data;
    @XmlElementRef(name = "Section", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> section;
    @XmlElementRef(name = "Group", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> group;
    @XmlElementRef(name = "Track", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> track;
    @XmlElementRef(name = "Post", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<Boolean> post;
    @XmlElementRef(name = "EventId", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> eventId;
    @XmlElementRef(name = "RaceId", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<Integer> raceId;
    @XmlElementRef(name = "Source", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> source;
    @XmlElementRef(name = "SourceIds", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> sourceIds;
    @XmlElementRef(name = "TrackCode", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> trackCode;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setData(JAXBElement<String> value) {
        this.data = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setSection(JAXBElement<String> value) {
        this.section = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setGroup(JAXBElement<String> value) {
        this.group = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getTrack() {
        return track;
    }

    /**
     * Sets the value of the track property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setTrack(JAXBElement<String> value) {
        this.track = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<Boolean> getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setPost(JAXBElement<Boolean> value) {
        this.post = value;
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
     * Gets the value of the trackCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getTrackCode() {
        return trackCode;
    }

    /**
     * Sets the value of the trackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-07-11T05:35:51-04:00", comments = "JAXB RI v2.2.6")
    public void setTrackCode(JAXBElement<String> value) {
        this.trackCode = value;
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
