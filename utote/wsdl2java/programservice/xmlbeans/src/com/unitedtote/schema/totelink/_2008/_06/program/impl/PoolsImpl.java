/*
 * XML Type:  Pools
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Pools
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Pools(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class PoolsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Pools
{
    
    public PoolsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOL$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Pool");
    
    
    /**
     * Gets array of all "Pool" elements
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pool[] getPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POOL$0, targetList);
            com.unitedtote.schema.totelink._2008._06.program.Pool[] result = new com.unitedtote.schema.totelink._2008._06.program.Pool[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Pool" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pool getPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Pool" element
     */
    public boolean isNilPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Pool" element
     */
    public int sizeOfPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOL$0);
        }
    }
    
    /**
     * Sets array of all "Pool" element
     */
    public void setPoolArray(com.unitedtote.schema.totelink._2008._06.program.Pool[] poolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poolArray, POOL$0);
        }
    }
    
    /**
     * Sets ith "Pool" element
     */
    public void setPoolArray(int i, com.unitedtote.schema.totelink._2008._06.program.Pool pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pool);
        }
    }
    
    /**
     * Nils the ith "Pool" element
     */
    public void setNilPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Pool" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pool insertNewPool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pool target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pool)get_store().insert_element_user(POOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Pool" element
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
     * Removes the ith "Pool" element
     */
    public void removePool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOL$0, i);
        }
    }
}
