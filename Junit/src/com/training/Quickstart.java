package com.training;

public class Quickstart {
	
	public String getMessage(){
		return "Hello".toUpperCase();
	}
	
	//Check if the value is =5000
	//check if the value is >5000
	//check if the value is <5000
	//check if the argument is negative
	//if the value is negative it should throw exception
	//NegativeValue exception
	//message amount should be positive
	public double calculateDiscount(double amount){
		double discount = 0.0;
			if(amount<0){
				throw new IllegalArgumentException("Amount should be negative");
			}
			if(amount>5000){
				discount = 0.10;
			}else{
				discount = 0.15;
			}
		
		return discount;
	}
}
