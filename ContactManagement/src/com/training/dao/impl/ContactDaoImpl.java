package com.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.training.ContactDao;
import com.training.ContactDetails;
import com.training.Contacts;
import com.training.utils.DbConnection;

public class ContactDaoImpl implements ContactDao{
	
	
	private Connection con;
	
	
	public ContactDaoImpl() {
		super();
		con=DbConnection.getOracleConnection();
	}


	@Override
	public int addNewContact(ContactDetails person, Contacts phoneNo) throws SQLException {
		String sql = "insert into contactdetails values(contact_sequence.nextval,?,?,?)";
		String sql1 = "insert into contacts values(contact_sequence.currval,?)";
		PreparedStatement psmst = null;
		int rowAdded;
		psmst = con.prepareStatement(sql);
		psmst.setString(1, person.getName());
		psmst.setString(2, person.getEmail());
		psmst.setString(3, person.getRelation());
		rowAdded = psmst.executeUpdate();
		psmst.close();
		
		PreparedStatement psmst1 = null;
		psmst1 = con.prepareStatement(sql1);
		psmst1.setString(1, phoneNo.getPhoneNo());
		rowAdded = psmst1.executeUpdate();
		psmst1.close();
		return rowAdded;
	}


	@Override
	public int addExistingContact(int contactid, Contacts phone) throws SQLException {
		String sql = "insert into contacts values(?,?)";
		PreparedStatement psmst = null;
		int rowAdded;
		psmst = con.prepareStatement(sql);
		psmst.setInt(1, contactid);
		psmst.setString(2, phone.getPhoneNo());
		rowAdded = psmst.executeUpdate();
		psmst.close();
		return rowAdded;
	}

// check   

	@Override
	public int deleteContact(int contactId) throws SQLException {
		String sql = "delete from contacts where contactid=?";
		String sql1 = "delete from contactdetails where contactid=?";
		int rowAdded;
		PreparedStatement psmst = con.prepareStatement(sql);
		psmst.setInt(1, contactId);
		rowAdded = psmst.executeUpdate();
		psmst.close();
		PreparedStatement psmst1 = con.prepareStatement(sql1);
		psmst1.setInt(1, contactId);
		rowAdded = psmst1.executeUpdate();
		psmst1.close();
		return 0;
	}


	@Override
	public List<ContactDetails> displayContactByCategory(String category) throws SQLException {
		String sql = "select * from contactdetails where relation=?";
		String sql1 = "select * from contacts where contactid=?";
		List<ContactDetails> contactList = new ArrayList<>();
		PreparedStatement psmst = con.prepareStatement(sql);
		psmst.setString(1, category);
		ResultSet rs = psmst.executeQuery();
		while (rs.next()){
			List<Contacts> phoneList =new ArrayList<>();
			int id = rs.getInt("contactid");
			String contactName = rs.getString("name");
			String email = rs.getString("email");
			String relation = rs.getString("relation");
			ContactDetails contact = new ContactDetails(contactName,email,relation);
			PreparedStatement psmst1 = con.prepareStatement(sql1);
			psmst1.setInt(1, id);
			ResultSet rs1 = psmst1.executeQuery();
			while(rs1.next()){
				String phone = rs1.getString("phone");
				Contacts ph = new Contacts(phone);
				phoneList.add(ph);
				System.out.println();
			}
			contact.setContactList(phoneList);
			contactList.add(contact);
		}
		return contactList;
	}


	@Override
	public List<ContactDetails> displayContacts() throws SQLException {
		String sql = "select * from contactdetails order by name";
		String sql1 = "select * from contacts where contactid=?";
		PreparedStatement psmst = con.prepareStatement(sql);
		List<ContactDetails> contactList = new ArrayList<>();
		ResultSet rs = psmst.executeQuery();
		
		while(rs.next()){
			List<Contacts> phoneList =new ArrayList<>();
			int id = rs.getInt("contactid");
			String contactName = rs.getString("name");
			String email = rs.getString("email");
			String relation = rs.getString("relation");
			ContactDetails contact = new ContactDetails(contactName,email,relation);
			PreparedStatement psmst1 = con.prepareStatement(sql1);
			psmst1.setInt(1, id);
			ResultSet rs1 = psmst1.executeQuery();
			while(rs1.next()){
				String phone = rs1.getString("phone");
				Contacts ph = new Contacts(phone);
				phoneList.add(ph);
				System.out.println();
			}
			contact.setContactList(phoneList);
			contactList.add(contact);
		}
		return contactList;
	}



