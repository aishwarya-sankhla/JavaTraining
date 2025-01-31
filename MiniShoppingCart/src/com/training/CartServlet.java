package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String selectedBook = request.getParameter("bookName");
		String selectedMobile = request.getParameter("phone");
		String[] selectedPizza = request.getParameterValues("pizza");
		RequestDispatcher dispatcher = null;
		if(selectedBook != null){
			HttpSession session = request.getSession();
			session.setAttribute("book", selectedBook);
			System.out.println(selectedBook);
			dispatcher = request.getRequestDispatcher("Second.jsp");
		}
		if(selectedMobile != null){
			HttpSession session = request.getSession();
			session.setAttribute("mobile", selectedMobile);
			System.out.println(selectedMobile);
			dispatcher = request.getRequestDispatcher("Third.jsp");
		}
		if(selectedPizza != null){
			HttpSession session = request.getSession();
			session.setAttribute("pizza", selectedPizza);
			System.out.println(selectedPizza);
			dispatcher = request.getRequestDispatcher("FinalPage.jsp");
		}
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
