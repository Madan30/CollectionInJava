package com.NepalCode.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.add("Madan");
		names.add("ghale");

		names.add("Demon");
		names.add("Rai");

		names.add("Sanju");
		names.add("Gurung");

		System.out.println(names);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// usign iterator interface
		System.out.println("Using itreator");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		// using typical for loop
		System.out.println("Using typical for loop");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		// using for loop
		System.out.println("Using for loop");
		for(String s: names) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		// using stream with lambda
		System.out.println("Using lamdba Expression");
		names.stream().forEach(ele ->{
			System.out.println(ele);
		});
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
	}
	
	

}
