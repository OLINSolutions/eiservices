/*
 * XML Type:  Runner
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Runner
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Runner(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RunnerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Runner
{
    
    public RunnerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNNERID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RunnerId");
    private static final javax.xml.namespace.QName ENTRIES$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Entries");
    private static final javax.xml.namespace.QName SCRATCH$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Scratch");
    private static final javax.xml.namespace.QName ODDS$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Odds");
    
    
    /**
     * Gets the "RunnerId" element
     */
    public int getRunnerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNERID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RunnerId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRunnerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RUNNERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RunnerId" element
     */
    public void setRunnerId(int runnerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNNERID$0);
            }
            target.setIntValue(runnerId);
        }
    }
    
    /**
     * Sets (as xml) the "RunnerId" element
     */
    public void xsetRunnerId(org.apache.xmlbeans.XmlInt runnerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RUNNERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RUNNERID$0);
            }
            target.set(runnerId);
        }
    }
    
    /**
     * Gets the "Entries" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entries getEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entries" element
     */
    public boolean isNilEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entries" element
     */
    public boolean isSetEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRIES$2) != 0;
        }
    }
    
    /**
     * Sets the "Entries" element
     */
    public void setEntries(com.unitedtote.schema.totelink._2008._06.program.Entries entries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$2);
            }
            target.set(entries);
        }
    }
    
    /**
     * Appends and returns a new empty "Entries" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entries addNewEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$2);
            return target;
        }
    }
    
    /**
     * Nils the "Entries" element
     */
    public void setNilEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entries" element
     */
    public void unsetEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRIES$2, 0);
        }
    }
    
    /**
     * Gets the "Scratch" element
     */
    public boolean getScratch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRATCH$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Scratch" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetScratch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRATCH$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Scratch" element
     */
    public boolean isSetScratch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRATCH$4) != 0;
        }
    }
    
    /**
     * Sets the "Scratch" element
     */
    public void setScratch(boolean scratch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRATCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRATCH$4);
            }
            target.setBooleanValue(scratch);
        }
    }
    
    /**
     * Sets (as xml) the "Scratch" element
     */
    public void xsetScratch(org.apache.xmlbeans.XmlBoolean scratch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRATCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SCRATCH$4);
            }
            target.set(scratch);
        }
    }
    
    /**
     * Unsets the "Scratch" element
     */
    public void unsetScratch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRATCH$4, 0);
        }
    }
    
    /**
     * Gets the "Odds" element
     */
    public java.lang.String getOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Odds" element
     */
    public org.apache.xmlbeans.XmlString xgetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ODDS$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Odds" element
     */
    public boolean isNilOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ODDS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Odds" element
     */
    public boolean isSetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODDS$6) != 0;
        }
    }
    
    /**
     * Sets the "Odds" element
     */
    public void setOdds(java.lang.String odds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ODDS$6);
            }
            target.setStringValue(odds);
        }
    }
    
    /**
     * Sets (as xml) the "Odds" element
     */
    public void xsetOdds(org.apache.xmlbeans.XmlString odds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ODDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ODDS$6);
            }
            target.set(odds);
        }
    }
    
    /**
     * Nils the "Odds" element
     */
    public void setNilOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ODDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ODDS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Odds" element
     */
    public void unsetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODDS$6, 0);
        }
    }
}
