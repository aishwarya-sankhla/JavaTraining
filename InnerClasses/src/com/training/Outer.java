package com.training;

public class Outer {

	public void show(String[] date,String condition){
		Filter obj = new Filter() {

			@Override
			public String filter(String[] date, String condition) {
				
				return date[0];
			}};
			
			obj.filter(date, condition);
	}
	
	public static void main(String[] args){
		Outer obj = new Outer();
		String[] names = {"Sam","John","Rick"};
		obj.show(names, "");
	}
}
