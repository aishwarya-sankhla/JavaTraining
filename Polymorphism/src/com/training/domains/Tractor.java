package com.training.domains;

import com.training.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getModel() {
		return "John Deer";
	}

	@Override
	public String getColor() {
		return "red";
	}

	@Override
	public double getPrice() {
		return 1300000;
	}

}
