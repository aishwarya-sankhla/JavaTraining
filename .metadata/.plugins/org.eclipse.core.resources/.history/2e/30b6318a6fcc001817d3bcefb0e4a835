package com.trining.utils;

import javax.xml.ws.Endpoint;

import com.trining.services.CurrencyConverterImpl;

public class MyPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5000/converter", new CurrencyConverterImpl());
		System.out.println("Service Running");

	}

}
