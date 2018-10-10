package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.training.BloodDonor;
import com.training.connection.DbConnection;

public class BloodDaoImpl implements BloodDao{
	
	Connection con;
	public BloodDaoImpl() {
		super();
		DbConnection db= new DbConnection();
		try {
			con=db.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<BloodDonor> displayByLocation(String location) {
		String sql = "select * from bloodash where location=?";
		PreparedStatement psmst = null;
		List<BloodDonor> donorList = new ArrayList<>();
		try {
			psmst = con.prepareStatement(sql);
			psmst.setString(1, location);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				String donorName = rs.getString("name");
				String bloodGroup = rs.getString("bloodgroup");
				String donorlocation = rs.getString("location");
				int donation = rs.getInt("donation");
				long mobileNumber = rs.getLong("mobile");
				BloodDonor donor = new BloodDonor(donorName, bloodGroup, donorlocation, donation, mobileNumber);
				donorList.add(donor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return donorList;
	}

	@Override
	public List<BloodDonor> displayByGroup(String group) {
		String sql = "select * from bloodash where bloodgroup=?";
		PreparedStatement psmst = null;
		List<BloodDonor> donorList = new ArrayList<>();
		try {
			psmst = con.prepareStatement(sql);
			psmst.setString(1, group);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				String donorName = rs.getString("name");
				String bloodGroup = rs.getString("bloodgroup");
				String donorlocation = rs.getString("location");
				int donation = rs.getInt("donation");
				long mobileNumber = rs.getLong("mobile");
				BloodDonor donor = new BloodDonor(donorName, bloodGroup, donorlocation, donation, mobileNumber);
				donorList.add(donor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return donorList;
	}

	@Override
	public int addDonor(BloodDonor donor) {
		String sql = "insert into bloodash values(?,?,?,?,?)";
		PreparedStatement psmst = null;
		int rowAdded = 0;
		
		try {
			psmst = con.prepareStatement(sql);
			psmst.setString(1, donor.getDonorName());
			psmst.setString(2, donor.getBloodGroup());
			psmst.setString(3, donor.getLocation());
			psmst.setInt(4, donor.getDonation());
			psmst.setLong(5, donor.getMobileNumber());
			rowAdded = psmst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowAdded;
	}

	@Override
	public String updateDonationCount(long mobile, BloodDonor donor) {
		String sql = "update bloodash set donation=? where mobile=?";
		PreparedStatement psmst = null;
		int rowUpdated = 0;
		try{
			psmst = con.prepareStatement(sql);
			psmst.setInt(1, donor.getDonation());
			psmst.setLong(2, mobile);
			rowUpdated = psmst.executeUpdate();
		}catch (Exception e) {
		}
		return donor.getDonorName()+" Donation Count changed to "+donor.getDonation();
	}

	@Override
	public List<String> locationList() {
		String sql = "select distinct location from bloodash";
		PreparedStatement psmst = null;
		List<String> locationList = new ArrayList<>();
		
		try {
			psmst = con.prepareStatement(sql);
			ResultSet  rs = psmst.executeQuery();
			
			while(rs.next()){
				String location = rs.getString("location");
				
				locationList.add(location);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return locationList;
	}

	@Override
	public List<String> bloodGroupList(String location) {
		String sql = "select distinct bloodgroup from bloodash where location=?";
		PreparedStatement psmst = null;
		List<String> bloodList = new ArrayList<>();
		
		try {
			psmst = con.prepareStatement(sql);
			psmst.setString(1, location);
			ResultSet  rs = psmst.executeQuery();
			
			while(rs.next()){
				String blood = rs.getString("bloodgroup");
				
				bloodList.add(blood);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bloodList;
	}

	@Override
	public List<BloodDonor> getDonorDetails(String location, String bloodgroup) {
		String sql = "select * from bloodash where location =? and bloodgroup=?";
		PreparedStatement psmst = null;
		List<BloodDonor> donorList = new ArrayList<>();
		try {
			psmst = con.prepareStatement(sql);
			psmst.setString(1, location);
			psmst.setString(2, bloodgroup);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				String donorName = rs.getString("name");
				String bloodGroup = rs.getString("bloodgroup");
				String donorlocation = rs.getString("location");
				int donation = rs.getInt("donation");
				long mobileNumber = rs.getLong("mobile");
				BloodDonor donor = new BloodDonor(donorName, bloodGroup, donorlocation, donation, mobileNumber);
				donorList.add(donor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return donorList;
		
	}
	
}
