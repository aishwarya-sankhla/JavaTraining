package com.training;

import java.util.HashMap;
import java.util.HashSet;

public class CreateBill implements Billable {

	private HashMap<Customer, HashSet<Item>> billStuff;
	
	public CreateBill() {
		super();
		billStuff = new HashMap<>();
	}
	
	//Adds items into the HashMap
	@Override
	public HashMap<Customer, HashSet<Item>> makeBill(Customer cust) {
		HashSet<Item> items=cust.custItems;
		billStuff.put(cust, items);
		return billStuff;
	}
	
	//Overloaded Function
	@Override
	public HashMap<Customer, HashSet<Item>> makeBill(Customer cust, Item item) {
				
			HashSet<Item> itemSet;
			itemSet= billStuff.get(cust);
			if(itemSet==null){
				itemSet = new HashSet<>();	
			}
			itemSet.add(item);
			billStuff.put(cust, itemSet);
		return billStuff;
	}
	

	public static float calculateTotal(int duration,float price,int quantity){
	
		if(duration>5){
			return (float) ((price*quantity)-(price*quantity*0.01));
		}
		else{
			return price*quantity;
		}
		
	}

	public static float Total(HashSet<Item> itemList){
		float total=0;
		for (Item item : itemList) {
			if(item.getDuration()>5){
				total = total+(float) ((item.getItemPrice()*item.getQuantity())-(item.getItemPrice()*item.getQuantity()*0.01));
			}
			else{
				total=total+item.getItemPrice()*item.getQuantity();
			}
		}
		return total;
		
	}

}
