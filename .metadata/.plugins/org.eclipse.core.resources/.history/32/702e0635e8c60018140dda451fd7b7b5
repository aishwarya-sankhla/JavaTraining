package com.training;

import java.sql.SQLException;

import com.training.dao.impl.ContactDaoImpl;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
		
		ContactDao dao = new ContactDaoImpl();
		int key =4;
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
				System.out.println(dao.displayByName("sam"));
				System.out.println(dao.displayContactByCategory("friends"));
				System.out.println(dao.displayContacts());
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
		}
		
	}
		
		
		

}
