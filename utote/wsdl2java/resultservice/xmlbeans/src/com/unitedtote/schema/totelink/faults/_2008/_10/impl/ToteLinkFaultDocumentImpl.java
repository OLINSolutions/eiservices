/*
 * An XML document type.
 * Localname: ToteLinkFault
 * Namespace: http://schema.unitedtote.com/ToteLink/Faults/2008/10
 * Java type: com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink.faults._2008._10.impl;
/**
 * A document containing one ToteLinkFault(@http://schema.unitedtote.com/ToteLink/Faults/2008/10) element.
 *
 * This is a complex type.
 */
public class ToteLinkFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFaultDocument
{
    
    public ToteLinkFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTELINKFAULT$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/Faults/2008/10", "ToteLinkFault");
    
    
    /**
     * Gets the "ToteLinkFault" element
     */
    public com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault getToteLinkFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault target = null;
            target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().find_element_user(TOTELINKFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ToteLinkFault" element
     */
    public boolean isNilToteLinkFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault target = null;
            target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().find_element_user(TOTELINKFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ToteLinkFault" element
     */
    public void setToteLinkFault(com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault toteLinkFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault target = null;
            target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().find_element_user(TOTELINKFAULT$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().add_element_user(TOTELINKFAULT$0);
            }
            target.set(toteLinkFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ToteLinkFault" element
     */
    public com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault addNewToteLinkFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault target = null;
            target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().add_element_user(TOTELINKFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ToteLinkFault" element
     */
    public void setNilToteLinkFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault target = null;
            target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().find_element_user(TOTELINKFAULT$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault)get_store().add_element_user(TOTELINKFAULT$0);
            }
            target.setNil();
        }
    }
}
