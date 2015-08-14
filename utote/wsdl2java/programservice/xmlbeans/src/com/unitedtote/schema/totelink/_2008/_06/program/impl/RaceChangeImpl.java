/*
 * XML Type:  RaceChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceChange
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML RaceChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RaceChangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceChange
{
    
    public RaceChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACETYPE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceType");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Distance");
    private static final javax.xml.namespace.QName SEX$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Sex");
    private static final javax.xml.namespace.QName AGE$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Age");
    private static final javax.xml.namespace.QName PURSE$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Purse");
    private static final javax.xml.namespace.QName CLAIM$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Claim");
    private static final javax.xml.namespace.QName BREED$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Breed");
    private static final javax.xml.namespace.QName SURFACE$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Surface");
    
    
    /**
     * Gets the "RaceType" element
     */
    public boolean getRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACETYPE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceType" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RACETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RaceType" element
     */
    public boolean isSetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACETYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "RaceType" element
     */
    public void setRaceType(boolean raceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACETYPE$0);
            }
            target.setBooleanValue(raceType);
        }
    }
    
    /**
     * Sets (as xml) the "RaceType" element
     */
    public void xsetRaceType(org.apache.xmlbeans.XmlBoolean raceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RACETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RACETYPE$0);
            }
            target.set(raceType);
        }
    }
    
    /**
     * Unsets the "RaceType" element
     */
    public void unsetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACETYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Distance" element
     */
    public boolean getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distance" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTANCE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Distance" element
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "Distance" element
     */
    public void setDistance(boolean distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCE$2);
            }
            target.setBooleanValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "Distance" element
     */
    public void xsetDistance(org.apache.xmlbeans.XmlBoolean distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISTANCE$2);
            }
            target.set(distance);
        }
    }
    
    /**
     * Unsets the "Distance" element
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCE$2, 0);
        }
    }
    
    /**
     * Gets the "Sex" element
     */
    public boolean getSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sex" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SEX$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sex" element
     */
    public boolean isSetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEX$4) != 0;
        }
    }
    
    /**
     * Sets the "Sex" element
     */
    public void setSex(boolean sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEX$4);
            }
            target.setBooleanValue(sex);
        }
    }
    
    /**
     * Sets (as xml) the "Sex" element
     */
    public void xsetSex(org.apache.xmlbeans.XmlBoolean sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SEX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SEX$4);
            }
            target.set(sex);
        }
    }
    
    /**
     * Unsets the "Sex" element
     */
    public void unsetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEX$4, 0);
        }
    }
    
    /**
     * Gets the "Age" element
     */
    public boolean getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Age" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Age" element
     */
    public boolean isSetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGE$6) != 0;
        }
    }
    
    /**
     * Sets the "Age" element
     */
    public void setAge(boolean age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$6);
            }
            target.setBooleanValue(age);
        }
    }
    
    /**
     * Sets (as xml) the "Age" element
     */
    public void xsetAge(org.apache.xmlbeans.XmlBoolean age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AGE$6);
            }
            target.set(age);
        }
    }
    
    /**
     * Unsets the "Age" element
     */
    public void unsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGE$6, 0);
        }
    }
    
    /**
     * Gets the "Purse" element
     */
    public boolean getPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURSE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Purse" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PURSE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Purse" element
     */
    public boolean isSetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURSE$8) != 0;
        }
    }
    
    /**
     * Sets the "Purse" element
     */
    public void setPurse(boolean purse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURSE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURSE$8);
            }
            target.setBooleanValue(purse);
        }
    }
    
    /**
     * Sets (as xml) the "Purse" element
     */
    public void xsetPurse(org.apache.xmlbeans.XmlBoolean purse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PURSE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PURSE$8);
            }
            target.set(purse);
        }
    }
    
    /**
     * Unsets the "Purse" element
     */
    public void unsetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURSE$8, 0);
        }
    }
    
    /**
     * Gets the "Claim" element
     */
    public boolean getClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIM$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Claim" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CLAIM$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Claim" element
     */
    public boolean isSetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIM$10) != 0;
        }
    }
    
    /**
     * Sets the "Claim" element
     */
    public void setClaim(boolean claim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAIM$10);
            }
            target.setBooleanValue(claim);
        }
    }
    
    /**
     * Sets (as xml) the "Claim" element
     */
    public void xsetClaim(org.apache.xmlbeans.XmlBoolean claim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CLAIM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CLAIM$10);
            }
            target.set(claim);
        }
    }
    
    /**
     * Unsets the "Claim" element
     */
    public void unsetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIM$10, 0);
        }
    }
    
    /**
     * Gets the "Breed" element
     */
    public boolean getBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BREED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Breed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BREED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Breed" element
     */
    public boolean isSetBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREED$12) != 0;
        }
    }
    
    /**
     * Sets the "Breed" element
     */
    public void setBreed(boolean breed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BREED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BREED$12);
            }
            target.setBooleanValue(breed);
        }
    }
    
    /**
     * Sets (as xml) the "Breed" element
     */
    public void xsetBreed(org.apache.xmlbeans.XmlBoolean breed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BREED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BREED$12);
            }
            target.set(breed);
        }
    }
    
    /**
     * Unsets the "Breed" element
     */
    public void unsetBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREED$12, 0);
        }
    }
    
    /**
     * Gets the "Surface" element
     */
    public boolean getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURFACE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Surface" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SURFACE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Surface" element
     */
    public boolean isSetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACE$14) != 0;
        }
    }
    
    /**
     * Sets the "Surface" element
     */
    public void setSurface(boolean surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURFACE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURFACE$14);
            }
            target.setBooleanValue(surface);
        }
    }
    
    /**
     * Sets (as xml) the "Surface" element
     */
    public void xsetSurface(org.apache.xmlbeans.XmlBoolean surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SURFACE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SURFACE$14);
            }
            target.set(surface);
        }
    }
    
    /**
     * Unsets the "Surface" element
     */
    public void unsetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACE$14, 0);
        }
    }
}
