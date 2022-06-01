package com.NepalCode.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {

		HashSet<Integer> list = new HashSet<Integer>();

		list.add(1);
		list.add(2);

		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);

		list.add(7);
		list.add(8);

		System.out.println(list);
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");

		// using typical for loop
		/*
		 * for(int i=0; i<list.size(); i++) { System.out.println(list); }
		 */

		// using for loop
		System.out.println("Using for loop");
		for (Integer in : list) {
			System.out.println(in);
		}

		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");

		// using Iterator
		System.out.println("Using iterator");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		
		// using stream with lambda expression
		System.out.println("Using stream with lambda expression");
		list.stream().forEach(ele ->{
			System.out.println(ele);
		});
		

	}

}