	@Override
	public ContactDetails displayByName(String name) throws SQLException {
		String sql = "select * from contactdetails where name=?";
		String sql1 = "select * from contacts where contactid=?";
		PreparedStatement psmst = con.prepareStatement(sql);
		psmst.setString(1, name);
		ResultSet rs = psmst.executeQuery();
		int id =0;
		ContactDetails contact = null;
		List<Contacts> contactList =new ArrayList<>();
		while(rs.next()){
			id = rs.getInt("contactid");
			String contactName = rs.getString("name");
			String email = rs.getString("email");
			String category = rs.getString("relation");
			contact = new ContactDetails(contactName,email,category);
		}
		psmst.close();
		PreparedStatement psmst1 = con.prepareStatement(sql1);
		psmst1.setInt(1, id);
		ResultSet rs1 = psmst1.executeQuery();
		while(rs1.next()){
			String phone = rs1.getString("phone");
			Contacts ph = new Contacts(phone);
			contactList.add(ph);
			System.out.println();
		}
		contact.setContactList(contactList);
		return contact;
	}
//	public List<ContactDetails> displayByName(String name) throws SQLException {
//		String sql="select * from contactdetails natural join contacts where name=?";
//		String sql1 = "select * from contacts where contactid=?";
//		PreparedStatement psmst = con.prepareStatement(sql);
//		psmst.setString(1, name);
//		ResultSet rs = psmst.executeQuery();
//		ContactDetails contact = null;
//		List<ContactDetails> contactList =new ArrayList<>();
//		while(rs.next()){
//			List<String> numberList=new ArrayList<>(); 
//			
//			int id = rs.getInt("contactid");
//			String contactName = rs.getString("name");
//			String email = rs.getString("email");
//			String category = rs.getString("relation");
//			numberList.add(rs.getString("phone"));
//			contact = new ContactDetails(contactName, email, category, id);
//			
//
//			if(contactList.contains(contact)){
//				for(ContactDetails cntct:contactList){
//					if(cntct.equals(contact))
//						cntct.addToList(numberList.get(0));
//				}
//			}else{
//				contactList.add(contact);
//		
//			}
//			
//		}
//		return contactList;
//	}
//		


	@Override
	public int editContact(int contactId, String columnName, String updatedValue) throws SQLException {
		String sql = "update contactdetails set "+columnName+"=? where contactid=?";
		PreparedStatement psmst = con.prepareStatement(sql);
		psmst.setString(1, updatedValue);
		psmst.setInt(2, contactId);
		int rowUpdated;
		rowUpdated = psmst.executeUpdate();
		return rowUpdated;
	}


	@Override
	public int editPhone(String old, String phone) throws SQLException {
		String sql = "update contacts set phone=? where phone=?";
		PreparedStatement psmst = con.prepareStatement(sql);
		psmst.setString(1, phone);
		psmst.setString(2, old);
		int rowUpdated;
		rowUpdated = psmst.executeUpdate();
		return rowUpdated;
	}


	@Override
	public HashMap<String, Integer> displayCategories() throws SQLException {
		String sql = "select relation,count(*) from contactdetails group by relation";
		PreparedStatement psmst = con.prepareStatement(sql);
		HashMap<String, Integer> contactList= new HashMap<>();
		ResultSet rs = psmst.executeQuery();
		while(rs.next()){
			String category = rs.getString("relation");
			int count = rs.getInt("count(*)");
			contactList.put(category, count);
		}
		return contactList;
	}

	

}
