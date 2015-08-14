/*
 * XML Type:  ResultResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result;


/**
 * An XML ResultResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public interface ResultResponse extends com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC4E27644A95E6B8E91ED77A28E6606A2").resolveHandle("resultresponseb96dtype");
    
    /**
     * Gets the "EventId" element
     */
    java.lang.String getEventId();
    
    /**
     * Gets (as xml) the "EventId" element
     */
    org.apache.xmlbeans.XmlString xgetEventId();
    
    /**
     * Tests for nil "EventId" element
     */
    boolean isNilEventId();
    
    /**
     * True if has "EventId" element
     */
    boolean isSetEventId();
    
    /**
     * Sets the "EventId" element
     */
    void setEventId(java.lang.String eventId);
    
    /**
     * Sets (as xml) the "EventId" element
     */
    void xsetEventId(org.apache.xmlbeans.XmlString eventId);
    
    /**
     * Nils the "EventId" element
     */
    void setNilEventId();
    
    /**
     * Unsets the "EventId" element
     */
    void unsetEventId();
    
    /**
     * Gets the "EventName" element
     */
    java.lang.String getEventName();
    
    /**
     * Gets (as xml) the "EventName" element
     */
    org.apache.xmlbeans.XmlString xgetEventName();
    
    /**
     * Tests for nil "EventName" element
     */
    boolean isNilEventName();
    
    /**
     * True if has "EventName" element
     */
    boolean isSetEventName();
    
    /**
     * Sets the "EventName" element
     */
    void setEventName(java.lang.String eventName);
    
    /**
     * Sets (as xml) the "EventName" element
     */
    void xsetEventName(org.apache.xmlbeans.XmlString eventName);
    
    /**
     * Nils the "EventName" element
     */
    void setNilEventName();
    
    /**
     * Unsets the "EventName" element
     */
    void unsetEventName();
    
    /**
     * Gets the "RaceId" element
     */
    int getRaceId();
    
    /**
     * Gets (as xml) the "RaceId" element
     */
    org.apache.xmlbeans.XmlInt xgetRaceId();
    
    /**
     * True if has "RaceId" element
     */
    boolean isSetRaceId();
    
    /**
     * Sets the "RaceId" element
     */
    void setRaceId(int raceId);
    
    /**
     * Sets (as xml) the "RaceId" element
     */
    void xsetRaceId(org.apache.xmlbeans.XmlInt raceId);
    
    /**
     * Unsets the "RaceId" element
     */
    void unsetRaceId();
    
    /**
     * Gets the "CurrencyId" element
     */
    java.lang.String getCurrencyId();
    
    /**
     * Gets (as xml) the "CurrencyId" element
     */
    org.apache.xmlbeans.XmlString xgetCurrencyId();
    
    /**
     * Tests for nil "CurrencyId" element
     */
    boolean isNilCurrencyId();
    
    /**
     * True if has "CurrencyId" element
     */
    boolean isSetCurrencyId();
    
    /**
     * Sets the "CurrencyId" element
     */
    void setCurrencyId(java.lang.String currencyId);
    
    /**
     * Sets (as xml) the "CurrencyId" element
     */
    void xsetCurrencyId(org.apache.xmlbeans.XmlString currencyId);
    
    /**
     * Nils the "CurrencyId" element
     */
    void setNilCurrencyId();
    
    /**
     * Unsets the "CurrencyId" element
     */
    void unsetCurrencyId();
    
    /**
     * Gets the "RaceResults" element
     */
    com.unitedtote.schema.totelink._2008._06.result.ResultEntity getRaceResults();
    
    /**
     * Tests for nil "RaceResults" element
     */
    boolean isNilRaceResults();
    
    /**
     * True if has "RaceResults" element
     */
    boolean isSetRaceResults();
    
    /**
     * Sets the "RaceResults" element
     */
    void setRaceResults(com.unitedtote.schema.totelink._2008._06.result.ResultEntity raceResults);
    
    /**
     * Appends and returns a new empty "RaceResults" element
     */
    com.unitedtote.schema.totelink._2008._06.result.ResultEntity addNewRaceResults();
    
    /**
     * Nils the "RaceResults" element
     */
    void setNilRaceResults();
    
    /**
     * Unsets the "RaceResults" element
     */
    void unsetRaceResults();
    
    /**
     * Gets the "PoolPrices" element
     */
    com.unitedtote.schema.totelink._2008._06.result.PoolPrices getPoolPrices();
    
    /**
     * Tests for nil "PoolPrices" element
     */
    boolean isNilPoolPrices();
    
    /**
     * True if has "PoolPrices" element
     */
    boolean isSetPoolPrices();
    
    /**
     * Sets the "PoolPrices" element
     */
    void setPoolPrices(com.unitedtote.schema.totelink._2008._06.result.PoolPrices poolPrices);
    
    /**
     * Appends and returns a new empty "PoolPrices" element
     */
    com.unitedtote.schema.totelink._2008._06.result.PoolPrices addNewPoolPrices();
    
    /**
     * Nils the "PoolPrices" element
     */
    void setNilPoolPrices();
    
    /**
     * Unsets the "PoolPrices" element
     */
    void unsetPoolPrices();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
