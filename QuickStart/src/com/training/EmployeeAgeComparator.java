package com.training;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()>o2.getAge())
			return 1;
		if(o1.getAge()<o2.getAge())
			return -1;
		return 0;
	}

}
