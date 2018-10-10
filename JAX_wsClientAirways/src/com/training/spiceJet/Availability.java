
package com.training.spiceJet;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Availability", targetNamespace = "http://ifaces.training.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Availability {


    /**
     * 
     * @param destination
     * @param source
     * @return
     *     returns java.util.List<com.training.spiceJet.SpiceJet>
     */
    @WebMethod
    @WebResult(name = "flightDetails", targetNamespace = "")
    @RequestWrapper(localName = "checkAvailablity", targetNamespace = "http://ifaces.training.com/", className = "com.training.spiceJet.CheckAvailablity")
    @ResponseWrapper(localName = "checkAvailablityResponse", targetNamespace = "http://ifaces.training.com/", className = "com.training.spiceJet.CheckAvailablityResponse")
    @Action(input = "http://ifaces.training.com/Availability/checkAvailablityRequest", output = "http://ifaces.training.com/Availability/checkAvailablityResponse")
    public List<SpiceJet> checkAvailablity(
        @WebParam(name = "source", targetNamespace = "")
        String source,
        @WebParam(name = "destination", targetNamespace = "")
        String destination);

}
