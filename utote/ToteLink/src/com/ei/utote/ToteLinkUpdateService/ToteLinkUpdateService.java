package com.ei.utote.ToteLinkUpdateService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-07-11T17:35:51.563-04:00
 * Generated source version: 2.7.16
 * 
 */
@WebServiceClient(name = "ToteLinkUpdateService", 
                  wsdlLocation = "file:file:/Users/jordanolin/projects/ei/eiservices/utote/ToteLink/WebContent/wsdl/ToteLinkUpdate.wsdl",
                  targetNamespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub") 
public class ToteLinkUpdateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "ToteLinkUpdateService");
    public final static QName ToteLinkUpdateSOAP = new QName("http://schema.unitedtote.com/ToteLink/2008/06/PubSub", "ToteLinkUpdateSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/Shared/projects/ei/workspace/ToteLinkUpdateCXFT7/ToteLinkUpdate.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ToteLinkUpdateService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:file:/Users/jordanolin/projects/ei/eiservices/utote/ToteLink/WebContent/wsdl/ToteLinkUpdate.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ToteLinkUpdateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ToteLinkUpdateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ToteLinkUpdateService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ToteLinkUpdateService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ToteLinkUpdateService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ToteLinkUpdateService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ToteLinkUpdate
     */
    @WebEndpoint(name = "ToteLinkUpdateSOAP")
    public ToteLinkUpdate getToteLinkUpdateSOAP() {
        return super.getPort(ToteLinkUpdateSOAP, ToteLinkUpdate.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ToteLinkUpdate
     */
    @WebEndpoint(name = "ToteLinkUpdateSOAP")
    public ToteLinkUpdate getToteLinkUpdateSOAP(WebServiceFeature... features) {
        return super.getPort(ToteLinkUpdateSOAP, ToteLinkUpdate.class, features);
    }

}
