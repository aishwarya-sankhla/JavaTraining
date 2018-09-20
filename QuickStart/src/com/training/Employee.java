package com.training;

public class Employee implements Comparable<Employee>{
	private int age;
	private int id;
	private String name;
	public static String sortOrder;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int age) throws RangeCheck{
		super();
		if(age<18 || age>50 )
			throw new RangeCheck("Not within range");
		else
			
			this.age = age;
		
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", id=" + id + ", name=" + name + "]";
	}

	public Employee(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		if(age<18 || age>50 )
		try{
				throw new RangeCheck("Not within range");
		}
		catch(RangeCheck e){
			System.out.println(e.getMessage());
		}
		else
			this.age = age;
		
	}

	@Override
	public int compareTo(Employee otherobj) {
		if(sortOrder.equalsIgnoreCase("asc")){
			if(this.id>otherobj.id)
				return 1;
			if(this.id<otherobj.id)
				return -1;}
		if(sortOrder.equalsIgnoreCase("dsc")){
			if(this.id>otherobj.id)
				return -1;
			if(this.id<otherobj.id)
				return 1;}
		return 0;
	}


	public Employee(int age, int id) {
		super();
		this.age = age;
		this.id = id;
	}
	
}
