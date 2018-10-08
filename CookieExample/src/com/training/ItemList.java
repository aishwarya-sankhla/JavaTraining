package com.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.ReturnInstruction;

public class ItemList {

	public static Map<String,List<String>> getItems(){
		List<String> books =Arrays.asList("Head First Java","Thinking in Java");
		List<String> fashion = Arrays.asList("Lipstick","kajal");
		List<String> textiles = Arrays.asList("Casual wear","Party wear");
		List<String> sweets = Arrays.asList("Jamun","Chocolate");
		Map<String,List<String>> items = new HashMap<>();
		
		items.put("books", books);
		items.put("fashion", fashion);
		items.put("sweets", sweets);
		items.put("textiles", textiles);
		
		return items;
		}
}
