/*
 * An XML document type.
 * Localname: Runner
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RunnerDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Runner(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RunnerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RunnerDocument
{
    
    public RunnerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNNER$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Runner");
    
    
    /**
     * Gets the "Runner" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runner getRunner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Runner" element
     */
    public boolean isNilRunner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Runner" element
     */
    public void setRunner(com.unitedtote.schema.totelink._2008._06.program.Runner runner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().add_element_user(RUNNER$0);
            }
            target.set(runner);
        }
    }
    
    /**
     * Appends and returns a new empty "Runner" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runner addNewRunner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().add_element_user(RUNNER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Runner" element
     */
    public void setNilRunner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().add_element_user(RUNNER$0);
            }
            target.setNil();
        }
    }
}
