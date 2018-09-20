package com.training.domains;

public class VehicleInsurance extends Insurance {

	private String vehicleType;
	private int yearOfManufacture;
	
	

	public VehicleInsurance(long policyNo, String policyHolderName, String vehicleType, int yearOfManufacture) {
		super(policyNo, policyHolderName);
		this.vehicleType = vehicleType;
		this.yearOfManufacture = yearOfManufacture;
	}



	public String getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}



	public int getYearOfManufacture() {
		return yearOfManufacture;
	}



	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}



	@Override
	public double calculatePremium() {
		double premium=0.0;
		if(this.vehicleType == "bike"){
			switch(this.yearOfManufacture){
			case 2017:
				premium=200;
				break;
			case 2018:
				premium=300;
				break;
			default:
				premium=400;
			}
		}
		else{
			switch(this.yearOfManufacture){
			case 2017:
				premium=1200;
				break;
			case 2018:
				premium=1300;
				break;
			default:
				premium=1400;
			}
		}
		return premium;
	}

}
