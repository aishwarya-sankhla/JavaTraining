
package com.trining.ifaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trining.ifaces package. 
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

    private final static QName _BloodDonor_QNAME = new QName("http://ifaces.trining.com/", "bloodDonor");
    private final static QName _GetRequest_QNAME = new QName("http://ifaces.trining.com/", "getRequest");
    private final static QName _GetRequestResponse_QNAME = new QName("http://ifaces.trining.com/", "getRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trining.ifaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRequestResponse }
     * 
     */
    public GetRequestResponse createGetRequestResponse() {
        return new GetRequestResponse();
    }

    /**
     * Create an instance of {@link BloodDonor }
     * 
     */
    public BloodDonor createBloodDonor() {
        return new BloodDonor();
    }

    /**
     * Create an instance of {@link GetRequest }
     * 
     */
    public GetRequest createGetRequest() {
        return new GetRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BloodDonor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.trining.com/", name = "bloodDonor")
    public JAXBElement<BloodDonor> createBloodDonor(BloodDonor value) {
        return new JAXBElement<BloodDonor>(_BloodDonor_QNAME, BloodDonor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.trining.com/", name = "getRequest")
    public JAXBElement<GetRequest> createGetRequest(GetRequest value) {
        return new JAXBElement<GetRequest>(_GetRequest_QNAME, GetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.trining.com/", name = "getRequestResponse")
    public JAXBElement<GetRequestResponse> createGetRequestResponse(GetRequestResponse value) {
        return new JAXBElement<GetRequestResponse>(_GetRequestResponse_QNAME, GetRequestResponse.class, null, value);
    }

}
