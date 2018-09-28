package com.training.entity;

import java.util.List;

public interface DAO<T> {
	public int add(T movie);
	public List<T> findAll();
	public int remove(long key);
	public T findByPrimaryKey(long key);
}
