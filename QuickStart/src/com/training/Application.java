package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("Gandhi nagar", "Street 1", -561021);
		Address add2 = new Address("Nehru nagar", "Street 2", 561021);
		
		Customer c1 = new Customer(101, "Sam", add1, 9980577);
		
		Customer c2 = new Customer(102, "Sam", add1, 9980577);
		c2 = null;
		System.gc();
		Customer c3 = null;
		
		System.out.println("Equal:" + c1.equals(c2));
		
		
		System.out.println("Null:"+ c1.equals(c3));
		System.out.println(c1.getCustomerAdd().getPincode());
		
		
		/*Customer c4 = new Customer();
		try {
			c4.getCustomerAdd().setPincode(-4567);
		} catch (Exception e) {
			
			e.printStackTrace();
		}*/
		
		Employee emp = new Employee();
		emp.setAge(17);

		try {
			Employee emp1 = new Employee(17);
		} catch (RangeCheck e) {
			e.printStackTrace();
		}
	}

}
