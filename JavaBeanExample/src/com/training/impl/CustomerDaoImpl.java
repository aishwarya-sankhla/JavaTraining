package com.training.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.bean.Customer;
import com.training.utils.DbConnection;

public class CustomerDaoImpl implements CustomerDao{

	private Connection con;
	public CustomerDaoImpl(Connection con) {
		super();
		this.con=con;
	}
	@Override
	public int AddCustomer(Customer cust) {
		String sql = "insert into customeras values(?,?,?)";
		PreparedStatement psmst = null;
		int rowAdded =0;
		try {
			psmst=con.prepareStatement(sql);
			psmst.setLong(1, cust.getCustomerId());
			psmst.setString(2, cust.getCustomerName());
			psmst.setLong(3, cust.getMobileNumber());
			rowAdded=psmst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	private Customer convertToObject(ResultSet rs) throws SQLException{
		Long customerid = rs.getLong("customerid");
		String customername = rs.getString("customername");
		Long mobile = rs.getLong("mobile");
		
		return new Customer(customerid, customername, mobile);
	}
	@Override
	public List<Customer> findAll() {
		String sql = "select * from customeras";
		PreparedStatement psmst = null;
		List<Customer> customerList = new ArrayList<>();
		try {
			psmst = con.prepareStatement(sql);
			ResultSet rs = psmst.executeQuery();
			while(rs.next()){
				Customer cust=convertToObject(rs);
				customerList.add(cust);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customerList;
	}
}
