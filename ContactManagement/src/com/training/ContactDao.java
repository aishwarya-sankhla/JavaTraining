package com.training;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public interface ContactDao {
	public int addNewContact(ContactDetails person,Contacts phoneNo) throws SQLException;
	public int addExistingContact(int contactid,Contacts phone) throws SQLException;
	public int deleteContact(int contactId) throws SQLException;
	public List<ContactDetails> displayContactByCategory(String category) throws SQLException;
	public List<ContactDetails> displayContacts() throws SQLException;
	public int editContact(int contactId,String columnName,String updatedValue) throws SQLException;
	public int editPhone(String old,String phone) throws SQLException;
	public ContactDetails displayByName(String name) throws SQLException;
	public HashMap<String, Integer> displayCategories() throws SQLException;
}
