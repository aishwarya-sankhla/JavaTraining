package com.training.custommap;

import java.util.HashSet;

public class MyMap<K,V> {
	private int capacity = 5;
	private int index=0;
	private MapEntry<K, V>[] values = new MapEntry[capacity];
	
	public V put(K key,V value){
			for(int i=0;i<index;i++){
				if(values[i].getKey().equals(key)){
					return values[i].getValue();
				}
			}
			MapEntry<K, V> mape = new MapEntry<K, V>(key, value);
			values[index]=mape;
			index++;
		return null;
	}
	
	public V get(K key){
		for(MapEntry<K,V> m:values){
			if(m.getKey().equals(key)){
				return m.getValue();
			}
		}
		return null;
	} 
	
	public HashSet<V> convertToSet(MyMap<K, V> m){
		HashSet<V> set = new HashSet<>();
		for(int i=0;i<index;i++){
			set.add(values[i].getValue());
		}
		return set;
	}
}
