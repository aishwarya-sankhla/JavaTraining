package com.training.domains;

import com.training.ifaces.Automobile;

public class BajajBike implements Automobile {

	@Override
	public String getModel() {
		return "Pulsar";
	}

	@Override
	public String getColor() {
		 return "Midnight Black";
	}

	@Override
	public double getPrice() {
		 return 200000;
	}

}
