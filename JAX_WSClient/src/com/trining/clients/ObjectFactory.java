
package com.trining.clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trining.clients package. 
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

    private final static QName _DollarToRupees_QNAME = new QName("http://ifaces.trining.com/", "dollarToRupees");
    private final static QName _DollarToRupeesResponse_QNAME = new QName("http://ifaces.trining.com/", "dollarToRupeesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trining.clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DollarToRupeesResponse }
     * 
     */
    public DollarToRupeesResponse createDollarToRupeesResponse() {
        return new DollarToRupeesResponse();
    }

    /**
     * Create an instance of {@link DollarToRupees }
     * 
     */
    public DollarToRupees createDollarToRupees() {
        return new DollarToRupees();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.trining.com/", name = "dollarToRupees")
    public JAXBElement<DollarToRupees> createDollarToRupees(DollarToRupees value) {
        return new JAXBElement<DollarToRupees>(_DollarToRupees_QNAME, DollarToRupees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.trining.com/", name = "dollarToRupeesResponse")
    public JAXBElement<DollarToRupeesResponse> createDollarToRupeesResponse(DollarToRupeesResponse value) {
        return new JAXBElement<DollarToRupeesResponse>(_DollarToRupeesResponse_QNAME, DollarToRupeesResponse.class, null, value);
    }

}
