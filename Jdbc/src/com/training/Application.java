package com.training;

import java.util.List;

import com.training.dao.impl.MovieDAOimpl;
import com.training.entity.Movie;
import com.training.entity.MovieDAO;
import com.training.entity.DAO;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
		
		MovieDAO<Movie> dao = new MovieDAOimpl();
		
		int rowAdded=0;
		int key =5;
		
		switch (key) {
		case 1:
			Movie gold = new Movie(101,"Gold","Reema","Historial",4.8);
			rowAdded= dao.add(gold);
			System.out.println(rowAdded +":=Row added");
			Movie inferno = new Movie(102,"Inferno","Random","Drama",5.0);
			rowAdded =dao.add(inferno);
			
			System.out.println(rowAdded +":=Row added");
			break;
			
		case 2:
			List<Movie> movieList = dao.findAll();
			movieList.forEach(System.out::println);
			break;
		case 3:
			System.out.println(dao.findByPrimaryKey(102));
			break;
		case 4:
		
			System.out.println(dao.remove(102));
			break;
		case 5:
			System.out.println(dao.updateRating(101, 4.0));
			break;
		default:
			break;
		}
		
		
		System.out.println(rowAdded+":= Row added");
		
		MovieDAOimpl obj = (MovieDAOimpl)dao;
		obj.closeConnection();
	}

}
