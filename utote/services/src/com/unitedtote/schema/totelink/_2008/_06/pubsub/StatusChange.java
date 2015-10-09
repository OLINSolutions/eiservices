
/**
 * StatusChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

package com.unitedtote.schema.totelink._2008._06.pubsub;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.service.handler.ToteLinkUpdateServiceHandler;

/**
 * StatusChange bean class
 */
@SuppressWarnings({ "unchecked", "unused", "serial" })

public class StatusChange implements org.apache.axis2.databinding.ADBBean {

    private static final Logger log4j = LogManager.getLogger(StatusChange.class.getName());

    /*
     * This type was generated from the piece of schema that had name =
     * StatusChange Namespace URI =
     * http://schema.unitedtote.com/ToteLink/2008/06/PubSub Namespace Prefix =
     * ns1
     */

    /**
     * field for SiteId
     */

    protected java.lang.String localSiteId;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSiteId() {
        return localSiteId;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            SiteId
     */
    public void setSiteId(java.lang.String param) {

        this.localSiteId = param;

    }

    /**
     * field for RunId
     */

    protected java.lang.String localRunId;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRunId() {
        return localRunId;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            RunId
     */
    public void setRunId(java.lang.String param) {

        this.localRunId = param;

    }

    /**
     * field for MessageTime
     */

    protected java.util.Calendar localMessageTime;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getMessageTime() {
        return localMessageTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            MessageTime
     */
    public void setMessageTime(java.util.Calendar param) {

        this.localMessageTime = param;

    }

    /**
     * field for TransactionTime
     */

    protected java.util.Calendar localTransactionTime;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTransactionTime() {
        return localTransactionTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            TransactionTime
     */
    public void setTransactionTime(java.util.Calendar param) {

        this.localTransactionTime = param;

    }

    /**
     * field for EventId
     */

    protected java.lang.String localEventId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEventIdTracker = false;

    public boolean isEventIdSpecified() {
        return localEventIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEventId() {
        return localEventId;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            EventId
     */
    public void setEventId(java.lang.String param) {
        localEventIdTracker = true;

        this.localEventId = param;

    }

    /**
     * field for RaceId
     */

    protected int localRaceId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRaceIdTracker = false;

    public boolean isRaceIdSpecified() {
        return localRaceIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getRaceId() {
        return localRaceId;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            RaceId
     */
    public void setRaceId(int param) {
        localRaceIdTracker = true;

        this.localRaceId = param;

    }

    /**
     * field for Source
     */

    protected java.lang.String localSource;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSourceTracker = false;

    public boolean isSourceSpecified() {
        return localSourceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSource() {
        return localSource;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Source
     */
    public void setSource(java.lang.String param) {
        localSourceTracker = true;

        this.localSource = param;

    }

    /**
     * field for Action
     */

    protected java.lang.String localAction;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAction() {
        return localAction;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Action
     */
    public void setAction(java.lang.String param) {

        this.localAction = param;

    }

    /**
     * field for Status
     */

    protected java.lang.String localStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStatusTracker = false;

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Status
     */
    public void setStatus(java.lang.String param) {
        localStatusTracker = true;

        this.localStatus = param;

    }

    /**
     * field for MTP
     */

    protected long localMTP;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMTPTracker = false;

    public boolean isMTPSpecified() {
        return localMTPTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getMTP() {
        return localMTP;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            MTP
     */
    public void setMTP(long param) {
        localMTPTracker = true;

        this.localMTP = param;

    }

    /**
     * field for SourceIds
     */

    protected java.lang.String localSourceIds;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSourceIdsTracker = false;

    public boolean isSourceIdsSpecified() {
        return localSourceIdsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSourceIds() {
        return localSourceIds;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            SourceIds
     */
    public void setSourceIds(java.lang.String param) {
        localSourceIdsTracker = true;

        this.localSourceIds = param;

    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    @Override
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
                    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://schema.unitedtote.com/ToteLink/2008/06/PubSub");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":StatusChange", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "StatusChange", xmlWriter);
            }

        }

        namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        writeStartElement(null, namespace, "SiteId", xmlWriter);

        if (localSiteId == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(localSiteId);

        }

        xmlWriter.writeEndElement();

        namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        writeStartElement(null, namespace, "RunId", xmlWriter);

        if (localRunId == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(localRunId);

        }

        xmlWriter.writeEndElement();

        namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        writeStartElement(null, namespace, "MessageTime", xmlWriter);

        if (localMessageTime == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageTime));

        }

        xmlWriter.writeEndElement();

        namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        writeStartElement(null, namespace, "TransactionTime", xmlWriter);

        if (localTransactionTime == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTime));

        }

        xmlWriter.writeEndElement();
        if (localEventIdTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "EventId", xmlWriter);

            if (localEventId == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localEventId);

            }

            xmlWriter.writeEndElement();
        }
        if (localRaceIdTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "RaceId", xmlWriter);

            if (localRaceId == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {
                xmlWriter
                .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRaceId));
            }

            xmlWriter.writeEndElement();
        }
        if (localSourceTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "Source", xmlWriter);

            if (localSource == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSource);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        writeStartElement(null, namespace, "Action", xmlWriter);

        if (localAction == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(localAction);

        }

        xmlWriter.writeEndElement();
        if (localStatusTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "Status", xmlWriter);

            if (localStatus == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localMTPTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "MTP", xmlWriter);

            if (localMTP == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMTP));
            }

            xmlWriter.writeEndElement();
        }
        if (localSourceIdsTracker) {
            namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
            writeStartElement(null, namespace, "SourceIds", xmlWriter);

            if (localSourceIds == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSourceIds);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://schema.unitedtote.com/ToteLink/2008/06/PubSub")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                    throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                    throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(
                        prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not
            // possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                        .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite
                        .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     *
     */

    @Override
    @SuppressWarnings("rawtypes")
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        elementList
        .add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "SiteId"));

        elementList.add(localSiteId == null ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteId));

        elementList.add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "RunId"));

        elementList.add(localRunId == null ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRunId));

        elementList.add(
                new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "MessageTime"));

        elementList.add(localMessageTime == null ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageTime));

        elementList.add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub",
                "TransactionTime"));

        elementList.add(localTransactionTime == null ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTime));
        if (localEventIdTracker) {
            elementList.add(
                    new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "EventId"));

            elementList.add(localEventId == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventId));
        }
        if (localRaceIdTracker) {
            elementList.add(
                    new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "RaceId"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRaceId));
        }
        if (localSourceTracker) {
            elementList.add(
                    new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Source"));

            elementList.add(localSource == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource));
        }
        elementList
        .add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Action"));

        elementList.add(localAction == null ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAction));
        if (localStatusTracker) {
            elementList.add(
                    new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Status"));

            elementList.add(localStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
        }
        if (localMTPTracker) {
            elementList
            .add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "MTP"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMTP));
        }
        if (localSourceIdsTracker) {
            elementList.add(
                    new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "SourceIds"));

            elementList.add(localSourceIds == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceIds));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        public static final String NS1 = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
        public static final QName QN_SITEID = new QName(NS1,"SiteId");
        public static final QName QN_RUNID = new QName(NS1,"RunId");
        public static final QName QN_MESSAGETIME = new QName(NS1,"MessageTime");
        public static final QName QN_TRANSACTIONTIME = new QName(NS1,"TransactionTime");
        public static final QName QN_EVENTID = new QName(NS1,"EventId");
        public static final QName QN_RACEID = new QName(NS1,"RaceId");
        public static final QName QN_SOURCE = new QName(NS1,"Source");
        public static final QName QN_ACTION = new QName(NS1,"Action");
        public static final QName QN_STATUS = new QName(NS1,"Status");
        public static final QName QN_MTP = new QName(NS1,"MTP");
        public static final QName QN_SOURCEIDS = new QName(NS1,"SourceIds");

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static StatusChange parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            StatusChange object = new StatusChange();

            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                // Verify <Updates> is first element.
                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }
                log4j.trace("StatusChange.Factory.parse - Looking for Element = {}, found = {}", "StatusChange", reader.getName());

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader
                            .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        log4j.trace("StatusChange.Factory.parse - fullTypeName = {}", fullTypeName);
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"StatusChange".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            log4j.trace(
                                    "StatusChange.Factory.parse - Could not find opening StatusChange element.  Delegating to org.tempuri.imports.ExtensionMapper.getTypeObject({}, {}, reader)",
                                    nsUri, type);
                            return (StatusChange) org.tempuri.imports.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Skip the current tag
                reader.next();

                // Initialize required element list
                ArrayList<QName> requiredQN = new ArrayList<>(Arrays.asList(
                        QN_SITEID,
                        QN_RUNID,
                        QN_MESSAGETIME,
                        QN_TRANSACTIONTIME,
                        QN_ACTION
                        ));

                // Initialize required element list
                ArrayList<QName> allQNs = new ArrayList<>(Arrays.asList(
                        QN_SITEID,
                        QN_RUNID,
                        QN_MESSAGETIME,
                        QN_TRANSACTIONTIME,
                        QN_EVENTID,
                        QN_RACEID,
                        QN_SOURCE,
                        QN_ACTION,
                        QN_STATUS,
                        QN_MTP,
                        QN_SOURCEIDS
                        ));

                boolean done = false;
                while (!done) {

                    // Get next element
                    while (!reader.isStartElement() && !reader.isEndElement() && reader.hasNext()) {
                        reader.next();
                    }
                    log4j.trace("StatusChange.Factory.parse - In while loop, Element = {}", reader.getName());

                    if (reader.isEndElement()) {
                        // We are done!
                        log4j.trace("StatusChange.Factory.parse - Found End element, exiting while loop");
                        done = true;
                        break;
                    }

                    if (!reader.isStartElement()) {
                        // A start element was expected, but was not what we encountered.
                        throw new org.apache.axis2.databinding.ADBException(
                                "StatusChange.Factory.parse - Unexpected subelement " + reader.getName());
                    }

                    // Is it an expected element
                    if (!allQNs.contains(reader.getName())) {
                        // A start element was expected, but was not what we encountered.
                        throw new org.apache.axis2.databinding.ADBException(
                                "StatusChange.Factory.parse - Unexpected Element QN " + reader.getName());

                    }

                    // See if it is nil'able
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        reader.getElementText(); // throw away text nodes if any
                        reader.next();
                        continue;
                    }

                    java.lang.String content = reader.getElementText();
                    if (QN_SITEID.equals(reader.getName())) {
                        object.setSiteId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                        // Remove found requirement
                        requiredQN.remove(QN_SITEID);
                    } else if (QN_RUNID.equals(reader.getName())) {
                        if (null == content) {
                            content = Integer.toString(ToteLinkUpdateServiceHandler.getLastRunId());
                        }
                        object.setRunId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                        // Remove found requirement
                        requiredQN.remove(QN_RUNID);
                    } else if (QN_MESSAGETIME.equals(reader.getName())) {
                        object.setMessageTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                        // Remove found requirement
                        requiredQN.remove(QN_MESSAGETIME);
                    } else if (QN_TRANSACTIONTIME.equals(reader.getName())) {
                        object.setTransactionTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                        // Remove found requirement
                        requiredQN.remove(QN_TRANSACTIONTIME);
                    } else if (QN_EVENTID.equals(reader.getName())) {
                        object.setEventId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    } else if (QN_RACEID.equals(reader.getName())) {
                        object.setRaceId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                    } else if (QN_SOURCE.equals(reader.getName())) {
                        object.setSource(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    } else if (QN_ACTION.equals(reader.getName())) {
                        object.setAction(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                        // Remove found requirement
                        requiredQN.remove(QN_ACTION);
                    } else if (QN_STATUS.equals(reader.getName())) {
                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    } else if (QN_MTP.equals(reader.getName())) {
                        object.setMTP(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    } else if (QN_SOURCEIDS.equals(reader.getName())) {
                        object.setSource(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    }

                    // Done with this node, on to the next
                    reader.next();

                }

                log4j.trace("Updates - After Element search loop");
                if (requiredQN.size() > 0) {
                    throw new org.apache.axis2.databinding.ADBException(
                            "Updates.Factory.parse - Missing required element(s): " + requiredQN.toString());
                }

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            log4j.exit(object);
            return object;
        }

    }// end of factory class

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StatusChange [");
        if (localSiteId != null) {
            builder.append("localSiteId=").append(localSiteId).append(", ");
        }
        if (localRunId != null) {
            builder.append("localRunId=").append(localRunId).append(", ");
        }
        if (localMessageTime != null) {
            builder.append("localMessageTime=").append(localMessageTime).append(", ");
        }
        if (localTransactionTime != null) {
            builder.append("localTransactionTime=").append(localTransactionTime).append(", ");
        }
        if (localEventId != null) {
            builder.append("localEventId=").append(localEventId).append(", ");
        }
        builder.append("localEventIdTracker=").append(localEventIdTracker).append(", localRaceId=").append(localRaceId)
        .append(", localRaceIdTracker=").append(localRaceIdTracker).append(", ");
        if (localSource != null) {
            builder.append("localSource=").append(localSource).append(", ");
        }
        builder.append("localSourceTracker=").append(localSourceTracker).append(", ");
        if (localAction != null) {
            builder.append("localAction=").append(localAction).append(", ");
        }
        if (localStatus != null) {
            builder.append("localStatus=").append(localStatus).append(", ");
        }
        builder.append("localStatusTracker=").append(localStatusTracker).append(", localMTP=").append(localMTP)
        .append(", localMTPTracker=").append(localMTPTracker).append(", ");
        if (localSourceIds != null) {
            builder.append("localSourceIds=").append(localSourceIds).append(", ");
        }
        builder.append("localSourceIdsTracker=").append(localSourceIdsTracker).append("]");
        return builder.toString();
    }

}
