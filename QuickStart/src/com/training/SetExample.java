package com.training;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(19,1,"sam");
		Employee emp2 = new Employee(24,2,"alex");
		Employee emp3 = new Employee(22,3,"clive");

		Employee.sortOrder = "asc";
		Set<Employee> empList = new TreeSet<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp1);
	
		empList.forEach(System.out::println);
	}

}
