/*
 * XML Type:  Finishers
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.Finishers
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML Finishers(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class FinishersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.Finishers
{
    
    public FinishersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINISHER$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finisher");
    
    
    /**
     * Gets array of all "Finisher" elements
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher[] getFinisherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FINISHER$0, targetList);
            com.unitedtote.schema.totelink._2008._06.result.Finisher[] result = new com.unitedtote.schema.totelink._2008._06.result.Finisher[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Finisher" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher getFinisherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Finisher" element
     */
    public boolean isNilFinisherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Finisher" element
     */
    public int sizeOfFinisherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINISHER$0);
        }
    }
    
    /**
     * Sets array of all "Finisher" element
     */
    public void setFinisherArray(com.unitedtote.schema.totelink._2008._06.result.Finisher[] finisherArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(finisherArray, FINISHER$0);
        }
    }
    
    /**
     * Sets ith "Finisher" element
     */
    public void setFinisherArray(int i, com.unitedtote.schema.totelink._2008._06.result.Finisher finisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(finisher);
        }
    }
    
    /**
     * Nils the ith "Finisher" element
     */
    public void setNilFinisherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Finisher" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher insertNewFinisher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().insert_element_user(FINISHER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Finisher" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher addNewFinisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().add_element_user(FINISHER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Finisher" element
     */
    public void removeFinisher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINISHER$0, i);
        }
    }
}
