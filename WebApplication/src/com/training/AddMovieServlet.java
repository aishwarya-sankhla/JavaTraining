package com.training;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.dao.impl.MovieDAOimpl;
import com.training.entity.DAO;
import com.training.entity.Movie;
import com.training.utils.DbConnection;

/**
 * Servlet implementation class AddMovieServlet
 */
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassLoader clsLoader = Thread.currentThread().getContextClassLoader();
		
		InputStream stream = clsLoader.getResourceAsStream("jdbc.properties");
		Connection con = DbConnection.getOracleConnection(stream);
		
		long movieId = Long.parseLong(request.getParameter("movieId"));
		String movieName = request.getParameter("movieName");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		Double rating = Double.parseDouble(request.getParameter("rating"));
		
		DAO<Movie> dao = new MovieDAOimpl(con);
		
		Movie movie = new Movie(movieId, movieName, director, genre, rating);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addMovie.jsp");
		int ifAdded=dao.add(movie);
		request.setAttribute("AddedMovie", ifAdded);
		
		dispatcher.forward(request, response);
	}

}
