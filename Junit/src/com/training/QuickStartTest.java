package com.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickStartTest {
	
	Quickstart obj;
	@Before
	public void init(){
		obj = new Quickstart();
	}
	
	@Test
	public void testGetMessage() {
		String expected ="HELLO";
		String actual = obj.getMessage();
		assertEquals("Get Message return should be String in Uppercase" , expected, actual);
	}
	
	@Test
	public void testCalculateDiscount1(){
		double actual = obj.calculateDiscount(5000);
		double expected = 0.15;
		int delta = 0;
		assertEquals(expected, actual,delta);
	}
	
	@Test
	public void testCalculateDiscount2(){
		double actual = obj.calculateDiscount(4000);
		double expected = 0.15;
		int delta = 0;
		assertEquals("Discount should be 0.15", expected, actual, delta);
	}

	@Test
	public void testCalculateDiscount3(){
		double actual = obj.calculateDiscount(6000);
		double expected = 0.10;
		int delta = 0;
		assertEquals("Discount should be 0.10", expected, actual, delta);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculateDiscount4(){
		obj.calculateDiscount(-6000);
		
	}
	
//	@Test
//	public void testCalculateDiscount5(){
//		try {
//			obj.calculateDiscount(-6000);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
}
