package com.training.ifaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.domain.SpiceJet;

@WebService
public interface Availability {
	@WebMethod
	@WebResult(name="flightDetails")
	public List<SpiceJet> checkAvailablity(@WebParam(name="source") String source,@WebParam(name="destination")String destination);
}
