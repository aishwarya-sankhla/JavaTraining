package com.training;
import java.util.*;

public interface EmployeeApi {
	public boolean add(Employee ...emp);
	public List<Employee> findAll();
	public List<Employee> SortByAge();
	public List<Employee> SortById();
	public List<Employee> SortByName();
}
