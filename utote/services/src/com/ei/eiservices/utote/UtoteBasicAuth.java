/**
 * 
 */
package com.ei.eiservices.utote;

import org.apache.axis2.transport.http.HttpTransportProperties;

/**
 * @author jordanolin
 *
 */
public class UtoteBasicAuth {
	
	static public HttpTransportProperties.Authenticator getBasicAuth() {
    	HttpTransportProperties.Authenticator basicAuthentication = new HttpTransportProperties.Authenticator();
    	String configStr = Configurator.getBasicAuthUsername();
    	basicAuthentication.setUsername(configStr);
    	configStr = Configurator.getBasicAuthPassword();
    	basicAuthentication.setPassword(configStr);
    	return basicAuthentication;
    }

}
