/*
 * An XML document type.
 * Localname: TrackType
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.TrackTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one TrackType(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class TrackTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.TrackTypeDocument
{
    
    public TrackTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACKTYPE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackType");
    
    
    /**
     * Gets the "TrackType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum getTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.TrackType xgetTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackType" element
     */
    public boolean isNilTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TrackType" element
     */
    public void setTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum trackType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKTYPE$0);
            }
            target.setEnumValue(trackType);
        }
    }
    
    /**
     * Sets (as xml) the "TrackType" element
     */
    public void xsetTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType trackType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$0);
            }
            target.set(trackType);
        }
    }
    
    /**
     * Nils the "TrackType" element
     */
    public void setNilTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$0);
            }
            target.setNil();
        }
    }
}
