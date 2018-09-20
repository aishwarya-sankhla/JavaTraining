package com.training.domains;

import com.training.ifaces.Automobile;

public class UpdatedQuoteManager extends QuoteManager {

	@Override
	public Automobile getModel(int key) {
		if(key == 3)
			return new Tractor();
		else
			return super.getModel(key);
	}
	
}
