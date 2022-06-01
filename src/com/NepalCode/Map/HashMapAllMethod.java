package com.NepalCode.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapAllMethod {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();

		capitalMap.put("Nepal", "Kathmandu");
		capitalMap.put("India", "New Delhi");

		capitalMap.put("China", "Bejing");
		capitalMap.put("USA", "Washington DC");

		capitalMap.put("Japan", "Tokoyo");
		capitalMap.put("Korea", "Seoul");

		System.out.println(capitalMap);

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Nepal"));

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// can we store n number of key null values: only one null key is accepted
		// hashMap is not thread safe ==> unsynchronized
		capitalMap.put(null, "Berlin");
		System.out.println(capitalMap);

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// can we store n number of null values: multiple null values are allowed in map
		capitalMap.put("Paksitan", null);
		capitalMap.put("Bangladesh", null);
		capitalMap.put("Canada", null);
		System.out.println(capitalMap);

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// replace method
		/*
		 * System.out.println("Using replace method"); capitalMap.replace("1", "Nepali",
		 * "Ktm"); System.out.println(capitalMap);
		 * 
		 * System.out.println(
		 * "-----------------------------------------------------------------------------------"
		 * ); System.out.println(
		 * "-----------------------------------------------------------------------------------"
		 * );
		 */
		

		// how to traverse and fetch the data in HashMap
		// using Iterator: keySet()
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key is: " + key + "value is: " + value);
		}

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// Iterator: over the set (pair) by using Entryset

		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key is: " + entry.getKey() + " and " + " value is: " + entry.getValue());
		}

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// iterate hashMap using java 8 for each and lambda
		capitalMap.forEach((k, v) -> System.out.println(k + " : " + (v)));

	}

}
