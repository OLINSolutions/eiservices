/*
 * An XML document type.
 * Localname: Pools
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.PoolsDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Pools(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class PoolsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.PoolsDocument
{
    
    public PoolsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Pools");
    
    
    /**
     * Gets the "Pools" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pools getPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Pools" element
     */
    public boolean isNilPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Pools" element
     */
    public void setPools(com.unitedtote.schema.totelink._2008._06.program.Pools pools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            }
            target.set(pools);
        }
    }
    
    /**
     * Appends and returns a new empty "Pools" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pools addNewPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Pools" element
     */
    public void setNilPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            }
            target.setNil();
        }
    }
}
