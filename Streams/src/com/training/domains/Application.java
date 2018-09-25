package com.training.domains;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Product sonyTv =  new  Product(101, "Sony TV", "tv", 45000);
		Product samsungTv =  new  Product(102, "Samsung TV", "tv", 55000);
		Product hitachiTv =  new  Product(103, "Hitachi TV", "tv", 65000);
		Product lg =  new  Product(201, "LG Refrigerator", "fridge", 40000);
		Product samsung =  new  Product(202, "Samsung", "fridge", 35000);
		Product haier =  new  Product(203, "Haier", "fridge", 45000);
		
		List<Product> prdList = new ArrayList<>();
		
		prdList.add(haier);
		prdList.add(samsung);
		prdList.add(lg);
		prdList.add(hitachiTv);
		prdList.add(samsungTv);
		prdList.add(sonyTv);
		
		ManageProducts mgr = new ManageProducts();
//		System.out.println("Product List by category fridge:-");
//		mgr.printProductByCategory("fridge", prdList);
//		System.out.println("PRODUCT LIST:-");		
//		mgr.printProductNames(prdList);
//		System.out.println("CATEGORIES:-");
//		mgr.printCategory(prdList);
//		
//		mgr.printSortedList(prdList);
//		
//		System.out.println("Product Count:"+mgr.countProducts(prdList));
		
		System.out.println(mgr.findMinMax(prdList,true));
	}
}