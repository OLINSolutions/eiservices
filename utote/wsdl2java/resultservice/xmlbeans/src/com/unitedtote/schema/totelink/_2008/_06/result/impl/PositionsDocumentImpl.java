/*
 * An XML document type.
 * Localname: Positions
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PositionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one Positions(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PositionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PositionsDocument
{
    
    public PositionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITIONS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Positions");
    
    
    /**
     * Gets the "Positions" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Positions getPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Positions" element
     */
    public boolean isNilPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Positions" element
     */
    public void setPositions(com.unitedtote.schema.totelink._2008._06.result.Positions positions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            }
            target.set(positions);
        }
    }
    
    /**
     * Appends and returns a new empty "Positions" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Positions addNewPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Positions" element
     */
    public void setNilPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            }
            target.setNil();
        }
    }
}
