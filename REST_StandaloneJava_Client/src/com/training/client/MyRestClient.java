package com.training.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.bean.Customer;

public class MyRestClient {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/REST_webService/rest/");
		String response = target.path("quick").request().get(String.class);
		
		System.out.println(response);
		
//		String delResponse = target.path("customer/remove").queryParam("custId", 101).request().delete(String.class);
//		System.out.println(delResponse);
		
		Customer cust = new Customer(102,"John",122111);
		Response updateResp = target.path("customer/update").queryParam("custId", 102).request().put(Entity.entity(cust, MediaType.APPLICATION_JSON));
		System.out.println(updateResp);
	}
}
