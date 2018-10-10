package com.trining.doamin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BloodDonor {
	
	@XmlElement
	private String donorName;

	@XmlElement
	private String bloodGroup;

	@XmlElement
	private String location;

	@XmlElement
	private int donation;
	@XmlAttribute
	private long mobileNumber;
	
	public BloodDonor() {
		super();
	}
	
	
	public BloodDonor(String donorName, String bloodGroup, String location, int donation, long mobileNumber) {
		super();
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.location = location;
		this.donation = donation;
		this.mobileNumber = mobileNumber;
	}


	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDonation() {
		return donation;
	}
	public void setDonation(int donation) {
		this.donation = donation;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	@Override
	public String toString() {
		return "BloodDonor [donorName=" + donorName + ", bloodGroup=" + bloodGroup + ", location=" + location
				+ ", donation=" + donation + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
