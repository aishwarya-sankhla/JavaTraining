package com.training;

public class DoctorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor();
		d1.setDoctorId(101);
		d1.setDoctorName(args[0]);
		d1.setQualification(args[1]);
		
		System.out.println(d1.getDoctorId()+" "+d1.getDoctorName()+" "+d1.getQualification());
		
		Doctor d2 = new Doctor("Sam","Orthopedic",102,"MBBS",21588756,"Bangalore");
		d2.writePrescriptions();
		d2.appointments();
	}

}
