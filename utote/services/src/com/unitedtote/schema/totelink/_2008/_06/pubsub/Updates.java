
/**
 * Updates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

package com.unitedtote.schema.totelink._2008._06.pubsub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Updates bean class
 */
@SuppressWarnings({ "unchecked", "unused", "serial" })

public class Updates implements org.apache.axis2.databinding.ADBBean {

	private static final Logger log4j = LogManager.getLogger(Updates.class.getName());

	/*
	 * This type was generated from the piece of schema that had name = Updates
	 * Namespace URI = http://schema.unitedtote.com/ToteLink/2008/06/PubSub
	 * Namespace Prefix = ns1
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
	 * field for Type
	 */

	protected java.lang.String localType;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getType() {
		return localType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Type
	 */
	public void setType(java.lang.String param) {

		this.localType = param;

	}

	/**
	 * field for Data
	 */

	protected java.lang.String localData;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDataTracker = false;

	public boolean isDataSpecified() {
		return localDataTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getData() {
		return localData;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Data
	 */
	public void setData(java.lang.String param) {
		localDataTracker = true;

		this.localData = param;

	}

	/**
	 * field for Section
	 */

	protected java.lang.String localSection;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSectionTracker = false;

	public boolean isSectionSpecified() {
		return localSectionTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSection() {
		return localSection;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Section
	 */
	public void setSection(java.lang.String param) {
		localSectionTracker = true;

		this.localSection = param;

	}

	/**
	 * field for Group
	 */

	protected java.lang.String localGroup;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localGroupTracker = false;

	public boolean isGroupSpecified() {
		return localGroupTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getGroup() {
		return localGroup;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Group
	 */
	public void setGroup(java.lang.String param) {
		localGroupTracker = true;

		this.localGroup = param;

	}

	/**
	 * field for Track
	 */

	protected java.lang.String localTrack;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTrackTracker = false;

	public boolean isTrackSpecified() {
		return localTrackTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTrack() {
		return localTrack;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Track
	 */
	public void setTrack(java.lang.String param) {
		localTrackTracker = true;

		this.localTrack = param;

	}

	/**
	 * field for Post
	 */

	protected boolean localPost;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPostTracker = false;

	public boolean isPostSpecified() {
		return localPostTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getPost() {
		return localPost;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Post
	 */
	public void setPost(boolean param) {
		localPostTracker = true;

		this.localPost = param;

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
	 * field for TrackCode
	 */

	protected java.lang.String localTrackCode;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTrackCodeTracker = false;

	public boolean isTrackCodeSpecified() {
		return localTrackCodeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTrackCode() {
		return localTrackCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TrackCode
	 */
	public void setTrackCode(java.lang.String param) {
		localTrackCodeTracker = true;

		this.localTrackCode = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

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
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Updates",
						xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Updates", xmlWriter);
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

		namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
		writeStartElement(null, namespace, "Type", xmlWriter);

		if (localType == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localType);

		}

		xmlWriter.writeEndElement();
		if (localDataTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "Data", xmlWriter);

			if (localData == null) {
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localData);

			}

			xmlWriter.writeEndElement();
		}
		if (localSectionTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "Section", xmlWriter);

			if (localSection == null) {
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localSection);

			}

			xmlWriter.writeEndElement();
		}
		if (localGroupTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "Group", xmlWriter);

			if (localGroup == null) {
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localGroup);

			}

			xmlWriter.writeEndElement();
		}
		if (localTrackTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "Track", xmlWriter);

			if (localTrack == null) {
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localTrack);

			}

			xmlWriter.writeEndElement();
		}
		if (localPostTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "Post", xmlWriter);

			if (false) {

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPost));
			}

			xmlWriter.writeEndElement();
		}
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
		if (localTrackCodeTracker) {
			namespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub";
			writeStartElement(null, namespace, "TrackCode", xmlWriter);

			if (localTrackCode == null) {
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localTrackCode);

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
				if (uri == null || uri.length() == 0) {
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

		elementList.add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Type"));

		elementList.add(
				localType == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
		if (localDataTracker) {
			elementList
					.add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Data"));

			elementList.add(localData == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localData));
		}
		if (localSectionTracker) {
			elementList.add(
					new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Section"));

			elementList.add(localSection == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSection));
		}
		if (localGroupTracker) {
			elementList.add(
					new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Group"));

			elementList.add(localGroup == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup));
		}
		if (localTrackTracker) {
			elementList.add(
					new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Track"));

			elementList.add(localTrack == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrack));
		}
		if (localPostTracker) {
			elementList
					.add(new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "Post"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPost));
		}
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
		if (localSourceIdsTracker) {
			elementList.add(
					new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "SourceIds"));

			elementList.add(localSourceIds == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceIds));
		}
		if (localTrackCodeTracker) {
			elementList.add(
					new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "TrackCode"));

			elementList.add(localTrackCode == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrackCode));
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
		public static final QName QN_TYPE = new QName(NS1,"Type");
		public static final QName QN_DATA = new QName(NS1,"Data");
		public static final QName QN_SECTION = new QName(NS1,"Section");
		public static final QName QN_GROUP = new QName(NS1,"Group");
		public static final QName QN_TRACK = new QName(NS1,"Track");
		public static final QName QN_POST = new QName(NS1,"Post");
		public static final QName QN_EVENTID = new QName(NS1,"EventId");
		public static final QName QN_RACEID = new QName(NS1,"RaceId");
		public static final QName QN_SOURCE = new QName(NS1,"Source");
		public static final QName QN_SOURCEIDS = new QName(NS1,"SourceIds");
		public static final QName QN_TRACKCODE = new QName(NS1,"TrackCode");

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
		public static Updates parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			Updates object = new Updates();

			int numRequired = 0;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				// Verify <Updates> is first element.
				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();
				log4j.debug("Updates - Looking for Element = {}, found = {}", "Updates", reader.getName());

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						log4j.debug("Updates - fullTypeName = {}", fullTypeName);
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"Updates".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							log4j.debug(
									"Updates - Could not find opening Updates element.  Delegating to org.tempuri.imports.ExtensionMapper.getTypeObject({}, {}, reader)",
									nsUri, type);
							return (Updates) org.tempuri.imports.ExtensionMapper.getTypeObject(nsUri, type, reader);
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
						QN_TYPE
						));

				// Initialize required element list
				ArrayList<QName> allQNs = new ArrayList<>(Arrays.asList(
						QN_SITEID,
						QN_RUNID,
						QN_MESSAGETIME,
						QN_TRANSACTIONTIME,
						QN_TYPE,
						QN_DATA,
						QN_SECTION,
						QN_GROUP,
						QN_TRACK,
						QN_POST,
						QN_EVENTID,
						QN_RACEID, 
						QN_SOURCE,
						QN_SOURCEIDS,
						QN_TRACKCODE
						));

				boolean done = false;
				while (!done) {

					// Get next element
					while (!reader.isStartElement() && !reader.isEndElement() && reader.hasNext())
						reader.next();
					log4j.trace("Updates - In while loop, Element={}", reader.getName());

					if (reader.isEndElement()) {
						// We are done!
						log4j.debug("Updates - Found End element, exiting while loop");
						done = true;
						break;
					}

					if (!reader.isStartElement()) {
						// A start element was expected, but was not what we encountered.
						throw new org.apache.axis2.databinding.ADBException(
								"Updates.Factory.parse - Unexpected subelement " + reader.getName());
					}
					
					// Is it an expected element
					if (!allQNs.contains(reader.getName())) {
						// A start element was expected, but was not what we encountered.
						throw new org.apache.axis2.databinding.ADBException(
								"Updates.Factory.parse - Unexpected Element QN " + reader.getName());
						
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
					} else if (QN_TYPE.equals(reader.getName())) {
						object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
						// Remove found requirement
						requiredQN.remove(QN_TYPE);
					} else if (QN_DATA.equals(reader.getName())) {
						object.setData(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_SECTION.equals(reader.getName())) {
						object.setSection(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_GROUP.equals(reader.getName())) {
						object.setGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_TRACK.equals(reader.getName())) {
						object.setTrack(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_POST.equals(reader.getName())) {
						object.setPost(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
					} else if (QN_EVENTID.equals(reader.getName())) {
						object.setEventId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_RACEID.equals(reader.getName())) {
						object.setRaceId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
					} else if (QN_SOURCE.equals(reader.getName())) {
						object.setSource(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_SOURCEIDS.equals(reader.getName())) {
						object.setSource(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					} else if (QN_TRACKCODE.equals(reader.getName())) {
						object.setTrackCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
					}
					
					// Done with this node, on to the next
					reader.next();

				}

				log4j.debug("Updates - After Element search loop");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Updates [");
		if (localSiteId != null)
			builder.append("localSiteId=").append(localSiteId).append(", ");
		if (localRunId != null)
			builder.append("localRunId=").append(localRunId).append(", ");
		if (localMessageTime != null)
			builder.append("localMessageTime=").append(localMessageTime).append(", ");
		if (localTransactionTime != null)
			builder.append("localTransactionTime=").append(localTransactionTime).append(", ");
		if (localType != null)
			builder.append("localType=").append(localType).append(", ");
		if (localData != null)
			builder.append("localData=").append(localData).append(", ");
		builder.append("localDataTracker=").append(localDataTracker).append(", ");
		if (localSection != null)
			builder.append("localSection=").append(localSection).append(", ");
		builder.append("localSectionTracker=").append(localSectionTracker).append(", ");
		if (localGroup != null)
			builder.append("localGroup=").append(localGroup).append(", ");
		builder.append("localGroupTracker=").append(localGroupTracker).append(", ");
		if (localTrack != null)
			builder.append("localTrack=").append(localTrack).append(", ");
		builder.append("localTrackTracker=").append(localTrackTracker).append(", localPost=").append(localPost)
				.append(", localPostTracker=").append(localPostTracker).append(", ");
		if (localEventId != null)
			builder.append("localEventId=").append(localEventId).append(", ");
		builder.append("localEventIdTracker=").append(localEventIdTracker).append(", localRaceId=").append(localRaceId)
				.append(", localRaceIdTracker=").append(localRaceIdTracker).append(", ");
		if (localSource != null)
			builder.append("localSource=").append(localSource).append(", ");
		builder.append("localSourceTracker=").append(localSourceTracker).append(", ");
		if (localSourceIds != null)
			builder.append("localSourceIds=").append(localSourceIds).append(", ");
		builder.append("localSourceIdsTracker=").append(localSourceIdsTracker).append(", ");
		if (localTrackCode != null)
			builder.append("localTrackCode=").append(localTrackCode).append(", ");
		builder.append("localTrackCodeTracker=").append(localTrackCodeTracker).append("]");
		return builder.toString();
	}

}
