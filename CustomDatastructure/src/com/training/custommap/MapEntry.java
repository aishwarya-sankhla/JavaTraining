package com.training.custommap;

public class MapEntry<K,V> {
	private K key;
	private V value;
	
	public MapEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}


	
	
}
