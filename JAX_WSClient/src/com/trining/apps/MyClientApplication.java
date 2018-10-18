package com.trining.apps;

import com.trining.calculator.Add;
import com.trining.calculator.Calculator;
import com.trining.calculator.CalculatorSoap;
import com.trining.clients.CurrencyConverter;
import com.trining.clients.CurrencyConverterImplService;

public class MyClientApplication {

	public static void main(String[] args) {
//		CurrencyConverterImplService conv = new CurrencyConverterImplService();
//		CurrencyConverter proxy = conv.getCurrencyConverterImplPort();
//		System.out.println(proxy.dollarToRupees(100));
		
		Calculator cal = new Calculator();
		System.out.println(cal.getCalculatorSoap().add(5, 6));
		System.out.println(cal.getCalculatorSoap().divide(45, 5));
		System.out.println(cal.getCalculatorSoap().multiply(5, 9));
	}

}