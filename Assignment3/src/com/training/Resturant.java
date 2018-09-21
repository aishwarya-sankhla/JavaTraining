package com.training;

import java.io.Serializable;

public class Resturant implements Comparable<Resturant>,Serializable {
	private String resturantName;
	private String location;
	private long phoneNumber;
	private int rating;
	
	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Resturant(String resturantName, String location, long phoneNumber, int rating) {
		super();
		this.resturantName = resturantName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
	}

	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Resturant o) {
		if(this.rating>o.rating)
			return 1;
		if(this.rating<o.rating)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return resturantName + ","+ location + "," + phoneNumber + "," + rating;
	}
	
	
	
}
