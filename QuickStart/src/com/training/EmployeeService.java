package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService implements EmployeeApi {
	
	List<Employee> empList;
	
	public EmployeeService() {
		super();
		empList = new ArrayList<>();
	}

	@Override
	public boolean add(Employee ...emps) {
		boolean result = false;
		for(Employee emp : emps)
			result = empList.add(emp);
		return result;
	}

	@Override
	public List<Employee> findAll() {
		return this.empList;
	}

	@Override
	public List<Employee> SortByAge() {
		Collections.sort(empList, new EmployeeAgeComparator()); 
		return this.empList;
	}

	@Override
	public List<Employee> SortById() {
		Collections.sort(empList);
		return this.empList;
	}

	@Override
	public List<Employee> SortByName() {
		Collections.sort(empList,new EmployeeNameComparator());
		return this.empList;
	}

}
