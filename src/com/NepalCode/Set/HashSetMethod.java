package com.NepalCode.Set;

import java.util.HashSet;

public class HashSetMethod {
	public static void main(String[] args) {

		HashSet<Integer> list = new HashSet<Integer>();

		// add method
		list.add(1);
		list.add(2);

		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);

		list.add(7);
		list.add(8);

		System.out.println(list);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		System.out.println(list.size());

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		// remove method
		System.out.println("Using remove method");
		list.remove(3);
		System.out.println(list);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		HashSet<Integer> list1 = new HashSet<Integer>();

		list1.add(9);
		list1.add(10);

		list1.add(11);
		list1.add(12);

		list1.add(13);
		list1.add(14);

		list1.add(15);
		list1.add(16);
		System.out.println(list1);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		// addAll method
		System.out.println("Using addAll method");
		list1.addAll(list);
		System.out.println(list1);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		// removeAll method
		System.out.println("Using removeAll method");
		list1.removeAll(list);
		System.out.println(list1);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

		// removeIf method
		System.out.println("Using removeIf method");
		list1.removeIf(ele -> ele % 2 == 0);
		System.out.println(list1);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");

	}

}
