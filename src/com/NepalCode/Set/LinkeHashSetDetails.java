package com.NepalCode.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkeHashSetDetails {
	public static void main(String[] args) {

		LinkedHashSet<String> names = new LinkedHashSet<>();

		// add method
		names.add("Madan");
		names.add("Ghale");
		names.add("Damon");
		names.add("Rai");
		names.add("Sanju");
		System.out.println(names);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// remove method
		names.remove("Rai");
		System.out.println(names);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// contains method
		names.contains("Rai");
		System.out.println(names);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);

		System.out.println(list);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);

		System.out.println(list1);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// addAll method
		System.out.println("Using addAll method");
		list1.addAll(list);
		System.out.println(list1);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// removeAll method
		System.out.println("Using removeAll method");
		list1.removeAll(list);
		System.out.println(list1);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// removeIf method
		System.out.println("Using removeIf method");
		list1.removeIf(num -> num % 2 == 0);
		System.out.println(list1);

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// traverse and featch the data
		// using for loop
		System.out.println("Using for loop");
		for (Integer ins : list1) {
			System.out.println(ins);
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// using Iterator
		System.out.println("Using iterator ");
		Iterator<Integer> it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		// using java 8 stream
		System.out.println("Using java 8 stream");
		list1.stream().forEach(ele -> {
			System.out.println(ele);
		});
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

	}

}
