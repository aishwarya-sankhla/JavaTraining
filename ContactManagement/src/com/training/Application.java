package com.training;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.training.dao.impl.ContactDaoImpl;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
		
		ContactDao dao = new ContactDaoImpl();
		int key =5;
		switch(key){
		case 1:
			ContactDetails sam = new ContactDetails("sam", "friends");
			Contacts samPhone = new Contacts("9985846852");
			try {
				dao.addNewContact(sam, samPhone);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Contacts samPhone1 = new Contacts("9985846853");
			try {
				dao.addExistingContact(6, samPhone1);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
//				System.out.println(dao.displayByName("sam"));
				List<ContactDetails> contactList=dao.displayContactByCategory("friends");
				contactList.forEach(System.out::println);
				List<ContactDetails> contactListAlphabetic=dao.displayContacts();
				contactListAlphabetic.forEach(System.out::println);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				System.out.println(dao.editContact(7, "name", "mark"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				System.out.println(dao.editPhone("9985846852","9999999999"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5:
			HashMap<String, Integer> contactList = new HashMap<>();
			try {
				contactList = dao.displayCategories();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 for(Entry<String, Integer> m:contactList.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  }  
		}
		
	}
		
		
		

}
