
package com.unitedtote.schema.totelink.totedatatypes._2008._04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitedtote.schema.totelink.totedatatypes._2008._04 package. 
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

    private final static QName _CompressedList_QNAME = new QName("http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04", "CompressedList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitedtote.schema.totelink.totedatatypes._2008._04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04", name = "CompressedList")
    public JAXBElement<String> createCompressedList(String value) {
        return new JAXBElement<String>(_CompressedList_QNAME, String.class, null, value);
    }

}
