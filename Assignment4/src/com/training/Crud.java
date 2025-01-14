package com.training;

import java.util.HashMap;
import java.util.HashSet;

public class Crud {
	HashMap<String,Item> items;
	public Crud() {
		super();
		IoHandling handle = new IoHandling();
		items= handle.readFromText();
	}
	
	public void insertIntoBillHandler(Customer customer,int duration_1,String key_1,int quantity_1){
	//adding
		HashSet<Item> custItems=customer.custItems;
		//Checks if the item is available in items.txt and adds
	if(items.containsKey(key_1)){

		switch (key_1) {
		case "chair":
			Furniture furniture= new Furniture();
			Item ch = items.get("chair");
			//Checks if the Customer list had the item
			if(custItems.contains(ch)){
				//if the duration is not same another entry is created of the same item
				if(ch.getDuration()!=duration_1){
					
					furniture.setItemName(ch.getItemName());
					furniture.setItemPrice(ch.getItemPrice());
					furniture.setQuantity(quantity_1);
					furniture.setDuration(duration_1);
					System.out.println(custItems.add(furniture));
				}
				
			}
			//If the duration is same the quantity is incremented
			else{
					for(Item i:custItems){
						int sum=i.getQuantity()+quantity_1;
						System.out.println("in item");
						if(i.getItemName().equals("chair")&& i.getDuration()==duration_1){
							System.out.println(sum);
							i.setQuantity(i.getQuantity()+quantity_1);
							custItems.add(i);
						}		
				}
			//If the item is not present in customer list ,a new entry is created
				System.out.println("entered");
				furniture.setItemName(ch.getItemName());
				furniture.setItemPrice(ch.getItemPrice());
				int sum=ch.getQuantity()+quantity_1;
				//System.out.println("Sum:"+sum);
				furniture.setQuantity(ch.getQuantity()+quantity_1);
				furniture.setDuration(duration_1);
				System.out.println(custItems.add(furniture));
				
			}
			break;
		case "maruti":
			Car carObj= new Car();
			Item car = items.get("maruti");
			if(custItems.contains(car)){
				if(car.getDuration()!=duration_1){
				
					carObj.setItemName(car.getItemName());
					carObj.setItemPrice(car.getItemPrice());
					carObj.setQuantity(4);
					carObj.setDuration(duration_1);
					System.out.println(custItems.add(carObj));
				
				}}
				else{
					System.out.println("else part");
					for(Item i:custItems){
						int sum=i.getQuantity()+quantity_1;
						System.out.println("in item");
						if(i.getItemName().equals("maruti")&& i.getDuration()==duration_1){
							System.out.println(sum);
							i.setQuantity(i.getQuantity()+quantity_1);
							custItems.add(i);
						}		
				}
				System.out.println("entered");
				carObj.setItemName(car.getItemName());
				carObj.setItemPrice(car.getItemPrice());
				int sum=car.getQuantity()+quantity_1;
				//System.out.println("Sum:"+sum);
				carObj.setQuantity(car.getQuantity()+quantity_1);
				carObj.setDuration(duration_1);
				System.out.println(custItems.add(carObj));
				
			}
			
			break;
		case "orpat":
			Fan fanObj= new Fan();
			Item fan = items.get("orpat");
			if(custItems.contains(fan)){
				if(fan.getDuration()!=duration_1){
				
					fanObj.setItemName(fan.getItemName());
					fanObj.setItemPrice(fan.getItemPrice());
					fanObj.setQuantity(quantity_1);
					fanObj.setDuration(duration_1);
					System.out.println(custItems.add(fanObj));
				
				}
			}
			else{
				System.out.println("else part");
				for(Item i:custItems){
					int sum=i.getQuantity()+quantity_1;
					System.out.println("in item");
					if(i.getItemName().equals("orpat")&& i.getDuration()==duration_1){
						System.out.println(sum);
						i.setQuantity(i.getQuantity()+quantity_1);
						custItems.add(i);
					}		
			}
			System.out.println("entered");
			fanObj.setItemName(fan.getItemName());
			fanObj.setItemPrice(fan.getItemPrice());
			int sum=fan.getQuantity()+quantity_1;
			//System.out.println("Sum:"+sum);
			fanObj.setQuantity(fan.getQuantity()+quantity_1);
			fanObj.setDuration(duration_1);
			System.out.println(custItems.add(fanObj));
			
		}
			break;
	case "pan":
		Utensils utObj= new Utensils();
		Item ut = items.get("pan");
		if(custItems.contains(ut)){
			if(ut.getDuration()!=duration_1){
			
				utObj.setItemName(ut.getItemName());
				utObj.setItemPrice(ut.getItemPrice());
				utObj.setQuantity(4);
				utObj.setDuration(duration_1);
				System.out.println(custItems.add(utObj));
			
			}}
		else{
			System.out.println("else part");
			for(Item i:custItems){
				int sum=i.getQuantity()+quantity_1;
				System.out.println("in item");
				if(i.getItemName().equals("pan")&& i.getDuration()==duration_1){
					System.out.println(sum);
					i.setQuantity(i.getQuantity()+quantity_1);
					custItems.add(i);
				}		
		}
		System.out.println("entered");
		utObj.setItemName(ut.getItemName());
		utObj.setItemPrice(ut.getItemPrice());
		int sum=ut.getQuantity()+quantity_1;
		//System.out.println("Sum:"+sum);
		utObj.setQuantity(ut.getQuantity()+quantity_1);
		utObj.setDuration(duration_1);
		System.out.println(custItems.add(utObj));
		
	}
		break;
	default:
		break;
		}
		}
	}
}

