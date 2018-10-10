package com.training.dao;

import java.util.List;

import com.training.BloodDonor;

public interface BloodDao {
	public List<BloodDonor> displayByLocation(String location);
	public List<BloodDonor> displayByGroup(String group);
	public int addDonor(BloodDonor donor);
	public String updateDonationCount(long mobile,BloodDonor donor);
	public List<String> locationList();
	public List<String> bloodGroupList(String location);
	public List<BloodDonor> getDonorDetails(String location,String bloodgroup);
}
