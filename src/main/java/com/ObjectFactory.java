
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateList_QNAME = new QName("http://soap/", "validateList");
    private final static QName _ValidateIbanResponse_QNAME = new QName("http://soap/", "ValidateIbanResponse");
    private final static QName _Validate_QNAME = new QName("http://soap/", "validate");
    private final static QName _ValidateListResponse_QNAME = new QName("http://soap/", "validateListResponse");
    private final static QName _ValidateIban_QNAME = new QName("http://soap/", "ValidateIban");
    private final static QName _ValidateResponse_QNAME = new QName("http://soap/", "validateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateIban_Type }
     * 
     */
    public ValidateIban_Type createValidateIban_Type() {
        return new ValidateIban_Type();
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link ValidateIbanResponse }
     * 
     */
    public ValidateIbanResponse createValidateIbanResponse() {
        return new ValidateIbanResponse();
    }

    /**
     * Create an instance of {@link ValidateList }
     * 
     */
    public ValidateList createValidateList() {
        return new ValidateList();
    }

    /**
     * Create an instance of {@link Validate }
     * 
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link ValidateListResponse }
     * 
     */
    public ValidateListResponse createValidateListResponse() {
        return new ValidateListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "validateList")
    public JAXBElement<ValidateList> createValidateList(ValidateList value) {
        return new JAXBElement<ValidateList>(_ValidateList_QNAME, ValidateList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateIbanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ValidateIbanResponse")
    public JAXBElement<ValidateIbanResponse> createValidateIbanResponse(ValidateIbanResponse value) {
        return new JAXBElement<ValidateIbanResponse>(_ValidateIbanResponse_QNAME, ValidateIbanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "validate")
    public JAXBElement<Validate> createValidate(Validate value) {
        return new JAXBElement<Validate>(_Validate_QNAME, Validate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "validateListResponse")
    public JAXBElement<ValidateListResponse> createValidateListResponse(ValidateListResponse value) {
        return new JAXBElement<ValidateListResponse>(_ValidateListResponse_QNAME, ValidateListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateIban_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ValidateIban")
    public JAXBElement<ValidateIban_Type> createValidateIban(ValidateIban_Type value) {
        return new JAXBElement<ValidateIban_Type>(_ValidateIban_QNAME, ValidateIban_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "validateResponse")
    public JAXBElement<ValidateResponse> createValidateResponse(ValidateResponse value) {
        return new JAXBElement<ValidateResponse>(_ValidateResponse_QNAME, ValidateResponse.class, null, value);
    }

}
