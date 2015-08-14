/*
 * XML Type:  RaceChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceChange
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML RaceChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface RaceChange extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RaceChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("racechange91d7type");
    
    /**
     * Gets the "RaceType" element
     */
    boolean getRaceType();
    
    /**
     * Gets (as xml) the "RaceType" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRaceType();
    
    /**
     * True if has "RaceType" element
     */
    boolean isSetRaceType();
    
    /**
     * Sets the "RaceType" element
     */
    void setRaceType(boolean raceType);
    
    /**
     * Sets (as xml) the "RaceType" element
     */
    void xsetRaceType(org.apache.xmlbeans.XmlBoolean raceType);
    
    /**
     * Unsets the "RaceType" element
     */
    void unsetRaceType();
    
    /**
     * Gets the "Distance" element
     */
    boolean getDistance();
    
    /**
     * Gets (as xml) the "Distance" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDistance();
    
    /**
     * True if has "Distance" element
     */
    boolean isSetDistance();
    
    /**
     * Sets the "Distance" element
     */
    void setDistance(boolean distance);
    
    /**
     * Sets (as xml) the "Distance" element
     */
    void xsetDistance(org.apache.xmlbeans.XmlBoolean distance);
    
    /**
     * Unsets the "Distance" element
     */
    void unsetDistance();
    
    /**
     * Gets the "Sex" element
     */
    boolean getSex();
    
    /**
     * Gets (as xml) the "Sex" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSex();
    
    /**
     * True if has "Sex" element
     */
    boolean isSetSex();
    
    /**
     * Sets the "Sex" element
     */
    void setSex(boolean sex);
    
    /**
     * Sets (as xml) the "Sex" element
     */
    void xsetSex(org.apache.xmlbeans.XmlBoolean sex);
    
    /**
     * Unsets the "Sex" element
     */
    void unsetSex();
    
    /**
     * Gets the "Age" element
     */
    boolean getAge();
    
    /**
     * Gets (as xml) the "Age" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAge();
    
    /**
     * True if has "Age" element
     */
    boolean isSetAge();
    
    /**
     * Sets the "Age" element
     */
    void setAge(boolean age);
    
    /**
     * Sets (as xml) the "Age" element
     */
    void xsetAge(org.apache.xmlbeans.XmlBoolean age);
    
    /**
     * Unsets the "Age" element
     */
    void unsetAge();
    
    /**
     * Gets the "Purse" element
     */
    boolean getPurse();
    
    /**
     * Gets (as xml) the "Purse" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPurse();
    
    /**
     * True if has "Purse" element
     */
    boolean isSetPurse();
    
    /**
     * Sets the "Purse" element
     */
    void setPurse(boolean purse);
    
    /**
     * Sets (as xml) the "Purse" element
     */
    void xsetPurse(org.apache.xmlbeans.XmlBoolean purse);
    
    /**
     * Unsets the "Purse" element
     */
    void unsetPurse();
    
    /**
     * Gets the "Claim" element
     */
    boolean getClaim();
    
    /**
     * Gets (as xml) the "Claim" element
     */
    org.apache.xmlbeans.XmlBoolean xgetClaim();
    
    /**
     * True if has "Claim" element
     */
    boolean isSetClaim();
    
    /**
     * Sets the "Claim" element
     */
    void setClaim(boolean claim);
    
    /**
     * Sets (as xml) the "Claim" element
     */
    void xsetClaim(org.apache.xmlbeans.XmlBoolean claim);
    
    /**
     * Unsets the "Claim" element
     */
    void unsetClaim();
    
    /**
     * Gets the "Breed" element
     */
    boolean getBreed();
    
    /**
     * Gets (as xml) the "Breed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBreed();
    
    /**
     * True if has "Breed" element
     */
    boolean isSetBreed();
    
    /**
     * Sets the "Breed" element
     */
    void setBreed(boolean breed);
    
    /**
     * Sets (as xml) the "Breed" element
     */
    void xsetBreed(org.apache.xmlbeans.XmlBoolean breed);
    
    /**
     * Unsets the "Breed" element
     */
    void unsetBreed();
    
    /**
     * Gets the "Surface" element
     */
    boolean getSurface();
    
    /**
     * Gets (as xml) the "Surface" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSurface();
    
    /**
     * True if has "Surface" element
     */
    boolean isSetSurface();
    
    /**
     * Sets the "Surface" element
     */
    void setSurface(boolean surface);
    
    /**
     * Sets (as xml) the "Surface" element
     */
    void xsetSurface(org.apache.xmlbeans.XmlBoolean surface);
    
    /**
     * Unsets the "Surface" element
     */
    void unsetSurface();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.RaceChange parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.RaceChange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
