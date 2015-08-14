/*
 * XML Type:  Entry
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Entry
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Entry(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Entry
{
    
    public EntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EntryId");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Name");
    private static final javax.xml.namespace.QName SCRATCH$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Scratch");
    private static final javax.xml.namespace.QName JOCKEY$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Jockey");
    private static final javax.xml.namespace.QName WEIGHT$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Weight");
    private static final javax.xml.namespace.QName TRAINER$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Trainer");
    private static final javax.xml.namespace.QName OWNER$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Owner");
    private static final javax.xml.namespace.QName POSITION$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Position");
    private static final javax.xml.namespace.QName MEDICATION$16 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Medication");
    private static final javax.xml.namespace.QName ENTRYCHANGES$18 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EntryChanges");
    
    
    /**
     * Gets the "EntryId" element
     */
    public java.lang.String getEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntryId" element
     */
    public org.apache.xmlbeans.XmlString xgetEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntryId" element
     */
    public boolean isNilEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntryId" element
     */
    public boolean isSetEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRYID$0) != 0;
        }
    }
    
    /**
     * Sets the "EntryId" element
     */
    public void setEntryId(java.lang.String entryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTRYID$0);
            }
            target.setStringValue(entryId);
        }
    }
    
    /**
     * Sets (as xml) the "EntryId" element
     */
    public void xsetEntryId(org.apache.xmlbeans.XmlString entryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTRYID$0);
            }
            target.set(entryId);
        }
    }
    
    /**
     * Nils the "EntryId" element
     */
    public void setNilEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTRYID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntryId" element
     */
    public void unsetEntryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRYID$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
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
     * Gets the "Jockey" element
     */
    public java.lang.String getJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOCKEY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Jockey" element
     */
    public org.apache.xmlbeans.XmlString xgetJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOCKEY$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Jockey" element
     */
    public boolean isNilJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOCKEY$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Jockey" element
     */
    public boolean isSetJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOCKEY$6) != 0;
        }
    }
    
    /**
     * Sets the "Jockey" element
     */
    public void setJockey(java.lang.String jockey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOCKEY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOCKEY$6);
            }
            target.setStringValue(jockey);
        }
    }
    
    /**
     * Sets (as xml) the "Jockey" element
     */
    public void xsetJockey(org.apache.xmlbeans.XmlString jockey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOCKEY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOCKEY$6);
            }
            target.set(jockey);
        }
    }
    
    /**
     * Nils the "Jockey" element
     */
    public void setNilJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOCKEY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOCKEY$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Jockey" element
     */
    public void unsetJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOCKEY$6, 0);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public java.lang.String getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Weight" element
     */
    public org.apache.xmlbeans.XmlString xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHT$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Weight" element
     */
    public boolean isNilWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHT$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$8) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(java.lang.String weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHT$8);
            }
            target.setStringValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "Weight" element
     */
    public void xsetWeight(org.apache.xmlbeans.XmlString weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEIGHT$8);
            }
            target.set(weight);
        }
    }
    
    /**
     * Nils the "Weight" element
     */
    public void setNilWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEIGHT$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$8, 0);
        }
    }
    
    /**
     * Gets the "Trainer" element
     */
    public java.lang.String getTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Trainer" element
     */
    public org.apache.xmlbeans.XmlString xgetTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINER$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Trainer" element
     */
    public boolean isNilTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINER$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Trainer" element
     */
    public boolean isSetTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAINER$10) != 0;
        }
    }
    
    /**
     * Sets the "Trainer" element
     */
    public void setTrainer(java.lang.String trainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAINER$10);
            }
            target.setStringValue(trainer);
        }
    }
    
    /**
     * Sets (as xml) the "Trainer" element
     */
    public void xsetTrainer(org.apache.xmlbeans.XmlString trainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRAINER$10);
            }
            target.set(trainer);
        }
    }
    
    /**
     * Nils the "Trainer" element
     */
    public void setNilTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRAINER$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Trainer" element
     */
    public void unsetTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAINER$10, 0);
        }
    }
    
    /**
     * Gets the "Owner" element
     */
    public java.lang.String getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Owner" element
     */
    public org.apache.xmlbeans.XmlString xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Owner" element
     */
    public boolean isNilOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Owner" element
     */
    public boolean isSetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$12) != 0;
        }
    }
    
    /**
     * Sets the "Owner" element
     */
    public void setOwner(java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$12);
            }
            target.setStringValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "Owner" element
     */
    public void xsetOwner(org.apache.xmlbeans.XmlString owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$12);
            }
            target.set(owner);
        }
    }
    
    /**
     * Nils the "Owner" element
     */
    public void setNilOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Owner" element
     */
    public void unsetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$12, 0);
        }
    }
    
    /**
     * Gets the "Position" element
     */
    public java.lang.String getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Position" element
     */
    public org.apache.xmlbeans.XmlString xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSITION$14, 0);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSITION$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$14) != 0;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(java.lang.String position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITION$14);
            }
            target.setStringValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "Position" element
     */
    public void xsetPosition(org.apache.xmlbeans.XmlString position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSITION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSITION$14);
            }
            target.set(position);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSITION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSITION$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$14, 0);
        }
    }
    
    /**
     * Gets the "Medication" element
     */
    public java.lang.String getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Medication" element
     */
    public org.apache.xmlbeans.XmlString xgetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICATION$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Medication" element
     */
    public boolean isNilMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Medication" element
     */
    public boolean isSetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATION$16) != 0;
        }
    }
    
    /**
     * Sets the "Medication" element
     */
    public void setMedication(java.lang.String medication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICATION$16);
            }
            target.setStringValue(medication);
        }
    }
    
    /**
     * Sets (as xml) the "Medication" element
     */
    public void xsetMedication(org.apache.xmlbeans.XmlString medication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDICATION$16);
            }
            target.set(medication);
        }
    }
    
    /**
     * Nils the "Medication" element
     */
    public void setNilMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDICATION$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Medication" element
     */
    public void unsetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATION$16, 0);
        }
    }
    
    /**
     * Gets the "EntryChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChanges getEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntryChanges" element
     */
    public boolean isNilEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntryChanges" element
     */
    public boolean isSetEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRYCHANGES$18) != 0;
        }
    }
    
    /**
     * Sets the "EntryChanges" element
     */
    public void setEntryChanges(com.unitedtote.schema.totelink._2008._06.program.EntryChanges entryChanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$18, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$18);
            }
            target.set(entryChanges);
        }
    }
    
    /**
     * Appends and returns a new empty "EntryChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChanges addNewEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$18);
            return target;
        }
    }
    
    /**
     * Nils the "EntryChanges" element
     */
    public void setNilEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$18, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntryChanges" element
     */
    public void unsetEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRYCHANGES$18, 0);
        }
    }
}
