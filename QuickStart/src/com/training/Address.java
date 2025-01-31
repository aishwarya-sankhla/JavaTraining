package com.training;

public class Address {
	private String Address1;
	private String Address2;
	private long pincode;
	public Address(String address1, String address2, long pincode) {
		super();
		this.Address1 = address1;
		this.Address2 = address2;
		
		if(pincode<0){
		try{	
			throw new Exception("Pincode should not be negative");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			}
		}
		else
			this.pincode = pincode;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) throws Exception {
		if(pincode<0)
			throw new Exception("Pincode Should be positive");
		else
		  this.pincode = pincode;
	}
	
}
