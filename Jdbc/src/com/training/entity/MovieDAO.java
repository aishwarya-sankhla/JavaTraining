package com.training.entity;

public interface MovieDAO<T> extends DAO<T> {
	public int updateRating(long movieId,double currentRating);
}
