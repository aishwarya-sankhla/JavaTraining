package com.training.domains;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getModel() {
		return "Swift-Dzire";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000;
	}

}
