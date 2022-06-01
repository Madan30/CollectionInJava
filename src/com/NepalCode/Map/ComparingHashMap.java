package com.NepalCode.Map;

import java.util.HashMap;

public class ComparingHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		System.out.println(map1);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		System.out.println(map2);

		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		System.out.println(map3);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		// compare on the basis of key-value: use equals method
		System.out.println(map1.equals(map2)); // returns true
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println(map1.equals(map3)); // returns false
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		
		// compare hashMap for the same keys: keySet()
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		

	}

}
