package com.training.domains;

import java.util.*;import java.util.stream.Collector;
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
		Set<String> category = prdList.stream().map(product ->product.getCategory()).distinct().collect(Collectors.toSet());
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
	
	public Map<String, Double> getPriceList(List<Product> prdList){
		//Filters based on Category
		//Map<String, Double> priceList = prdList.stream().filter(prd -> prd.getCategory().equals("fridge")).collect(Collectors.toMap(Product::getProductName, Product::getRatePerUnit));
		Map<String, Double> priceList = prdList.stream().collect(Collectors.toMap(Product::getProductName, Product::getRatePerUnit));
		return priceList;
	}
	
	public double maxAmount(List<Product> prdList){
		Optional<Double> result = prdList.parallelStream().map(e -> e.getRatePerUnit()).reduce((p1,p2) -> p1>p2?p1:p2);
		
		return result.get().doubleValue();
	}
	
	public double totalAmount(List<Product> prdList){
		Double result = prdList.parallelStream().map(p -> p.getRatePerUnit()).reduce(0.0, (p1,p2)->{p1 +=p2; return p1;});
		
		return result;
	}
}
