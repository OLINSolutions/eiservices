/*
 * XML Type:  PoolPrices
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PoolPrices
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML PoolPrices(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PoolPricesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PoolPrices
{
    
    public PoolPricesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLPRICE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrice");
    
    
    /**
     * Gets array of all "PoolPrice" elements
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrice[] getPoolPriceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POOLPRICE$0, targetList);
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice[] result = new com.unitedtote.schema.totelink._2008._06.result.PoolPrice[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PoolPrice" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrice getPoolPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PoolPrice" element
     */
    public boolean isNilPoolPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PoolPrice" element
     */
    public int sizeOfPoolPriceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOLPRICE$0);
        }
    }
    
    /**
     * Sets array of all "PoolPrice" element
     */
    public void setPoolPriceArray(com.unitedtote.schema.totelink._2008._06.result.PoolPrice[] poolPriceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poolPriceArray, POOLPRICE$0);
        }
    }
    
    /**
     * Sets ith "PoolPrice" element
     */
    public void setPoolPriceArray(int i, com.unitedtote.schema.totelink._2008._06.result.PoolPrice poolPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(poolPrice);
        }
    }
    
    /**
     * Nils the ith "PoolPrice" element
     */
    public void setNilPoolPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().find_element_user(POOLPRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PoolPrice" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrice insertNewPoolPrice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrice target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrice)get_store().insert_element_user(POOLPRICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PoolPrice" element
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
     * Removes the ith "PoolPrice" element
     */
    public void removePoolPrice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOLPRICE$0, i);
        }
    }
}
