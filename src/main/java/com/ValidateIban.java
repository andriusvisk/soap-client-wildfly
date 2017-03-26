
package com;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ValidateIban", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidateIban {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateList", targetNamespace = "http://soap/", className = "com.ValidateList")
    @ResponseWrapper(localName = "validateListResponse", targetNamespace = "http://soap/", className = "com.ValidateListResponse")
    public String validateList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://soap/", className = "com.Validate")
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://soap/", className = "com.ValidateResponse")
    public String validate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     */
    @WebMethod(operationName = "ValidateIban")
    @RequestWrapper(localName = "ValidateIban", targetNamespace = "http://soap/", className = "com.ValidateIban_Type")
    @ResponseWrapper(localName = "ValidateIbanResponse", targetNamespace = "http://soap/", className = "com.ValidateIbanResponse")
    public void validateIban();

}
