package com.training;

import java.util.List;
import java.util.Arrays;

import com.training.iface.iGreeting;

public class FirstExample {
	public static void main(String[] args) {
		iGreeting greeter = (name) ->{return "Hi "+name.toUpperCase();};
		
		System.out.println(greeter.greet("Smith"));
		
		Converter con = (amt) ->{return amt*72;};
		
		System.out.println(con.ToInr(10));
		
		//Old version 
		String[] names = {"Sam","John","Smith"};
		
		for(String name:names){
			System.out.println(name);
		}
		
		//JAVA 8 way of doing
		List<String> nameList = Arrays.asList("Sam","John","Smith");
		nameList.forEach(System.out::println);
		
		
	}
}
