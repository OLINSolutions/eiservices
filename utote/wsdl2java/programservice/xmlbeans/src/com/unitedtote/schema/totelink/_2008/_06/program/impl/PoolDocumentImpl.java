/*
 * An XML document type.
 * Localname: Pool
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.PoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Pool(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class PoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.PoolDocument
{
    
    public PoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOL$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Pool");
    
    
    /**
     * Gets the "Pool" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pool getPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Pool" element
     */
    public boolean isNilPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Pool" element
     */
    public void setPool(com.unitedtote.schema.totelink._2008._06.program.Pool pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().add_element_user(POOL$0);
            }
            target.set(pool);
        }
    }
    
    /**
     * Appends and returns a new empty "Pool" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pool addNewPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().add_element_user(POOL$0);
            return target;
        }
    }
    
    /**
     * Nils the "Pool" element
     */
    public void setNilPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().add_element_user(POOL$0);
            }
            target.setNil();
        }
    }
}
