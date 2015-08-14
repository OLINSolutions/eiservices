/*
 * An XML document type.
 * Localname: ExchangeWagers
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.ExchangeWagersDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one ExchangeWagers(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class ExchangeWagersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.ExchangeWagersDocument
{
    
    public ExchangeWagersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCHANGEWAGERS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "ExchangeWagers");
    
    
    /**
     * Gets the "ExchangeWagers" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers.Enum getExchangeWagers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExchangeWagers" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers xgetExchangeWagers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExchangeWagers" element
     */
    public boolean isNilExchangeWagers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ExchangeWagers" element
     */
    public void setExchangeWagers(com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers.Enum exchangeWagers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGEWAGERS$0);
            }
            target.setEnumValue(exchangeWagers);
        }
    }
    
    /**
     * Sets (as xml) the "ExchangeWagers" element
     */
    public void xsetExchangeWagers(com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers exchangeWagers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().add_element_user(EXCHANGEWAGERS$0);
            }
            target.set(exchangeWagers);
        }
    }
    
    /**
     * Nils the "ExchangeWagers" element
     */
    public void setNilExchangeWagers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().find_element_user(EXCHANGEWAGERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.ExchangeWagers)get_store().add_element_user(EXCHANGEWAGERS$0);
            }
            target.setNil();
        }
    }
}
