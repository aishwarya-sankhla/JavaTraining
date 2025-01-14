package com.training.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.training.BloodDonor;
import com.training.dao.BloodDaoImpl;

@Path("/donor")
public class BloodDonorResources {
	BloodDaoImpl dao;
	public BloodDonorResources() {
		super();
		dao = new BloodDaoImpl();
	}

	@GET
	@Path("findByGroup/{group}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayByGroup(@PathParam("group") String bloodGroup){
		return Response.status(200).entity(dao.displayByGroup(bloodGroup)).build();
	}
	
	@GET
	@Path("findByLocation/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayByLocation(@PathParam("location") String location){
		return Response.status(200).entity(dao.displayByLocation(location)).build();
	}
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addDonor(BloodDonor donor){
		int row=dao.addDonor(donor);
		System.out.println(row);
		return donor.toString();
	}
	
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public String update(BloodDonor donor,@QueryParam("mobile") long mobile){
		return dao.updateDonationCount(mobile, donor);
	}
	
	 @GET
	    @Path("locations")
	    @Produces(MediaType.TEXT_HTML)
	    public Response createLocLinks(){
	        StringBuilder sb=new StringBuilder();
	        List<String> locationList = dao.locationList();
	        for (String loc : locationList) {
	            URI link= UriBuilder.fromPath("groups").queryParam("loc", loc).build();
	            String a= "<a href="+link.toString()+">"+loc+"</a><br>";
	            sb.append(a);
	        }
	    
	        return Response.status(200).entity(sb.toString()).build();
	    }
	 
	 @GET
	    @Path("groups")
	    @Produces(MediaType.TEXT_HTML)
	    public Response createGroupLinks(@QueryParam("loc") String location){
	        StringBuilder sb=new StringBuilder();
	        List<String> bloodList = dao.bloodGroupList(location);
	        for (String blood : bloodList) {
	            URI link= UriBuilder.fromPath("people").queryParam("loc", location).queryParam("blood",blood ).build();
	            String a= "<a href="+link.toString()+">"+blood+"</a><br>";
	            sb.append(a);
	        }
	    
	        return Response.status(200).entity(sb.toString()).build();
	    }
	 
	 @GET
	    @Path("people")
	    @Produces(MediaType.TEXT_HTML)
	    public Response createPeopleLinks(@QueryParam("blood") String bloodgroup,@QueryParam("loc") String location){
	        StringBuilder sb=new StringBuilder();
	        List<BloodDonor> donorList = dao.getDonorDetails(location, bloodgroup);
	        for (BloodDonor donor : donorList) {
	            String a= "<p>"+donor.toString()+"</p><br>";
	            sb.append(a);
	        }
	    
	        return Response.status(200).entity(sb.toString()).build();
	    }
}
