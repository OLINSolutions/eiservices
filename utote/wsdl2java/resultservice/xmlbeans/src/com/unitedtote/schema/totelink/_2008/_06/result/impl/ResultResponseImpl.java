/*
 * XML Type:  ResultResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML ResultResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class ResultResponseImpl extends com.unitedtote.schema.totelink._2008._06.common.impl.ToteLinkResponseImpl implements com.unitedtote.schema.totelink._2008._06.result.ResultResponse
{
    
    public ResultResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "EventId");
    private static final javax.xml.namespace.QName EVENTNAME$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "EventName");
    private static final javax.xml.namespace.QName RACEID$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "RaceId");
    private static final javax.xml.namespace.QName CURRENCYID$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "CurrencyId");
    private static final javax.xml.namespace.QName RACERESULTS$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "RaceResults");
    private static final javax.xml.namespace.QName POOLPRICES$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrices");
    
    
    /**
     * Gets the "EventId" element
     */
    public java.lang.String getEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventId" element
     */
    public org.apache.xmlbeans.XmlString xgetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventId" element
     */
    public boolean isNilEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventId" element
     */
    public boolean isSetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "EventId" element
     */
    public void setEventId(java.lang.String eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$0);
            }
            target.setStringValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) the "EventId" element
     */
    public void xsetEventId(org.apache.xmlbeans.XmlString eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$0);
            }
            target.set(eventId);
        }
    }
    
    /**
     * Nils the "EventId" element
     */
    public void setNilEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventId" element
     */
    public void unsetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$0, 0);
        }
    }
    
    /**
     * Gets the "EventName" element
     */
    public java.lang.String getEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventName" element
     */
    public org.apache.xmlbeans.XmlString xgetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventName" element
     */
    public boolean isNilEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventName" element
     */
    public boolean isSetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "EventName" element
     */
    public void setEventName(java.lang.String eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTNAME$2);
            }
            target.setStringValue(eventName);
        }
    }
    
    /**
     * Sets (as xml) the "EventName" element
     */
    public void xsetEventName(org.apache.xmlbeans.XmlString eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTNAME$2);
            }
            target.set(eventName);
        }
    }
    
    /**
     * Nils the "EventName" element
     */
    public void setNilEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventName" element
     */
    public void unsetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "RaceId" element
     */
    public int getRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RaceId" element
     */
    public boolean isSetRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACEID$4) != 0;
        }
    }
    
    /**
     * Sets the "RaceId" element
     */
    public void setRaceId(int raceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACEID$4);
            }
            target.setIntValue(raceId);
        }
    }
    
    /**
     * Sets (as xml) the "RaceId" element
     */
    public void xsetRaceId(org.apache.xmlbeans.XmlInt raceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RACEID$4);
            }
            target.set(raceId);
        }
    }
    
    /**
     * Unsets the "RaceId" element
     */
    public void unsetRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACEID$4, 0);
        }
    }
    
    /**
     * Gets the "CurrencyId" element
     */
    public java.lang.String getCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyId" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CurrencyId" element
     */
    public boolean isNilCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CurrencyId" element
     */
    public boolean isSetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYID$6) != 0;
        }
    }
    
    /**
     * Sets the "CurrencyId" element
     */
    public void setCurrencyId(java.lang.String currencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYID$6);
            }
            target.setStringValue(currencyId);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyId" element
     */
    public void xsetCurrencyId(org.apache.xmlbeans.XmlString currencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYID$6);
            }
            target.set(currencyId);
        }
    }
    
    /**
     * Nils the "CurrencyId" element
     */
    public void setNilCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYID$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CurrencyId" element
     */
    public void unsetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYID$6, 0);
        }
    }
    
    /**
     * Gets the "RaceResults" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultEntity getRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RACERESULTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceResults" element
     */
    public boolean isNilRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RACERESULTS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RaceResults" element
     */
    public boolean isSetRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACERESULTS$8) != 0;
        }
    }
    
    /**
     * Sets the "RaceResults" element
     */
    public void setRaceResults(com.unitedtote.schema.totelink._2008._06.result.ResultEntity raceResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RACERESULTS$8, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RACERESULTS$8);
            }
            target.set(raceResults);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceResults" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultEntity addNewRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RACERESULTS$8);
            return target;
        }
    }
    
    /**
     * Nils the "RaceResults" element
     */
    public void setNilRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RACERESULTS$8, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RACERESULTS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RaceResults" element
     */
    public void unsetRaceResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACERESULTS$8, 0);
        }
    }
    
    /**
     * Gets the "PoolPrices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrices getPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolPrices" element
     */
    public boolean isNilPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PoolPrices" element
     */
    public boolean isSetPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOLPRICES$10) != 0;
        }
    }
    
    /**
     * Sets the "PoolPrices" element
     */
    public void setPoolPrices(com.unitedtote.schema.totelink._2008._06.result.PoolPrices poolPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$10, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$10);
            }
            target.set(poolPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "PoolPrices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PoolPrices addNewPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$10);
            return target;
        }
    }
    
    /**
     * Nils the "PoolPrices" element
     */
    public void setNilPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PoolPrices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().find_element_user(POOLPRICES$10, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PoolPrices)get_store().add_element_user(POOLPRICES$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PoolPrices" element
     */
    public void unsetPoolPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOLPRICES$10, 0);
        }
    }
}
