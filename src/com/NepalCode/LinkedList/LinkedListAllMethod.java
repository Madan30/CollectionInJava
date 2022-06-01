package com.NepalCode.LinkedList;

import java.util.LinkedList;

public class LinkedListAllMethod {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		// add method
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		System.out.println(list);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// remove method
		System.out.println("Using remove method");
		list.remove(4);
		System.out.println(list);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// removeIf method
		System.out.println("Using remove if method");
		list.removeIf(ele -> ele % 2 == 0);
		System.out.println(list);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// contain method
		System.out.println("Using contain method");
		list.contains(3);
		System.out.println(list);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		LinkedList<String> name = new LinkedList<String>();

		name.add("Madan");
		name.add("Ghale");

		name.add("Sanju");
		name.add("Rai");

		name.add("Demon");
		name.add("Rai");

		System.out.println(name);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		LinkedList<String> name1 = new LinkedList<String>();

		name1.add("Suna");
		name1.add("Tamange");

		name1.add("Ranju");
		name1.add("Magar");

		name1.add("Renu");
		name1.add("Poudel");

		System.out.println(name1);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// addAll method
		System.out.println("Using add all method");
		name1.addAll(name);
		System.out.println(name1);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// removeAll method
		System.out.println("Using add all method");
		name1.removeAll(name);
		System.out.println(name1);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		// contains method
		System.out.println("Using contains method");
		name1.contains("Madna");
		System.out.println(name1);
	}

}
