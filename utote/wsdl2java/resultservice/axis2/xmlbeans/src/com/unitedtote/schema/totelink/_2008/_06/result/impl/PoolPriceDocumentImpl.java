/*
 * An XML document type.
 * Localname: PoolPrice
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PoolPriceDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one PoolPrice(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PoolPriceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PoolPriceDocument
{
    
    public PoolPriceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLPRICE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrice");
    
    
    /**
     * Gets the "PoolPrice" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrice getPoolPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolPrice" element
     */
    public boolean isNilPoolPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PoolPrice" element
     */
    public void setPoolPrice(com.unitedtote.schema.totelink._2008._06.result.PoolPrice poolPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().add_element_user(POOLPRICE$0);
            }
            target.set(poolPrice);
        }
    }
    
    /**
     * Appends and returns a new empty "PoolPrice" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrice addNewPoolPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().add_element_user(POOLPRICE$0);
            return target;
        }
    }
    
    /**
     * Nils the "PoolPrice" element
     */
    public void setNilPoolPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().add_element_user(POOLPRICE$0);
            }
            target.setNil();
        }
    }
}
