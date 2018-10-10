package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.AvailabilityImpl;

public class MyPublisher {

	public static void main(String[] args) {
		try {
			
			Endpoint.publish("http://localhost:7000/flight/spiceJet", new AvailabilityImpl());
			System.out.println("Service Running");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
