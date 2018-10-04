package com.training.impl;

import java.util.List;

import com.training.bean.Customer;

public interface CustomerDao {
	public int AddCustomer(Customer cust);
	public List<Customer> findAll();
}
