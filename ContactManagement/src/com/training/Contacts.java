package com.training;

import java.math.BigInteger;

public class Contacts {
	private String phoneNo;
	
	public Contacts(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "[phoneNo=" + phoneNo + "]";
	}
	
	
}
