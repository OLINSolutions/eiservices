/*
 * XML Type:  PoolPrice
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PoolPrice
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result;


/**
 * An XML PoolPrice(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public interface PoolPrice extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PoolPrice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF27F4C75A2A2BD676C38937D3070B9F5").resolveHandle("poolprice91b0type");
    
    /**
     * Gets the "Prices" element
     */
    com.unitedtote.schema.totelink._2008._06.result.Prices getPrices();
    
    /**
     * Tests for nil "Prices" element
     */
    boolean isNilPrices();
    
    /**
     * True if has "Prices" element
     */
    boolean isSetPrices();
    
    /**
     * Sets the "Prices" element
     */
    void setPrices(com.unitedtote.schema.totelink._2008._06.result.Prices prices);
    
    /**
     * Appends and returns a new empty "Prices" element
     */
    com.unitedtote.schema.totelink._2008._06.result.Prices addNewPrices();
    
    /**
     * Nils the "Prices" element
     */
    void setNilPrices();
    
    /**
     * Unsets the "Prices" element
     */
    void unsetPrices();
    
    /**
     * Gets the "PoolId" element
     */
    java.lang.String getPoolId();
    
    /**
     * Gets (as xml) the "PoolId" element
     */
    org.apache.xmlbeans.XmlString xgetPoolId();
    
    /**
     * Tests for nil "PoolId" element
     */
    boolean isNilPoolId();
    
    /**
     * Sets the "PoolId" element
     */
    void setPoolId(java.lang.String poolId);
    
    /**
     * Sets (as xml) the "PoolId" element
     */
    void xsetPoolId(org.apache.xmlbeans.XmlString poolId);
    
    /**
     * Nils the "PoolId" element
     */
    void setNilPoolId();
    
    /**
     * Gets the "PoolName" element
     */
    java.lang.String getPoolName();
    
    /**
     * Gets (as xml) the "PoolName" element
     */
    org.apache.xmlbeans.XmlString xgetPoolName();
    
    /**
     * Tests for nil "PoolName" element
     */
    boolean isNilPoolName();
    
    /**
     * True if has "PoolName" element
     */
    boolean isSetPoolName();
    
    /**
     * Sets the "PoolName" element
     */
    void setPoolName(java.lang.String poolName);
    
    /**
     * Sets (as xml) the "PoolName" element
     */
    void xsetPoolName(org.apache.xmlbeans.XmlString poolName);
    
    /**
     * Nils the "PoolName" element
     */
    void setNilPoolName();
    
    /**
     * Unsets the "PoolName" element
     */
    void unsetPoolName();
    
    /**
     * Gets the "Refund" element
     */
    boolean getRefund();
    
    /**
     * Gets (as xml) the "Refund" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRefund();
    
    /**
     * True if has "Refund" element
     */
    boolean isSetRefund();
    
    /**
     * Sets the "Refund" element
     */
    void setRefund(boolean refund);
    
    /**
     * Sets (as xml) the "Refund" element
     */
    void xsetRefund(org.apache.xmlbeans.XmlBoolean refund);
    
    /**
     * Unsets the "Refund" element
     */
    void unsetRefund();
    
    /**
     * Gets the "CarryOver" element
     */
    java.math.BigDecimal getCarryOver();
    
    /**
     * Gets (as xml) the "CarryOver" element
     */
    org.apache.xmlbeans.XmlDecimal xgetCarryOver();
    
    /**
     * Tests for nil "CarryOver" element
     */
    boolean isNilCarryOver();
    
    /**
     * True if has "CarryOver" element
     */
    boolean isSetCarryOver();
    
    /**
     * Sets the "CarryOver" element
     */
    void setCarryOver(java.math.BigDecimal carryOver);
    
    /**
     * Sets (as xml) the "CarryOver" element
     */
    void xsetCarryOver(org.apache.xmlbeans.XmlDecimal carryOver);
    
    /**
     * Nils the "CarryOver" element
     */
    void setNilCarryOver();
    
    /**
     * Unsets the "CarryOver" element
     */
    void unsetCarryOver();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.result.PoolPrice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.result.PoolPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
