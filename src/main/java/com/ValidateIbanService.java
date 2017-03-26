
package com;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ValidateIbanService", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:8080/ibanValidation/ValidateIban?wsdl")
public class ValidateIbanService
    extends Service
{

    private final static URL VALIDATEIBANSERVICE_WSDL_LOCATION;
    private final static WebServiceException VALIDATEIBANSERVICE_EXCEPTION;
    private final static QName VALIDATEIBANSERVICE_QNAME = new QName("http://soap/", "ValidateIbanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ibanValidation/ValidateIban?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VALIDATEIBANSERVICE_WSDL_LOCATION = url;
        VALIDATEIBANSERVICE_EXCEPTION = e;
    }

    public ValidateIbanService() {
        super(__getWsdlLocation(), VALIDATEIBANSERVICE_QNAME);
    }

    public ValidateIbanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VALIDATEIBANSERVICE_QNAME, features);
    }

    public ValidateIbanService(URL wsdlLocation) {
        super(wsdlLocation, VALIDATEIBANSERVICE_QNAME);
    }

    public ValidateIbanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VALIDATEIBANSERVICE_QNAME, features);
    }

    public ValidateIbanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValidateIbanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ValidateIban
     */
    @WebEndpoint(name = "ValidateIbanPort")
    public ValidateIban getValidateIbanPort() {
        return super.getPort(new QName("http://soap/", "ValidateIbanPort"), ValidateIban.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValidateIban
     */
    @WebEndpoint(name = "ValidateIbanPort")
    public ValidateIban getValidateIbanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "ValidateIbanPort"), ValidateIban.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VALIDATEIBANSERVICE_EXCEPTION!= null) {
            throw VALIDATEIBANSERVICE_EXCEPTION;
        }
        return VALIDATEIBANSERVICE_WSDL_LOCATION;
    }

}
