package com.training.utils;

import java.util.HashMap;

import com.training.bean.Customer;

public class CustomerDetails {
	private static HashMap<Long, Customer> custList;
	static{
		custList = new HashMap<>();
		
		custList.put(101L, new Customer(101,"Sam",15882));
		custList.put(102L, new Customer(102,"John",15852));
	}
	
	public static Customer getCustomer(long key) {
		return custList.get(key);
	}
	
	public static HashMap<Long, Customer> getAllCustomers(){
		return custList;
	}
	
	public static String AddCustomer(Customer cust) {
		String message = "Added";
		Customer result = (Customer)custList.put(cust.getCustomerId(), cust);
		if(result!=null){
			message="Replaced";
		}
		return message;
	}
	
	public static String removeCustomer(long key){
		Customer cust=custList.remove(key);
		return cust.getCustomerName();
	}
	
	public static String updateMobileNumber(Customer cust,long key){
		custList.put(key,cust);
		return cust.getCustomerName()+ "Number Changed to "+cust.getMobileNumber();
	}
}
