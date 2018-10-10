package com.trining.services;

import javax.jws.WebService;

import com.trining.ifaces.CurrencyConverter;

@WebService(endpointInterface="com.trining.ifaces.CurrencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {

	@Override
	public double dollarToRupees(double dlrAmt) {
		
		return dlrAmt*74;
	}

}
