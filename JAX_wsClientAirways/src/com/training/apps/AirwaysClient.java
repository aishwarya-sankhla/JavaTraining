package com.training.apps;

import com.training.jetAirways.AvailabilityImplService;

public class AirwaysClient {

	public static void main(String[] args) {
		AvailabilityImplService jetAirways= new AvailabilityImplService();
		com.training.spiceJet.AvailabilityImplService spiceJet = new com.training.spiceJet.AvailabilityImplService();
		System.out.println(jetAirways.getAvailabilityImplPort().checkAvailablity("Bangalore", "Delhi"));
		System.out.println(spiceJet.getAvailabilityImplPort().checkAvailablity("Delhi", "Bangalore"));
	}

}