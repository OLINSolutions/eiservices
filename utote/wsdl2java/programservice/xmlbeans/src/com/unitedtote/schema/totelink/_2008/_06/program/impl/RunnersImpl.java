/*
 * XML Type:  Runners
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Runners
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Runners(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RunnersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Runners
{
    
    public RunnersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNNER$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Runner");
    
    
    /**
     * Gets array of all "Runner" elements
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runner[] getRunnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RUNNER$0, targetList);
            com.unitedtote.schema.totelink._2008._06.program.Runner[] result = new com.unitedtote.schema.totelink._2008._06.program.Runner[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Runner" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runner getRunnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Runner" element
     */
    public boolean isNilRunnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Runner" element
     */
    public int sizeOfRunnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNNER$0);
        }
    }
    
    /**
     * Sets array of all "Runner" element
     */
    public void setRunnerArray(com.unitedtote.schema.totelink._2008._06.program.Runner[] runnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(runnerArray, RUNNER$0);
        }
    }
    
    /**
     * Sets ith "Runner" element
     */
    public void setRunnerArray(int i, com.unitedtote.schema.totelink._2008._06.program.Runner runner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(runner);
        }
    }
    
    /**
     * Nils the ith "Runner" element
     */
    public void setNilRunnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().find_element_user(RUNNER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Runner" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runner insertNewRunner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runner target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runner)get_store().insert_element_user(RUNNER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Runner" element
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
     * Removes the ith "Runner" element
     */
    public void removeRunner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNNER$0, i);
        }
    }
}
