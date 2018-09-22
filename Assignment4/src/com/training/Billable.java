package com.training;

import java.util.HashMap;
import java.util.HashSet;

public interface Billable {
	public HashMap<Customer,HashSet<Item>> makeBill(Customer cust);
	public HashMap<Customer,HashSet<Item>> makeBill(Customer cust,Item item);
}
