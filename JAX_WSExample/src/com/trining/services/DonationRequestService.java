package com.trining.services;

import java.util.HashMap;

import javax.jws.WebService;

import com.trining.doamin.BloodDonor;
import com.trining.ifaces.DonationRequest;

@WebService(endpointInterface="com.trining.ifaces.DonationRequest")
public class DonationRequestService implements DonationRequest{

	private HashMap<String, BloodDonor> donorList;
	public DonationRequestService() {
		super();
		donorList = new HashMap<>();
		donorList.put("apos", new BloodDonor("sam", "O+", "Bangalore", 5, 101));
		donorList.put("bpos", new BloodDonor("john", "O-", "Bangalore", 4, 102));
		donorList.put("cpos", new BloodDonor("dan", "A+", "Hyderabad", 3, 103));
	}

	@Override
	public BloodDonor getRequest(String bidGroup) {
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return donorList.get(bidGroup);
	}

}
