package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	//Generic Method -Type 1
	
	public static <T> T showNumber(List<T>numList){
		
		return numList.get(2);
	}
	
	//Generic Method -Type 2
	
	public static void print(List<?> list){
		list.forEach(System.out::println);
	}
	
	//Generic Method - Type 3 Producer
	public static void printList(List<? extends Number> list){
		list.forEach(System.out::println);
	}
	
	//Generic Method - Type 4 Consumer
	public static void  addToList(List<? super Integer> list){
		list.add(23);
		//list.set(1,7);
	}
	public static void main(String[] args) {
		
		AddNumber<Double,String> marks = new AddNumber<>();
		marks.setDigit(97.8);
		marks.setRandom(22.5);
		marks.addObject("Sam");
		
		AddNumber<Integer,String> age = new AddNumber<>();
		age.setDigit(22);
		
		age.setRandom(98);
		
		System.out.println(marks.getDigit());
		
		System.out.println(age.getDigit());
		
	
	//	List<Integer> engList = Arrays.asList(20,30,40);
		List<Double> mathsList = Arrays.asList(20.03,30.0,40.5);
		
//		System.out.println(showNumber(engList));
//		System.out.println(showNumber(mathsList));
		
		List<Object> studList = Arrays.asList(new Boolean(true),new Boolean(false),new Boolean(true));
		
//		print(engList);
//		print(mathsList);
//		print(studList);
		
//		printList(mathsList);
//		printList(engList);
//		printList(studList);
		
		List<Integer> engList = new ArrayList<>();
		addToList(engList);
		printList(engList);
//		addToList(studList);
//		addToList(mathsList);
		
		
	}

}
