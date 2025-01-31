package com.training.domains;

public class Product implements Comparable<Product>{
	
	private long productCode;
	private String productName;
	private String category;
	private double ratePerUnit;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(long productCode, String productName, String category, double ratePerUnit) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.ratePerUnit = ratePerUnit;
	}


	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}


	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", ratePerUnit=" + ratePerUnit + "]";
	}


	@Override
	public int compareTo(Product o) {
		
		return productName.compareTo(o.productName);
	}
	
	
}
