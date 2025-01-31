
package com.training.jetAirways;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training.jetAirways package. 
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

    private final static QName _CheckAvailablityResponse_QNAME = new QName("http://ifaces.training.com/", "checkAvailablityResponse");
    private final static QName _CheckAvailablity_QNAME = new QName("http://ifaces.training.com/", "checkAvailablity");
    private final static QName _JetAirways_QNAME = new QName("http://ifaces.training.com/", "jetAirways");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training.jetAirways
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckAvailablity }
     * 
     */
    public CheckAvailablity createCheckAvailablity() {
        return new CheckAvailablity();
    }

    /**
     * Create an instance of {@link JetAirways }
     * 
     */
    public JetAirways createJetAirways() {
        return new JetAirways();
    }

    /**
     * Create an instance of {@link CheckAvailablityResponse }
     * 
     */
    public CheckAvailablityResponse createCheckAvailablityResponse() {
        return new CheckAvailablityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailablityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "checkAvailablityResponse")
    public JAXBElement<CheckAvailablityResponse> createCheckAvailablityResponse(CheckAvailablityResponse value) {
        return new JAXBElement<CheckAvailablityResponse>(_CheckAvailablityResponse_QNAME, CheckAvailablityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailablity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "checkAvailablity")
    public JAXBElement<CheckAvailablity> createCheckAvailablity(CheckAvailablity value) {
        return new JAXBElement<CheckAvailablity>(_CheckAvailablity_QNAME, CheckAvailablity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JetAirways }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "jetAirways")
    public JAXBElement<JetAirways> createJetAirways(JetAirways value) {
        return new JAXBElement<JetAirways>(_JetAirways_QNAME, JetAirways.class, null, value);
    }

}
