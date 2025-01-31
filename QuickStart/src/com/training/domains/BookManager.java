package com.training.domains;

public class BookManager {
	
	public void display(Book ...books){
		/*for(Book eachBook:books){
			System.out.println(eachBook.getAuthor());
		}*/
		displayBooks(books);
	}
	Object obj;
	
	private void displayBooks(Book[] bookList){
		for(Book eachBook: bookList){
			double discount=eachBook.findDiscount();
			double amount = eachBook.getRatePerUnit();
			double netamount=amount-amount*discount;
			System.out.println(eachBook.getBookName());
			System.out.println(eachBook.getAuthor());
			System.out.println(eachBook.getRatePerUnit());
			System.out.println("Discount: "+discount);
			System.out.println("Net Amount: "+netamount);
			System.out.println("Publisher: "+Book.publisher);
			
			System.out.println(eachBook);
		}
	}
}
