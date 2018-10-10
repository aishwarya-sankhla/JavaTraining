package com.trining.utils;

import javax.xml.ws.Endpoint;

import com.trining.services.CurrencyConverterImpl;
import com.trining.services.DonationRequestService;

public class MyPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5000/donation/bloodRequest", new DonationRequestService());
		System.out.println("Service Running");

	}

}
