/*
 * XML Type:  Position
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.Position
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML Position(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.Position
{
    
    public PositionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINISHERS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finishers");
    private static final javax.xml.namespace.QName POSITIONID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PositionId");
    
    
    /**
     * Gets the "Finishers" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finishers getFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Finishers" element
     */
    public boolean isNilFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Finishers" element
     */
    public void setFinishers(com.unitedtote.schema.totelink._2008._06.result.Finishers finishers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            }
            target.set(finishers);
        }
    }
    
    /**
     * Appends and returns a new empty "Finishers" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finishers addNewFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Finishers" element
     */
    public void setNilFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "PositionId" element
     */
    public int getPositionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIONID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PositionId" element
     */
    public org.apache.xmlbeans.XmlInt xgetPositionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POSITIONID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PositionId" element
     */
    public void setPositionId(int positionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITIONID$2);
            }
            target.setIntValue(positionId);
        }
    }
    
    /**
     * Sets (as xml) the "PositionId" element
     */
    public void xsetPositionId(org.apache.xmlbeans.XmlInt positionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POSITIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(POSITIONID$2);
            }
            target.set(positionId);
        }
    }
}
