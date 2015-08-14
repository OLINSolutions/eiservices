/*
 * XML Type:  Runner
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Runner
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML Runner(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface Runner extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Runner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("runner8266type");
    
    /**
     * Gets the "RunnerId" element
     */
    int getRunnerId();
    
    /**
     * Gets (as xml) the "RunnerId" element
     */
    org.apache.xmlbeans.XmlInt xgetRunnerId();
    
    /**
     * Sets the "RunnerId" element
     */
    void setRunnerId(int runnerId);
    
    /**
     * Sets (as xml) the "RunnerId" element
     */
    void xsetRunnerId(org.apache.xmlbeans.XmlInt runnerId);
    
    /**
     * Gets the "Entries" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Entries getEntries();
    
    /**
     * Tests for nil "Entries" element
     */
    boolean isNilEntries();
    
    /**
     * True if has "Entries" element
     */
    boolean isSetEntries();
    
    /**
     * Sets the "Entries" element
     */
    void setEntries(com.unitedtote.schema.totelink._2008._06.program.Entries entries);
    
    /**
     * Appends and returns a new empty "Entries" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Entries addNewEntries();
    
    /**
     * Nils the "Entries" element
     */
    void setNilEntries();
    
    /**
     * Unsets the "Entries" element
     */
    void unsetEntries();
    
    /**
     * Gets the "Scratch" element
     */
    boolean getScratch();
    
    /**
     * Gets (as xml) the "Scratch" element
     */
    org.apache.xmlbeans.XmlBoolean xgetScratch();
    
    /**
     * True if has "Scratch" element
     */
    boolean isSetScratch();
    
    /**
     * Sets the "Scratch" element
     */
    void setScratch(boolean scratch);
    
    /**
     * Sets (as xml) the "Scratch" element
     */
    void xsetScratch(org.apache.xmlbeans.XmlBoolean scratch);
    
    /**
     * Unsets the "Scratch" element
     */
    void unsetScratch();
    
    /**
     * Gets the "Odds" element
     */
    java.lang.String getOdds();
    
    /**
     * Gets (as xml) the "Odds" element
     */
    org.apache.xmlbeans.XmlString xgetOdds();
    
    /**
     * Tests for nil "Odds" element
     */
    boolean isNilOdds();
    
    /**
     * True if has "Odds" element
     */
    boolean isSetOdds();
    
    /**
     * Sets the "Odds" element
     */
    void setOdds(java.lang.String odds);
    
    /**
     * Sets (as xml) the "Odds" element
     */
    void xsetOdds(org.apache.xmlbeans.XmlString odds);
    
    /**
     * Nils the "Odds" element
     */
    void setNilOdds();
    
    /**
     * Unsets the "Odds" element
     */
    void unsetOdds();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.Runner newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.Runner parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.Runner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
