
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ei.utote.ToteLinkUpdateService;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-07-11T17:35:51.519-04:00
 * Generated source version: 2.7.16
 * 
 */

@javax.jws.WebService(
                      serviceName = "ToteLinkUpdateService",
                      portName = "ToteLinkUpdateSOAP",
                      targetNamespace = "http://schema.unitedtote.com/ToteLink/2008/06/PubSub",
                      wsdlLocation = "file:/Users/Shared/projects/ei/workspace/ToteLinkUpdateCXFT7/ToteLinkUpdate.wsdl",
                      endpointInterface = "com.ei.utote.ToteLinkUpdateService.ToteLinkUpdate")
                      
public class ToteLinkUpdateImpl implements ToteLinkUpdate {

    private static final Logger LOG = Logger.getLogger(ToteLinkUpdateImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ei.utote.ToteLinkUpdateService.ToteLinkUpdate#statusNotification(com.ei.utote.ToteLinkUpdateService.StatusChange  parameters )*
     */
    public void statusNotification(StatusChange parameters) { 
        LOG.info("Executing operation statusNotification");
        System.out.println(parameters);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ei.utote.ToteLinkUpdateService.ToteLinkUpdate#updateNotification(com.ei.utote.ToteLinkUpdateService.Updates  parameters )*
     */
    public void updateNotification(Updates parameters) { 
        LOG.info("Executing operation updateNotification");
        System.out.println(parameters);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
