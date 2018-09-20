package com.training;

public class RangeCheck extends Exception {
	private String msg;
    
	RangeCheck(String msg){
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
