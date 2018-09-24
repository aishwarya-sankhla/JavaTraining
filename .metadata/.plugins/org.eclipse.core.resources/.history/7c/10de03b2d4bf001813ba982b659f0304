package com.training;

import com.training.dao.impl.MovieDAOimpl;
import com.training.entity.Movie;
import com.training.entity.MovieDAO;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
		
		Movie gold = new Movie(101,"Gold","Reema","Historial",4.8);
		
		MovieDAO dao = new MovieDAOimpl();
		
		int rowAdded= dao.addMovie(gold);
		
		System.out.println(rowAdded+":= Row added");
		
		MovieDAOimpl obj = (MovieDAOimpl)dao;
		obj.closeConnection();
	}

}
