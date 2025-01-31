package com.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;


public class IoHandling {
	
	private static final int defaultQuant = 0;
	private static final int defaultDay = 1;
	
	public HashMap<String,Item> readFromText(){
		HashMap<String,Item> itemSet = new HashMap<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\AC31846\\Desktop\\resources\\items.txt"));
			
			String itemAsString;
			while((itemAsString = reader.readLine())!=null){
				
				String[] items = itemAsString.split(",");
				switch (items[0]) {
				case "furniture":
					Item furniture = new Furniture(items[1],Float.parseFloat(items[2]),defaultQuant,defaultDay); 
					itemSet.put(items[1],furniture);
					break;
				case "car":
					Item car = new Car(items[1],Float.parseFloat(items[2]),defaultQuant,defaultDay); 
					itemSet.put(items[1],car);
					break;
				case "fan":
					Item fan = new Car(items[1],Float.parseFloat(items[2]),defaultQuant,defaultDay); 
					itemSet.put(items[1],fan);
					break;
				case "utensils":
					Item utensils = new Car(items[1],Float.parseFloat(items[2]),defaultQuant,defaultDay); 
					itemSet.put(items[1],utensils);
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return itemSet;
	}
	
	
	
	//writing to bill
	public boolean writeToTextFile(Customer cust){
		HashSet<Item> itemList=cust.getC_bill().get(cust);
		String customer_name = cust.getCustName();
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(new File("Bill.txt"),true));
			writer.println("Customer Name: "+customer_name);
			writer.println("Item Name Duration Quantity Price Item-Total");
			for(Item it:itemList){
				writer.println(it.getItemName()+" "+it.getDuration()+" "+it.getQuantity()+" "+it.getItemPrice()+" "+CreateBill.calculateTotal(it.getDuration(), it.getItemPrice(), it.getQuantity()));
			}
			
			writer.println("Grand Total:"+CreateBill.Total(itemList));
			writer.println();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally{
			writer.close();
		}
		
		
		
		
	}

		
}	
	
	

