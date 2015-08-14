/*
 * XML Type:  EntryChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryChange
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML EntryChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EntryChangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntryChange
{
    
    public EntryChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Name");
    private static final javax.xml.namespace.QName POSITION$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Position");
    private static final javax.xml.namespace.QName WEIGHT$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Weight");
    private static final javax.xml.namespace.QName MEDICATION$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Medication");
    private static final javax.xml.namespace.QName JOCKEY$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Jockey");
    private static final javax.xml.namespace.QName TRAINER$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Trainer");
    private static final javax.xml.namespace.QName OWNER$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Owner");
    private static final javax.xml.namespace.QName OTHER$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Other");
    
    
    /**
     * Gets the "Name" element
     */
    public boolean getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAME$0, 0);
            return target;
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
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(boolean name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setBooleanValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlBoolean name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NAME$0);
            }
            target.set(name);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Position" element
     */
    public boolean getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Position" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSITION$2, 0);
            return target;
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
            return get_store().count_elements(POSITION$2) != 0;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(boolean position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITION$2);
            }
            target.setBooleanValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "Position" element
     */
    public void xsetPosition(org.apache.xmlbeans.XmlBoolean position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSITION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POSITION$2);
            }
            target.set(position);
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
            get_store().remove_element(POSITION$2, 0);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public boolean getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Weight" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEIGHT$4, 0);
            return target;
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
            return get_store().count_elements(WEIGHT$4) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(boolean weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHT$4);
            }
            target.setBooleanValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "Weight" element
     */
    public void xsetWeight(org.apache.xmlbeans.XmlBoolean weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WEIGHT$4);
            }
            target.set(weight);
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
            get_store().remove_element(WEIGHT$4, 0);
        }
    }
    
    /**
     * Gets the "Medication" element
     */
    public boolean getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICATION$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Medication" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MEDICATION$6, 0);
            return target;
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
            return get_store().count_elements(MEDICATION$6) != 0;
        }
    }
    
    /**
     * Sets the "Medication" element
     */
    public void setMedication(boolean medication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICATION$6);
            }
            target.setBooleanValue(medication);
        }
    }
    
    /**
     * Sets (as xml) the "Medication" element
     */
    public void xsetMedication(org.apache.xmlbeans.XmlBoolean medication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MEDICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MEDICATION$6);
            }
            target.set(medication);
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
            get_store().remove_element(MEDICATION$6, 0);
        }
    }
    
    /**
     * Gets the "Jockey" element
     */
    public boolean getJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOCKEY$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Jockey" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetJockey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(JOCKEY$8, 0);
            return target;
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
            return get_store().count_elements(JOCKEY$8) != 0;
        }
    }
    
    /**
     * Sets the "Jockey" element
     */
    public void setJockey(boolean jockey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOCKEY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOCKEY$8);
            }
            target.setBooleanValue(jockey);
        }
    }
    
    /**
     * Sets (as xml) the "Jockey" element
     */
    public void xsetJockey(org.apache.xmlbeans.XmlBoolean jockey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(JOCKEY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(JOCKEY$8);
            }
            target.set(jockey);
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
            get_store().remove_element(JOCKEY$8, 0);
        }
    }
    
    /**
     * Gets the "Trainer" element
     */
    public boolean getTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Trainer" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTrainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAINER$10, 0);
            return target;
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
    public void setTrainer(boolean trainer)
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
            target.setBooleanValue(trainer);
        }
    }
    
    /**
     * Sets (as xml) the "Trainer" element
     */
    public void xsetTrainer(org.apache.xmlbeans.XmlBoolean trainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAINER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRAINER$10);
            }
            target.set(trainer);
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
    public boolean getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Owner" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OWNER$12, 0);
            return target;
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
    public void setOwner(boolean owner)
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
            target.setBooleanValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "Owner" element
     */
    public void xsetOwner(org.apache.xmlbeans.XmlBoolean owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OWNER$12);
            }
            target.set(owner);
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
     * Gets the "Other" element
     */
    public java.lang.String getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Other" element
     */
    public org.apache.xmlbeans.XmlString xgetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHER$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Other" element
     */
    public boolean isNilOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHER$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Other" element
     */
    public boolean isSetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHER$14) != 0;
        }
    }
    
    /**
     * Sets the "Other" element
     */
    public void setOther(java.lang.String other)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHER$14);
            }
            target.setStringValue(other);
        }
    }
    
    /**
     * Sets (as xml) the "Other" element
     */
    public void xsetOther(org.apache.xmlbeans.XmlString other)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHER$14);
            }
            target.set(other);
        }
    }
    
    /**
     * Nils the "Other" element
     */
    public void setNilOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHER$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Other" element
     */
    public void unsetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHER$14, 0);
        }
    }
}
