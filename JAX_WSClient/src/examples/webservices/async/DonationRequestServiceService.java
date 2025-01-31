
package examples.webservices.async;

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
@WebServiceClient(name = "DonationRequestServiceService", targetNamespace = "http://services.trining.com/", wsdlLocation = "http://localhost:5000/donation/bloodRequest?wsdl")
public class DonationRequestServiceService
    extends Service
{

    private final static URL DONATIONREQUESTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException DONATIONREQUESTSERVICESERVICE_EXCEPTION;
    private final static QName DONATIONREQUESTSERVICESERVICE_QNAME = new QName("http://services.trining.com/", "DonationRequestServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5000/donation/bloodRequest?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DONATIONREQUESTSERVICESERVICE_WSDL_LOCATION = url;
        DONATIONREQUESTSERVICESERVICE_EXCEPTION = e;
    }

    public DonationRequestServiceService() {
        super(__getWsdlLocation(), DONATIONREQUESTSERVICESERVICE_QNAME);
    }

    public DonationRequestServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DONATIONREQUESTSERVICESERVICE_QNAME, features);
    }

    public DonationRequestServiceService(URL wsdlLocation) {
        super(wsdlLocation, DONATIONREQUESTSERVICESERVICE_QNAME);
    }

    public DonationRequestServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DONATIONREQUESTSERVICESERVICE_QNAME, features);
    }

    public DonationRequestServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DonationRequestServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DonationRequest
     */
    @WebEndpoint(name = "DonationRequestServicePort")
    public DonationRequest getDonationRequestServicePort() {
        return super.getPort(new QName("http://services.trining.com/", "DonationRequestServicePort"), DonationRequest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DonationRequest
     */
    @WebEndpoint(name = "DonationRequestServicePort")
    public DonationRequest getDonationRequestServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.trining.com/", "DonationRequestServicePort"), DonationRequest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DONATIONREQUESTSERVICESERVICE_EXCEPTION!= null) {
            throw DONATIONREQUESTSERVICESERVICE_EXCEPTION;
        }
        return DONATIONREQUESTSERVICESERVICE_WSDL_LOCATION;
    }

}
