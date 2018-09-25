package com.training.domains;

import java.util.*;
import java.util.stream.Collectors;



public class ManageProducts {
	public void printProductByCategory(String category,List<Product> prdList){
		List<Product> catalog = prdList.stream().filter(eachProduct -> 
		eachProduct.getCategory().equals(category)).collect(Collectors.toList());
		
		catalog.forEach(System.out::println);
	}
	
	public void printProductNames(List<Product> prdList){
		prdList.stream().map(product ->product.getProductName()).forEach(System.out::println);
	}
	
	public void printCategory(List<Product> prdList){
		Set<String> category = (Set) prdList.stream().map(product ->product.getCategory()).distinct().collect(Collectors.toSet());
		category.forEach(System.out::println);
	}
	
	public void printSortedList(List<Product> prdList){
		//Uses the compareto method to sort 
		//prdList.stream().sorted().forEach(System.out::println);
		
		//Using comparator to sort using the rate 
		prdList.stream().sorted(Comparator.comparing(Product::getRatePerUnit)).forEach(System.out::println);
	}

	
	public double findMinMax(List<Product> prdList,boolean isMin){
		double price = 0.0;
		Optional<Product> prd= null;
		if(isMin){
			prd = prdList.stream().min(Comparator.comparing(Product::getRatePerUnit));
		}
		else{
			prd = prdList.stream().max(Comparator.comparing(Product::getRatePerUnit));
		}
		if(prd.isPresent()){
			price = prd.get().getRatePerUnit();
		}
		return price;
	}
	
	public long countProducts(List<Product> prdList){
		long prdCount = prdList.stream().count();
		
		return prdCount;
	}
}
