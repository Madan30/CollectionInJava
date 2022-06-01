package com.NepalCode.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDetails {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> snames = new LinkedHashMap<>();

		snames.put(1, "Mm");
		snames.put(2, "Dm");

		snames.put(3, "Sm");
		snames.put(4, "Jm");

		snames.put(5, "YM");
		snames.put(6, "Zm");

		snames.put(7, "Km");
		snames.put(8, "AM");

		System.out.println(snames);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		// traverse and fetch data using keySet

		System.out.println("Using keySet to fetch data");
		Iterator<Integer> it = snames.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = snames.get(key);
			System.out.println("Key is : " + key + " " + " Value is : " + value);
		}

		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		// using entrySet
		System.out.println("Using entry ket");
		Iterator<Entry<Integer, String>> itr = snames.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("The key is: " + entry.getKey() + " and " + " value is: " + entry.getValue());
		}

		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");

		// using java 8 stream
		System.out.println("Using java 8 stream");
		snames.forEach((k, v) -> System.out.println("Key is: " + k + " and " + "value is: " + v));

	}

}
