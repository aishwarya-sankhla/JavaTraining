package com.training.domains;
import java.util.*;
import com.training.ifaces.Automobile;

public class Showroom {

	public static void main(String[] args) {
		QuoteManager quote =new UpdatedQuoteManager();
		String ch="y";
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter 1-3:");
			
			int key = sc.nextInt();
			Automobile auto =quote.getModel(key);
			quote.printQuote(auto);
			System.out.print("y:continue n:terminate =");
			ch=sc.next();
			
		}while(ch.equals("y"));
		sc.close();
	}

}
