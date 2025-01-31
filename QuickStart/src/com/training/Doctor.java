package com.training;

public class Doctor {
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Doctor(String doctorName) {
		super();
		this.doctorName = doctorName;
	}

	public Doctor(String doctorName, String department, int doctorId, String qualification, int phone,
			String location) {
		super();
		this.doctorName = doctorName;
		this.department = department;
		this.doctorId = doctorId;
		Qualification = qualification;
		this.phone = phone;
		this.location = location;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	private String doctorName;
	private String department;
	private int doctorId;
	private String Qualification;
	private int phone;
	private String location;
	
	
	public void writePrescriptions(){
		System.out.println("Prescription generated");
	}
	public void appointments(){
		System.out.println("Appointments Full");
	}
	public void diagnosis(){
		System.out.println("Diagnosis Complete");
	}
	
	public void test(){
		System.out.println("Tests");
	}
}
