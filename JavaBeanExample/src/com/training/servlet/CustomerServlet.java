package com.training.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.CycleRecoverable.Context;
import com.training.bean.Customer;
import com.training.impl.CustomerDao;
import com.training.impl.CustomerDaoImpl;
import com.training.utils.DbConnection;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
	@Override
	public void init() throws ServletException {
		try{
		InitialContext ctx = new InitialContext();
		DataSource datasource = (DataSource) ctx.lookup("java/comp/env/jdbc/ds1");
		con = datasource.getConnection();
		}
		catch (Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ClassLoader clsLoader = Thread.currentThread().getContextClassLoader();
//		
//		InputStream stream = clsLoader.getResourceAsStream("jdbc.properties");
//		Connection con = DbConnection.getOracleConnection(stream);
		RequestDispatcher dispatcher = null;
		
		HttpSession session =request.getSession();
		String errorMessage = "Invalid Username or Password";
	
		
		Customer cust =(Customer)session.getAttribute("custBean");
		int rowAdded=0;
		List<Customer> custList = new ArrayList<>();
		CustomerDao dao = new CustomerDaoImpl(con);
		rowAdded = dao.AddCustomer(cust);
		custList =dao.findAll();
		System.out.println(cust);
		System.out.println(rowAdded);
		request.setAttribute("status","OneCustomer Added");
		session.setAttribute("custList", custList);
		dispatcher = request.getRequestDispatcher("ShowCustomers.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("userName");
		String pword = request.getParameter("passWord");
		boolean isValidUser = false;
		HttpSession session =request.getSession();
		session.setAttribute("isLogged", false);
		if(uname.equals("India") && pword.equals("India")){
			isValidUser = true;
			session.setAttribute("isLogged", true);
		}
		if(!(boolean) session.getAttribute("isLogged")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}

}
