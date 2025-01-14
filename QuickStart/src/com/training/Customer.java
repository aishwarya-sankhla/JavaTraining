package com.training;



public class Customer {
	private long CustomerId;
	private String CustomerName;
	private Address CustomerAdd;
	private long CustomerPhone;
	public Customer(long customerId, String customerName, Address customerAdd, long customerPhone) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAdd = customerAdd;
		CustomerPhone = customerPhone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Address getCustomerAdd() {
		return CustomerAdd;
	}
	public void setCustomerAdd(Address customerAdd) {
		CustomerAdd = customerAdd;
	}
	public long getCustomerPhone() {
		return CustomerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		CustomerPhone = customerPhone;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Customer cust = (Customer)obj;
		return this.CustomerId == cust.CustomerId && this.CustomerName.equals(cust.CustomerName);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("One Cutomer Object Garbage Collected="+ this.CustomerId);
		super.finalize();
	}
	
}
