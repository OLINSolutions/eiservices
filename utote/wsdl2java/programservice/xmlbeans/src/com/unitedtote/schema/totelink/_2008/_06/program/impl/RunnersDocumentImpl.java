/*
 * An XML document type.
 * Localname: Runners
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RunnersDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Runners(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RunnersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RunnersDocument
{
    
    public RunnersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNNERS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Runners");
    
    
    /**
     * Gets the "Runners" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runners getRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Runners" element
     */
    public boolean isNilRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Runners" element
     */
    public void setRunners(com.unitedtote.schema.totelink._2008._06.program.Runners runners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$0);
            }
            target.set(runners);
        }
    }
    
    /**
     * Appends and returns a new empty "Runners" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runners addNewRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Runners" element
     */
    public void setNilRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$0);
            }
            target.setNil();
        }
    }
}
