/*
 * An XML document type.
 * Localname: Position
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PositionDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one Position(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PositionDocument
{
    
    public PositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Position");
    
    
    /**
     * Gets the "Position" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Position getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Position" element
     */
    public boolean isNilPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(com.unitedtote.schema.totelink._2008._06.result.Position position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().add_element_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
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
     * Nils the "Position" element
     */
    public void setNilPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Position target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Position)get_store().add_element_user(POSITION$0);
            }
            target.setNil();
        }
    }
}
