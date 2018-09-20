package com.training.domains;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book hfirst = new Book(101,"Head First Java","Sierra",450);
		Book think = new Book(102,"Thinking Java","Bruce",850);
		Book eff = new Book(103,"Effective Java","Joshua");
		
		Book[] bookList = new Book[3];
		bookList[0]=hfirst;
		bookList[1]=think;
		bookList[2]=eff;
		
		BookManager bmgr = new BookManager();
		//bmgr.displayBooks(bookList);
		
		bmgr.display(eff);
	}

}
