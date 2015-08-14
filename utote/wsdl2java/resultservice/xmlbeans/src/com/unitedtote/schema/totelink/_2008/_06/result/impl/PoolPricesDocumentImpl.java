/*
 * An XML document type.
 * Localname: PoolPrices
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PoolPricesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one PoolPrices(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PoolPricesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PoolPricesDocument
{
    
    public PoolPricesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLPRICES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrices");
    
    
    /**
     * Gets the "PoolPrices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrices getPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolPrices" element
     */
    public boolean isNilPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PoolPrices" element
     */
    public void setPoolPrices(com.unitedtote.schema.totelink._2008._06.result.PoolPrices poolPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$0);
            }
            target.set(poolPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "PoolPrices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrices addNewPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$0);
            return target;
        }
    }
    
    /**
     * Nils the "PoolPrices" element
     */
    public void setNilPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$0);
            }
            target.setNil();
        }
    }
}
