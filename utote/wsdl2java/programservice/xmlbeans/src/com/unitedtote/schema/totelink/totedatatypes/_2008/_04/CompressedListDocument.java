/*
 * An XML document type.
 * Localname: CompressedList
 * Namespace: http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04
 * Java type: com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink.totedatatypes._2008._04;


/**
 * A document containing one CompressedList(@http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04) element.
 *
 * This is a complex type.
 */
public interface CompressedListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompressedListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("compressedlistdda2doctype");
    
    /**
     * Gets the "CompressedList" element
     */
    java.lang.String getCompressedList();
    
    /**
     * Gets (as xml) the "CompressedList" element
     */
    com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList xgetCompressedList();
    
    /**
     * Tests for nil "CompressedList" element
     */
    boolean isNilCompressedList();
    
    /**
     * Sets the "CompressedList" element
     */
    void setCompressedList(java.lang.String compressedList);
    
    /**
     * Sets (as xml) the "CompressedList" element
     */
    void xsetCompressedList(com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList compressedList);
    
    /**
     * Nils the "CompressedList" element
     */
    void setNilCompressedList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument newInstance() {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
