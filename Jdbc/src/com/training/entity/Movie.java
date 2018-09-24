package com.training.entity;

import java.io.Serializable;

public class Movie implements Serializable{
	
	private long movieId;
	private String movieName;
	private String director;
	private String genre;
	private double rating;
	
	public Movie(long movieId, String movieName, String director, String genre, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.genre = genre;
		this.rating = rating;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", genre=" + genre
				+ ", rating=" + rating + "]";
	}
	
	
}
