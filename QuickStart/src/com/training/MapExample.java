package com.training;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> empList = new HashMap<>();
		
		Employee emp1 = new Employee(19,1,"sam");
		Employee emp2 = new Employee(24,2,"alex");
		Employee emp3 = new Employee(22,3,"clive");
		
		empList.put(1, emp1);
		empList.put(2, emp2);
		empList.put(3, emp3);
		
		System.out.println(empList.get(1));
	}

}
