package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.AvailabilityImpl;


public class MyPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5000/flight/jetAirways", new AvailabilityImpl());
		System.out.println("Service Running");

	}

}
