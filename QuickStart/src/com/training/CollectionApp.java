package com.training;

import java.util.List;
import java.util.Scanner;

public class CollectionApp {

	public static void printEmployees(){
		
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee(19,1,"sam");
		Employee emp2 = new Employee(24,2,"alex");
		Employee emp3 = new Employee(22,3,"clive");
		
		
		EmployeeService elist = new EmployeeService();
		elist.add(emp1,emp2,emp3);
		
		printEmployees();
		
		//List<Employee> serv = elist.findAll();
		Employee.sortOrder="dcs";
		List<Employee> serv = elist.SortById();
		
		for(Employee e:serv){
			System.out.println(e.getId());
		}
		
		List<Employee> empByName = elist.SortByName();
		
		for(Employee e:empByName){
			System.out.println(e.getName());
		}

	
		List<Employee> empByAge = elist.SortByAge();
	
		for(Employee e:empByAge){
			System.out.println(e.getAge());
		}
}
}
