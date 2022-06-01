package com.NepalCode.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapItreator {
	public static void main(String[] args) {

		Map<Integer, String> studentList = new HashMap<Integer, String>();
		studentList.put(1, "Hira");
		studentList.put(2, "Ram");
		studentList.put(3, "Shyam");
		studentList.put(4, "Hari");

		System.out.println(studentList);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// traverse and fetch data in map
		// keySet().iterator
		System.out.println("Using keySet().iterator");
		Iterator<Integer> itr = studentList.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			String value = studentList.get(key);
			System.out.println("Key is: " + key + " value is: " + value);
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// entrySet.iterator
		System.out.println("Using entrySet.iterator");
		Iterator<Entry<Integer, String>> it = studentList.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println("Key is: " + entry.getKey() + " and " + " value is: " + entry.getValue());
		}

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// iterate hashMap using java 8 for each and lambda
		System.out.println("Using java 8 for each and lambda");
		studentList.forEach((k, v) -> System.out.println(k + " : " + (v)));

	}

}
