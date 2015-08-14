/*
 * XML Type:  Positions
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.Positions
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML Positions(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PositionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.Positions
{
    
    public PositionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Position");
    
    
    /**
     * Gets array of all "Position" elements
     */
    public com.unitedtote.schema.totelink._2008._06.result.Position[] getPositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSITION$0, targetList);
            com.unitedtote.schema.totelink._2008._06.result.Position[] result = new com.unitedtote.schema.totelink._2008._06.result.Position[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Position" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Position getPositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Position" element
     */
    public boolean isNilPositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Position" element
     */
    public int sizeOfPositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$0);
        }
    }
    
    /**
     * Sets array of all "Position" element
     */
    public void setPositionArray(com.unitedtote.schema.totelink._2008._06.result.Position[] positionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(positionArray, POSITION$0);
        }
    }
    
    /**
     * Sets ith "Position" element
     */
    public void setPositionArray(int i, com.unitedtote.schema.totelink._2008._06.result.Position position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(position);
        }
    }
    
    /**
     * Nils the ith "Position" element
     */
    public void setNilPositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Position" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Position insertNewPosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().insert_element_user(POSITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Position" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Position addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Position" element
     */
    public void removePosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$0, i);
        }
    }
}
