/*
 * XML Type:  ResultEntity
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultEntity
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result;


/**
 * An XML ResultEntity(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public interface ResultEntity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC4E27644A95E6B8E91ED77A28E6606A2").resolveHandle("resultentity918btype");
    
    /**
     * Gets the "Positions" element
     */
    com.unitedtote.schema.totelink._2008._06.result.Positions getPositions();
    
    /**
     * Tests for nil "Positions" element
     */
    boolean isNilPositions();
    
    /**
     * True if has "Positions" element
     */
    boolean isSetPositions();
    
    /**
     * Sets the "Positions" element
     */
    void setPositions(com.unitedtote.schema.totelink._2008._06.result.Positions positions);
    
    /**
     * Appends and returns a new empty "Positions" element
     */
    com.unitedtote.schema.totelink._2008._06.result.Positions addNewPositions();
    
    /**
     * Nils the "Positions" element
     */
    void setNilPositions();
    
    /**
     * Unsets the "Positions" element
     */
    void unsetPositions();
    
    /**
     * Gets the "Winners" element
     */
    java.lang.String getWinners();
    
    /**
     * Gets (as xml) the "Winners" element
     */
    org.apache.xmlbeans.XmlString xgetWinners();
    
    /**
     * Tests for nil "Winners" element
     */
    boolean isNilWinners();
    
    /**
     * True if has "Winners" element
     */
    boolean isSetWinners();
    
    /**
     * Sets the "Winners" element
     */
    void setWinners(java.lang.String winners);
    
    /**
     * Sets (as xml) the "Winners" element
     */
    void xsetWinners(org.apache.xmlbeans.XmlString winners);
    
    /**
     * Nils the "Winners" element
     */
    void setNilWinners();
    
    /**
     * Unsets the "Winners" element
     */
    void unsetWinners();
    
    /**
     * Gets the "Scratches" element
     */
    java.lang.String getScratches();
    
    /**
     * Gets (as xml) the "Scratches" element
     */
    org.apache.xmlbeans.XmlString xgetScratches();
    
    /**
     * Tests for nil "Scratches" element
     */
    boolean isNilScratches();
    
    /**
     * True if has "Scratches" element
     */
    boolean isSetScratches();
    
    /**
     * Sets the "Scratches" element
     */
    void setScratches(java.lang.String scratches);
    
    /**
     * Sets (as xml) the "Scratches" element
     */
    void xsetScratches(org.apache.xmlbeans.XmlString scratches);
    
    /**
     * Nils the "Scratches" element
     */
    void setNilScratches();
    
    /**
     * Unsets the "Scratches" element
     */
    void unsetScratches();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.ResultEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.ResultEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
