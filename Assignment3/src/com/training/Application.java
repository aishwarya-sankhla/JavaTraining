package com.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.TreeSet;

public class Application {

	public boolean writeToTextFile(Resturant ...rests){
		boolean result = false;
		for(Resturant rest:rests){
			PrintWriter writer = null;
		
			try {
				writer = new PrintWriter(new FileWriter(new File("Resturant.txt"),true));
				writer.println(rest.toString());
				result = true;		
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				writer.close();
			}
		}
		return result;
	}
	
	public TreeSet<Resturant> readFromText(File file){
		TreeSet<Resturant> restList = new TreeSet<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String restAsString;
			while((restAsString = reader.readLine())!=null){
				
				String[] items = restAsString.split(",");
				Resturant rest = new Resturant(items[0], items[1], Long.parseLong(items[2]), Integer.parseInt(items[3]));
				restList.add(rest);
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
		return restList;
	}
	
	public static void main(String[] args) {
		Application handle = new Application();
		
		Resturant r1 = new Resturant("Nasi&me", "Bangalore", 856942, 4);
		Resturant r2 = new Resturant("Fatty Bao", "Bangalore", 856992, 5);
		Resturant r3 = new Resturant("Gourmet","Bangaore",789545,3);
		
		boolean status = handle.writeToTextFile(r1,r2,r3);
//		boolean status1 = handle.writeToTextFile(r2);
//		boolean status3 = handle.writeToTextFile(r3);
		
		if(status){
			System.out.println("Text File Created");
		}
		else
			System.out.println("Error see log file");
		
		TreeSet<Resturant> restList = handle.readFromText(new File("Resturant.txt"));
		restList.forEach(System.out::println);
	}
}
