package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at:").append(request.getContextPath());
		HttpSession session = request.getSession();
		session.setAttribute("city", "Bangalore");
		System.out.println("Creation Time:"+session.getCreationTime());
		System.out.println("Last Access Time:"+session.getLastAccessedTime());
//		session.removeAttribute("name");
		long timeElapsed = session.getLastAccessedTime()-session.getCreationTime();
		long inactiveTime = session.getMaxInactiveInterval();
		
		if(timeElapsed>inactiveTime){
			session.invalidate();
		}
		System.out.println(timeElapsed);
//		session.invalidate();
//		response.getWriter().println("<a href=info.jsp>Back</a>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("info.jsp");
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
