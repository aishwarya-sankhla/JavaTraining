package com.training;

import java.util.ArrayList;
import java.util.List;

public class ContactDetails {
	private String name;
	private String email;
	private String relation;
	
	private List<Contacts> contactList;
	public ContactDetails(String name, String email, String relation) {
		super();
		this.name = name;
		this.email = email;
		this.relation = relation;
		contactList = new ArrayList<>();
	}
	
	
	public List<Contacts> getContactList() {
		return contactList;
	}


	public void setContactList(List<Contacts> contactList) {
		this.contactList = contactList;
	}


	public ContactDetails(String name, String relation) {
		super();
		this.name = name;
		this.relation = relation;
	}

	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", email=" + email + ", relation=" + relation + ", contactList="
				+ contactList + "]\n";
	}
	
	public void addToList(Contacts c){
		this.contactList.add(c);
	}
	
	
}
