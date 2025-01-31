package com.training.domains;
import com.training.ifaces.*;

public class QuoteManager {
	
	public void printQuote(Automobile polyAuto){
		if(polyAuto!=null){
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		}
		else
			System.out.println("Invalid!");
	}
	/**
	 * 
	 * @param key represents the Key value 1-3 at the automobile
	 * @return the sub type of automobile a class implementing Automobile interface
	 */
	
	public Automobile getModel(int key){
		switch(key){
		case 1:
			return new MarutiCar();
		case 2:
			return new BajajBike();
		default:
			return null;
		}
	}
}
