package com.trining.ifaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.trining.doamin.BloodDonor;
import com.trining.doamin.Request;

@WebService
public interface DonationRequest {
	@WebMethod
	@WebResult(name="donorDetails")
	public BloodDonor getRequest(@WebParam(name="bloodGroup") String bidGroup);
}
