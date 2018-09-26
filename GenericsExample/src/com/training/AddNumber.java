package com.training;

import java.util.ArrayList;
import java.util.List;

public class AddNumber<T, E>{
	
	private T digit;
	T random;
	private List<E> list;

	public AddNumber() {
		super();
		list = new ArrayList<>();
	}
	
	public void addObject(E element){
		list.add(element);
	}
	
	public T getRandom() {
		return random;
		
	}

	public void setRandom(T random) {
		this.random = random;
		
	}

	

	public T getDigit() {
		return digit;
	}

	public void setDigit(T digit) {
		this.digit = digit;
	}
	
	
}
