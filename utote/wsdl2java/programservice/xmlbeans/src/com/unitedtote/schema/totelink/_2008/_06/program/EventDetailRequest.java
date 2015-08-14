/*
 * XML Type:  EventDetailRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML EventDetailRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface EventDetailRequest extends com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventDetailRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("eventdetailrequest833atype");
    
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
     * Gets the "TournamentId" element
     */
    java.lang.String getTournamentId();
    
    /**
     * Gets (as xml) the "TournamentId" element
     */
    org.apache.xmlbeans.XmlString xgetTournamentId();
    
    /**
     * Tests for nil "TournamentId" element
     */
    boolean isNilTournamentId();
    
    /**
     * True if has "TournamentId" element
     */
    boolean isSetTournamentId();
    
    /**
     * Sets the "TournamentId" element
     */
    void setTournamentId(java.lang.String tournamentId);
    
    /**
     * Sets (as xml) the "TournamentId" element
     */
    void xsetTournamentId(org.apache.xmlbeans.XmlString tournamentId);
    
    /**
     * Nils the "TournamentId" element
     */
    void setNilTournamentId();
    
    /**
     * Unsets the "TournamentId" element
     */
    void unsetTournamentId();
    
    /**
     * Gets the "ContestId" element
     */
    java.lang.String getContestId();
    
    /**
     * Gets (as xml) the "ContestId" element
     */
    org.apache.xmlbeans.XmlString xgetContestId();
    
    /**
     * Tests for nil "ContestId" element
     */
    boolean isNilContestId();
    
    /**
     * True if has "ContestId" element
     */
    boolean isSetContestId();
    
    /**
     * Sets the "ContestId" element
     */
    void setContestId(java.lang.String contestId);
    
    /**
     * Sets (as xml) the "ContestId" element
     */
    void xsetContestId(org.apache.xmlbeans.XmlString contestId);
    
    /**
     * Nils the "ContestId" element
     */
    void setNilContestId();
    
    /**
     * Unsets the "ContestId" element
     */
    void unsetContestId();
    
    /**
     * Gets the "Program" element
     */
    boolean getProgram();
    
    /**
     * Gets (as xml) the "Program" element
     */
    org.apache.xmlbeans.XmlBoolean xgetProgram();
    
    /**
     * True if has "Program" element
     */
    boolean isSetProgram();
    
    /**
     * Sets the "Program" element
     */
    void setProgram(boolean program);
    
    /**
     * Sets (as xml) the "Program" element
     */
    void xsetProgram(org.apache.xmlbeans.XmlBoolean program);
    
    /**
     * Unsets the "Program" element
     */
    void unsetProgram();
    
    /**
     * Gets the "Races" element
     */
    boolean getRaces();
    
    /**
     * Gets (as xml) the "Races" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRaces();
    
    /**
     * True if has "Races" element
     */
    boolean isSetRaces();
    
    /**
     * Sets the "Races" element
     */
    void setRaces(boolean races);
    
    /**
     * Sets (as xml) the "Races" element
     */
    void xsetRaces(org.apache.xmlbeans.XmlBoolean races);
    
    /**
     * Unsets the "Races" element
     */
    void unsetRaces();
    
    /**
     * Gets the "Pools" element
     */
    boolean getPools();
    
    /**
     * Gets (as xml) the "Pools" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPools();
    
    /**
     * True if has "Pools" element
     */
    boolean isSetPools();
    
    /**
     * Sets the "Pools" element
     */
    void setPools(boolean pools);
    
    /**
     * Sets (as xml) the "Pools" element
     */
    void xsetPools(org.apache.xmlbeans.XmlBoolean pools);
    
    /**
     * Unsets the "Pools" element
     */
    void unsetPools();
    
    /**
     * Gets the "Runners" element
     */
    boolean getRunners();
    
    /**
     * Gets (as xml) the "Runners" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRunners();
    
    /**
     * True if has "Runners" element
     */
    boolean isSetRunners();
    
    /**
     * Sets the "Runners" element
     */
    void setRunners(boolean runners);
    
    /**
     * Sets (as xml) the "Runners" element
     */
    void xsetRunners(org.apache.xmlbeans.XmlBoolean runners);
    
    /**
     * Unsets the "Runners" element
     */
    void unsetRunners();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
