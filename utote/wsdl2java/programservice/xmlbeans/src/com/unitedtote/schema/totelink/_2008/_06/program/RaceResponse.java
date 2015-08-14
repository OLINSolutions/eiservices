/*
 * XML Type:  RaceResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML RaceResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface RaceResponse extends com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RaceResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("raceresponse4528type");
    
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
     * Gets the "Race" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Race getRace();
    
    /**
     * Tests for nil "Race" element
     */
    boolean isNilRace();
    
    /**
     * True if has "Race" element
     */
    boolean isSetRace();
    
    /**
     * Sets the "Race" element
     */
    void setRace(com.unitedtote.schema.totelink._2008._06.program.Race race);
    
    /**
     * Appends and returns a new empty "Race" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Race addNewRace();
    
    /**
     * Nils the "Race" element
     */
    void setNilRace();
    
    /**
     * Unsets the "Race" element
     */
    void unsetRace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
