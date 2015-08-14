/*
 * XML Type:  EntryChanges
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryChanges
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML EntryChanges(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EntryChangesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntryChanges
{
    
    public EntryChangesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Change");
    
    
    /**
     * Gets array of all "Change" elements
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange[] getChangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHANGE$0, targetList);
            com.unitedtote.schema.totelink._2008._06.program.EntryChange[] result = new com.unitedtote.schema.totelink._2008._06.program.EntryChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Change" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange getChangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(CHANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Change" element
     */
    public boolean isNilChangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(CHANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Change" element
     */
    public int sizeOfChangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGE$0);
        }
    }
    
    /**
     * Sets array of all "Change" element
     */
    public void setChangeArray(com.unitedtote.schema.totelink._2008._06.program.EntryChange[] changeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(changeArray, CHANGE$0);
        }
    }
    
    /**
     * Sets ith "Change" element
     */
    public void setChangeArray(int i, com.unitedtote.schema.totelink._2008._06.program.EntryChange change)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(CHANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(change);
        }
    }
    
    /**
     * Nils the ith "Change" element
     */
    public void setNilChangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(CHANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Change" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange insertNewChange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().insert_element_user(CHANGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Change" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange addNewChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().add_element_user(CHANGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Change" element
     */
    public void removeChange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGE$0, i);
        }
    }
}
