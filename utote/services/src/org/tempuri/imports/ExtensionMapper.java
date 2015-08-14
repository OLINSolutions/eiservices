
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

package org.tempuri.imports;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ExtensionMapper class
 */

public class ExtensionMapper {

	private static final Logger log4j = LogManager.getLogger(ExtensionMapper.class.getName());
	
	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
		log4j.debug("getTypeObject - Atempting to parse {} : {}", namespaceURI, typeName);

		if ("http://tempuri.org/".equals(namespaceURI) && "UpdateNotification".equals(typeName)) {

			log4j.debug("getTypeObject - parsing an org.tempuri.UpdateNotification");
			return org.tempuri.UpdateNotification.Factory.parse(reader);

		}

		if ("http://schema.unitedtote.com/ToteLink/2008/06/PubSub".equals(namespaceURI)
				&& "StatusChange".equals(typeName)) {

			log4j.debug("getTypeObject - parsing a com.unitedtote.schema.totelink._2008._06.pubsub.StatusChange");
			return com.unitedtote.schema.totelink._2008._06.pubsub.StatusChange.Factory.parse(reader);

		}

		if ("http://tempuri.org/".equals(namespaceURI) && "StatusNotification".equals(typeName)) {

			log4j.debug("getTypeObject - parsing an org.tempuri.StatusNotification");
			return org.tempuri.StatusNotification.Factory.parse(reader);

		}

		if ("http://schema.unitedtote.com/ToteLink/2008/06/PubSub".equals(namespaceURI) && "Updates".equals(typeName)) {

			log4j.debug("getTypeObject - parsing a com.unitedtote.schema.totelink._2008._06.pubsub.Updates");
			return com.unitedtote.schema.totelink._2008._06.pubsub.Updates.Factory.parse(reader);

		}

		log4j.debug("getTypeObject - about to throw ADBException - Unsupported type");
		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
