/*
 * XML Type:  EntryChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryChange
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML EntryChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface EntryChange extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntryChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("entrychange0406type");
    
    /**
     * Gets the "Name" element
     */
    boolean getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlBoolean xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(boolean name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlBoolean name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Position" element
     */
    boolean getPosition();
    
    /**
     * Gets (as xml) the "Position" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPosition();
    
    /**
     * True if has "Position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "Position" element
     */
    void setPosition(boolean position);
    
    /**
     * Sets (as xml) the "Position" element
     */
    void xsetPosition(org.apache.xmlbeans.XmlBoolean position);
    
    /**
     * Unsets the "Position" element
     */
    void unsetPosition();
    
    /**
     * Gets the "Weight" element
     */
    boolean getWeight();
    
    /**
     * Gets (as xml) the "Weight" element
     */
    org.apache.xmlbeans.XmlBoolean xgetWeight();
    
    /**
     * True if has "Weight" element
     */
    boolean isSetWeight();
    
    /**
     * Sets the "Weight" element
     */
    void setWeight(boolean weight);
    
    /**
     * Sets (as xml) the "Weight" element
     */
    void xsetWeight(org.apache.xmlbeans.XmlBoolean weight);
    
    /**
     * Unsets the "Weight" element
     */
    void unsetWeight();
    
    /**
     * Gets the "Medication" element
     */
    boolean getMedication();
    
    /**
     * Gets (as xml) the "Medication" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMedication();
    
    /**
     * True if has "Medication" element
     */
    boolean isSetMedication();
    
    /**
     * Sets the "Medication" element
     */
    void setMedication(boolean medication);
    
    /**
     * Sets (as xml) the "Medication" element
     */
    void xsetMedication(org.apache.xmlbeans.XmlBoolean medication);
    
    /**
     * Unsets the "Medication" element
     */
    void unsetMedication();
    
    /**
     * Gets the "Jockey" element
     */
    boolean getJockey();
    
    /**
     * Gets (as xml) the "Jockey" element
     */
    org.apache.xmlbeans.XmlBoolean xgetJockey();
    
    /**
     * True if has "Jockey" element
     */
    boolean isSetJockey();
    
    /**
     * Sets the "Jockey" element
     */
    void setJockey(boolean jockey);
    
    /**
     * Sets (as xml) the "Jockey" element
     */
    void xsetJockey(org.apache.xmlbeans.XmlBoolean jockey);
    
    /**
     * Unsets the "Jockey" element
     */
    void unsetJockey();
    
    /**
     * Gets the "Trainer" element
     */
    boolean getTrainer();
    
    /**
     * Gets (as xml) the "Trainer" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTrainer();
    
    /**
     * True if has "Trainer" element
     */
    boolean isSetTrainer();
    
    /**
     * Sets the "Trainer" element
     */
    void setTrainer(boolean trainer);
    
    /**
     * Sets (as xml) the "Trainer" element
     */
    void xsetTrainer(org.apache.xmlbeans.XmlBoolean trainer);
    
    /**
     * Unsets the "Trainer" element
     */
    void unsetTrainer();
    
    /**
     * Gets the "Owner" element
     */
    boolean getOwner();
    
    /**
     * Gets (as xml) the "Owner" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOwner();
    
    /**
     * True if has "Owner" element
     */
    boolean isSetOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(boolean owner);
    
    /**
     * Sets (as xml) the "Owner" element
     */
    void xsetOwner(org.apache.xmlbeans.XmlBoolean owner);
    
    /**
     * Unsets the "Owner" element
     */
    void unsetOwner();
    
    /**
     * Gets the "Other" element
     */
    java.lang.String getOther();
    
    /**
     * Gets (as xml) the "Other" element
     */
    org.apache.xmlbeans.XmlString xgetOther();
    
    /**
     * Tests for nil "Other" element
     */
    boolean isNilOther();
    
    /**
     * True if has "Other" element
     */
    boolean isSetOther();
    
    /**
     * Sets the "Other" element
     */
    void setOther(java.lang.String other);
    
    /**
     * Sets (as xml) the "Other" element
     */
    void xsetOther(org.apache.xmlbeans.XmlString other);
    
    /**
     * Nils the "Other" element
     */
    void setNilOther();
    
    /**
     * Unsets the "Other" element
     */
    void unsetOther();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.EntryChange parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.EntryChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
