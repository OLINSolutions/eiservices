
package com.unitedtote.schema.totelink.faults._2008._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitedtote.schema.totelink.faults._2008._10 package. 
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

    private final static QName _ToteLinkFault_QNAME = new QName("http://schema.unitedtote.com/ToteLink/Faults/2008/10", "ToteLinkFault");
    private final static QName _ToteLinkFaultMessage_QNAME = new QName("http://schema.unitedtote.com/ToteLink/Faults/2008/10", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitedtote.schema.totelink.faults._2008._10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ToteLinkFault }
     * 
     */
    public ToteLinkFault createToteLinkFault() {
        return new ToteLinkFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToteLinkFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/Faults/2008/10", name = "ToteLinkFault")
    public JAXBElement<ToteLinkFault> createToteLinkFault(ToteLinkFault value) {
        return new JAXBElement<ToteLinkFault>(_ToteLinkFault_QNAME, ToteLinkFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/Faults/2008/10", name = "Message", scope = ToteLinkFault.class)
    public JAXBElement<String> createToteLinkFaultMessage(String value) {
        return new JAXBElement<String>(_ToteLinkFaultMessage_QNAME, String.class, ToteLinkFault.class, value);
    }

}
