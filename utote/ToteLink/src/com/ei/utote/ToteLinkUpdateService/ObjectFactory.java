
package com.ei.utote.ToteLinkUpdateService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ei.utote.ToteLinkUpdateService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StatusChange_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "StatusChange");
    private final static QName _Updates_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Updates");
    private final static QName _StatusChangeStatus_QNAME = new QName("", "Status");
    private final static QName _StatusChangeMTP_QNAME = new QName("", "MTP");
    private final static QName _StatusChangeEventId_QNAME = new QName("", "EventId");
    private final static QName _StatusChangeSourceIds_QNAME = new QName("", "SourceIds");
    private final static QName _StatusChangeRaceId_QNAME = new QName("", "RaceId");
    private final static QName _StatusChangeSource_QNAME = new QName("", "Source");
    private final static QName _UpdatesGroup_QNAME = new QName("", "Group");
    private final static QName _UpdatesTrackCode_QNAME = new QName("", "TrackCode");
    private final static QName _UpdatesPost_QNAME = new QName("", "Post");
    private final static QName _UpdatesData_QNAME = new QName("", "Data");
    private final static QName _UpdatesSection_QNAME = new QName("", "Section");
    private final static QName _UpdatesTrack_QNAME = new QName("", "Track");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ei.utote.ToteLinkUpdateService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusChange }
     * 
     */
    public StatusChange createStatusChange() {
        return new StatusChange();
    }

    /**
     * Create an instance of {@link Updates }
     * 
     */
    public Updates createUpdates() {
        return new Updates();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub", name = "StatusChange")
    public JAXBElement<StatusChange> createStatusChange(StatusChange value) {
        return new JAXBElement<StatusChange>(_StatusChange_QNAME, StatusChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub", name = "Updates")
    public JAXBElement<Updates> createUpdates(Updates value) {
        return new JAXBElement<Updates>(_Updates_QNAME, Updates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = StatusChange.class)
    public JAXBElement<String> createStatusChangeStatus(String value) {
        return new JAXBElement<String>(_StatusChangeStatus_QNAME, String.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTP", scope = StatusChange.class)
    public JAXBElement<Long> createStatusChangeMTP(Long value) {
        return new JAXBElement<Long>(_StatusChangeMTP_QNAME, Long.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EventId", scope = StatusChange.class)
    public JAXBElement<String> createStatusChangeEventId(String value) {
        return new JAXBElement<String>(_StatusChangeEventId_QNAME, String.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceIds", scope = StatusChange.class)
    public JAXBElement<String> createStatusChangeSourceIds(String value) {
        return new JAXBElement<String>(_StatusChangeSourceIds_QNAME, String.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RaceId", scope = StatusChange.class)
    public JAXBElement<Integer> createStatusChangeRaceId(Integer value) {
        return new JAXBElement<Integer>(_StatusChangeRaceId_QNAME, Integer.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Source", scope = StatusChange.class)
    public JAXBElement<String> createStatusChangeSource(String value) {
        return new JAXBElement<String>(_StatusChangeSource_QNAME, String.class, StatusChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Group", scope = Updates.class)
    public JAXBElement<String> createUpdatesGroup(String value) {
        return new JAXBElement<String>(_UpdatesGroup_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrackCode", scope = Updates.class)
    public JAXBElement<String> createUpdatesTrackCode(String value) {
        return new JAXBElement<String>(_UpdatesTrackCode_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Post", scope = Updates.class)
    public JAXBElement<Boolean> createUpdatesPost(Boolean value) {
        return new JAXBElement<Boolean>(_UpdatesPost_QNAME, Boolean.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EventId", scope = Updates.class)
    public JAXBElement<String> createUpdatesEventId(String value) {
        return new JAXBElement<String>(_StatusChangeEventId_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Data", scope = Updates.class)
    public JAXBElement<String> createUpdatesData(String value) {
        return new JAXBElement<String>(_UpdatesData_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceIds", scope = Updates.class)
    public JAXBElement<String> createUpdatesSourceIds(String value) {
        return new JAXBElement<String>(_StatusChangeSourceIds_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Section", scope = Updates.class)
    public JAXBElement<String> createUpdatesSection(String value) {
        return new JAXBElement<String>(_UpdatesSection_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Track", scope = Updates.class)
    public JAXBElement<String> createUpdatesTrack(String value) {
        return new JAXBElement<String>(_UpdatesTrack_QNAME, String.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RaceId", scope = Updates.class)
    public JAXBElement<Integer> createUpdatesRaceId(Integer value) {
        return new JAXBElement<Integer>(_StatusChangeRaceId_QNAME, Integer.class, Updates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Source", scope = Updates.class)
    public JAXBElement<String> createUpdatesSource(String value) {
        return new JAXBElement<String>(_StatusChangeSource_QNAME, String.class, Updates.class, value);
    }

}
