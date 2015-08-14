/*
 * XML Type:  Prices
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.Prices
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML Prices(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PricesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.Prices
{
    
    public PricesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Price");
    
    
    /**
     * Gets array of all "Price" elements
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity[] getPriceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRICE$0, targetList);
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity[] result = new com.unitedtote.schema.totelink._2008._06.result.PriceEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Price" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity getPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Price" element
     */
    public boolean isNilPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Price" element
     */
    public int sizeOfPriceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICE$0);
        }
    }
    
    /**
     * Sets array of all "Price" element
     */
    public void setPriceArray(com.unitedtote.schema.totelink._2008._06.result.PriceEntity[] priceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priceArray, PRICE$0);
        }
    }
    
    /**
     * Sets ith "Price" element
     */
    public void setPriceArray(int i, com.unitedtote.schema.totelink._2008._06.result.PriceEntity price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(price);
        }
    }
    
    /**
     * Nils the ith "Price" element
     */
    public void setNilPriceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Price" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity insertNewPrice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().insert_element_user(PRICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Price" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity addNewPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().add_element_user(PRICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Price" element
     */
    public void removePrice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICE$0, i);
        }
    }
}
