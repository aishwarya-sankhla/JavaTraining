package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.training.bean.*;
import com.training.utils.CustomerDetails;

@Path("/customer")
public class CustomerResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCustomer(){
		return Response.status(200).entity(new Customer(101, "Sam", 895234).toString()).build();
	}
	
	@GET
	@Path("xmlFmt")
	@Produces(MediaType.APPLICATION_XML)
	public Response getCustomerAsXML(){
		Customer cust = new Customer(101, "Sam", 895234);
		return Response.status(200).entity(cust).build();
	}
	
	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerAsJSon(){
		Customer cust = new Customer(101, "Sam", 895234);
		
		HashMap<Integer, Customer> custList = new HashMap<>();
		custList.put(1, cust);
		return Response.status(200).entity(custList).build();
	}
	
	
	@GET
	@Path("findById/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findCustomerById(@PathParam("custId") long customerId){
		Customer cust = CustomerDetails.getCustomer(customerId);
		return Response.status(200).entity(cust).build();
	}
}
