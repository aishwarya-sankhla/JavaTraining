package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class Application {
	public static void main(String[] args){ 
		Gson obj = new Gson();
		
		Logger log = Logger.getRootLogger();
		BasicConfigurator.configure();
		
		Movie diamond = new Movie(101, "Diamond");
		String jsonRep = obj.toJson(diamond);

		log.info(jsonRep);
		
		Movie capture = obj.fromJson(jsonRep, Movie.class);
		
		log.info(capture.getMovieId());
		log.info(capture.getMovieName());
	}
}
