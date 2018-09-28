package com.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.training.entity.Movie;
import com.training.entity.MovieDAO;
import com.training.entity.DAO;
import com.training.utils.DbConnection;



import java.sql.*;

public class MovieDAOimpl implements MovieDAO<Movie> {

	private Connection con;
	
	public MovieDAOimpl(Connection con) {
		super();
		this.con=con;
	}

	@Override
	public int add(Movie movie) {
		String sql = "insert into movieas values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int rowAdded = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, movie.getMovieId());
			pstmt.setString(2, movie.getMovieName());
			pstmt.setString(3, movie.getDirector());
			pstmt.setString(4, movie.getGenre());
			pstmt.setDouble(5, movie.getRating());
			
			rowAdded = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowAdded;
	}

	@Override
	public List<Movie> findAll() {
		String sql = "select * from movieas";
		List<Movie> movieList= new ArrayList<Movie>();
		PreparedStatement pstmt = null;
		try {
			pstmt= con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				Long movieId = rs.getLong("movieId");
				String movieName = rs.getString("movieName");
				String director = rs.getString("director");
				String genre = rs.getString("genre");
				Double rating = rs.getDouble("rating");
				
				Movie movie = new Movie(movieId,movieName,director,genre,rating);
				movieList.add(movie);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return movieList;
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Movie convertToObject(ResultSet rs) throws SQLException{
		Long movieid = rs.getLong("movieId");
		String movieName = rs.getString("movieName");
		String director = rs.getString("director");
		String genre = rs.getString("genre");
		Double rating = rs.getDouble("rating");
		
		return new Movie(movieid,movieName,director,genre,rating);
	}
	@Override
	public int remove(long movieId) {
		String sql = "delete from movieas where movieid=?";
		PreparedStatement pstmt = null;
		int rowDeleted=0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, movieId);
			rowDeleted = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowDeleted;
	}

	@Override
	public int updateRating(long movieId, double currentRating){
		String sql = "update movieas set rating =? where movieId=?";
		int rowUpdated=0;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(2, movieId);
			pstmt.setDouble(1, currentRating);
			rowUpdated = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public Movie findByPrimaryKey(long movieId) {
		String sql = "select * from movieas where movieId=?";
		PreparedStatement pstmt = null;
		try {
			pstmt= con.prepareStatement(sql);
			pstmt.setLong(1, movieId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				Movie movie=convertToObject(rs);
				
				return movie;
			}
		}
			catch (Exception e) {
				e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
