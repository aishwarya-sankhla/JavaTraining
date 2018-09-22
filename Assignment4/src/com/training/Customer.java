package com.training;

import java.util.HashMap;
import java.util.HashSet;

public class Customer {
	private int custId;
	private String custName;
	private HashMap<Customer, HashSet<Item>> c_bill;
	HashSet<Item> custItems;
	
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
		c_bill= new HashMap<>();
		custItems= new HashSet<>();
	}
	
	public HashMap<Customer, HashSet<Item>> getC_bill() {
		return c_bill;
	}

	public void setC_bill(HashMap<Customer, HashSet<Item>> c_bill) {
		this.c_bill = c_bill;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
}
