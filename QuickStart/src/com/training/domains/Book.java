package com.training.domains;

public class Book {
	public Book(long bookNumber, String bookName, String author, double ratePerUnit) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.ratePerUnit = ratePerUnit;
	}
	public Book(long bookNumber, String bookName, String author) {

		this(bookNumber,bookName,author,0.0);
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private long bookNumber;
	private String bookName;
	private String author;
	private double ratePerUnit;
	
	static String publisher="Oriley";
	
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public double findDiscount(){
		double discount=0.10;
		if(author.equals("sashi")){
			discount=0.15;
		}
		return discount;
	}
	/**
	 * toString method will be called implicitly if its not overridden inthe class
	 * the superclass toString will be called
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.author+"."+this.bookName;
	}
	
}
