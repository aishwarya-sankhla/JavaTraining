package com.training;

public class BloodDonorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BloodDonor donor =new BloodDonor();
		donor.setAge(22);
		donor.setDonorName("Ash");
		
		System.out.println(donor.getAge());
		System.out.println(donor.getDonorName());
		
		BloodDonor newDonor= new BloodDonor("Sam",22,"O+","M");
		System.out.println(newDonor.getDonorName());
		System.out.println(newDonor.getAge());
		System.out.println(newDonor.getBloodGroup());
		System.out.println(newDonor.getGender());
	}

}
