/*
 * An XML document type.
 * Localname: Prices
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PricesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one Prices(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PricesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PricesDocument
{
    
    public PricesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Prices");
    
    
    /**
     * Gets the "Prices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Prices getPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Prices" element
     */
    public boolean isNilPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Prices" element
     */
    public void setPrices(com.unitedtote.schema.totelink._2008._06.result.Prices prices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            }
            target.set(prices);
        }
    }
    
    /**
     * Appends and returns a new empty "Prices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Prices addNewPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Prices" element
     */
    public void setNilPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            }
            target.setNil();
        }
    }
}
