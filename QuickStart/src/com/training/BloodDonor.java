package com.training;

public class BloodDonor {
	public BloodDonor(String donorName, int age, String bloodGroup,String gender) {
		super();
		this.donorName = donorName;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.gender=gender;
	}
	private String donorName;
	private int age;
	private String bloodGroup;
	private String gender;
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
}
