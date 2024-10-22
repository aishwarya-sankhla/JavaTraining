package com.training;



public class Application {

	public static void main(String[] args) {
		CreateBill bill = new CreateBill();
		
		
		Customer c1 = new Customer(101, "Sam");
		Customer c2 = new Customer(102, "John");

		Crud crud = new Crud();
		//Customer items are orpat,maruti,chair.It checks where the items entered are valid
		//Reads the set of available items from text file - items.txt
			crud.insertIntoBillHandler( c1,7,"maruti",2);
			crud.insertIntoBillHandler( c1,7,"maruti",3);
			crud.insertIntoBillHandler(c1,4,"chair",4);
			crud.insertIntoBillHandler(c1,8,"orpat",3);
			crud.insertIntoBillHandler(c1,9,"pan",1);
			crud.insertIntoBillHandler(c1,4,"chair",6);
			crud.insertIntoBillHandler(c1,6,"chair",6);
			
			//Makes the Hashmap with customer and list of items
			//makeBill returns a HashMap that is stored within customer
			c1.setC_bill(bill.makeBill(c1));
			
			crud.insertIntoBillHandler(c2, 4, "orpat", 3);
			c2.setC_bill(bill.makeBill(c2));
		
		
			//Writes into the text file - bill.txt
			IoHandling ioHandling= new IoHandling();
			ioHandling.writeToTextFile(c1);
			ioHandling.writeToTextFile(c2);
	}
	
	
}
