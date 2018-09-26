package com.training.custommap;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		MyMap<Integer, String> map = new MyMap<>();
		
		System.out.println(map.put(1, "One"));
		System.out.println(map.put(1, "One"));
		System.out.println(map.put(2, "Two"));
//		System.out.println(map.get(1));
		HashSet<String> set = new HashSet<>();
		set=map.convertToSet(map);
		set.forEach(System.out::println);

	}

}
