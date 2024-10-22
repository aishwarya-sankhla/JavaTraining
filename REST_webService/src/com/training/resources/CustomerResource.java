package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
		
		return Response.status(200).entity(CustomerDetails.getAllCustomers()).build();
	}
	
	
	@GET
	@Path("findById/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findCustomerById(@PathParam("custId") long customerId){
		Customer cust = CustomerDetails.getCustomer(customerId);
		return Response.status(200).entity(cust).build();
	}
	
	@DELETE
	@Path("remove")
	public String removeCustomer(@QueryParam("custId") long customerId){
		return CustomerDetails.removeCustomer(customerId);
	}
	
	@POST
	@Path("add")
	@Produces(MediaType.TEXT_PLAIN)
	public String addCustomer(@FormParam("customerId") long customerId, @FormParam("customerName") String customerName, @FormParam("mobileNumber")long mobileNumber){
		return CustomerDetails.AddCustomer(new Customer(customerId, customerName, mobileNumber));
	}
	
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateMobileNumber(Customer cust,@QueryParam("custId") long customerId){
		return CustomerDetails.updateMobileNumber(cust,customerId);
	}
	
	@POST
	@Path("addAsJson")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addCustomer(Customer cust){
		
		CustomerDetails.AddCustomer(cust);
		return cust.toString();
	}
}
