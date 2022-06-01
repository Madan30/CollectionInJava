package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListAllMethod {
	public static void main(String[] args) {

		ArrayList<String> country = new ArrayList<>();

		// 1. add method: to add element in arrayList
		country.add("Nepal");
		country.add("India");

		country.add("Korea");
		country.add("Japan");

		country.add("China");
		country.add("USA");

		country.add("Canada");
		country.add("UK");

		System.out.println(country);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		ArrayList<String> capital = new ArrayList<>();

		// add method:
		capital.add("Kathmandu");
		capital.add("New Delhi");

		capital.add("Seoul");
		capital.add("toyko");

		capital.add("Bejing");
		capital.add("washington DC");

		capital.add("Ottawa");
		capital.add("london");

		System.out.println(capital);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Collection-----------------");
		Collections.sort(capital);
		System.out.println(capital);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// addAll method in ArrayList: used to add all the element in index and object
		// based
		// addAll element object based
		System.out.println("Adding all element using object based");
		capital.addAll(country);
		System.out.println(capital);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		System.out.println("Adding all element using index based with object");
		// adding country in index 3
		capital.addAll(3, country);
		System.out.println(capital);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// clone method in arrayList: Duplicating element
		System.out.println("Using clone method");
		ArrayList<String> cloneList = (ArrayList<String>) capital.clone();
		System.out.println(cloneList);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		/*
		 * // clear method in arrayList: to clear all the element
		 * 
		 * System.out.println("Clearing all element in arrylist"); capital.clear();
		 * System.out.println(capital);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------------------------"
		 * ); System.out.println(
		 * "-------------------------------------------------------------------------------"
		 * );
		 */

		// contains method: it is a boolean method which return T or F

		System.out.println("Using contains method in arraylist");

		capital.contains("Kathmandu");
		System.out.println(capital);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(2);

		intList.add(3);
		intList.add(4);

		intList.add(5);
		intList.add(6);

		intList.add(7);
		intList.add(8);

		intList.add(9);
		intList.add(10);

		System.out.println(intList);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// remove method in arrayList in java: to remove element
		System.out.println("Using remove method");
		intList.remove(2);
		System.out.println(intList);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		
		ArrayList<Integer> intList1 = new ArrayList<Integer>();

		intList1.add(11);
		intList1.add(12);

		intList1.add(13);
		intList1.add(14);

		intList1.add(15);
		intList1.add(16);

		intList1.add(17);
		intList1.add(18);

		System.out.println(intList1);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// adding intiList element to intliSt1
		System.out.println("Adding all element in intList1");
		intList1.addAll(intList);
		System.out.println(intList1);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// removeAll method in arrayList: remove all element from array
		System.out.println("Using removeAll method in arrayList");
		intList1.removeAll(intList);
		System.out.println(intList1);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		// removeIf method in arrayList
		intList1.removeIf(num -> num % 2 == 0);
		System.out.println(intList1);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

		ArrayList<String> collegeName = new ArrayList<String>(Arrays.asList("LBEF", "LSA", "LAW", "Patan", "Oxbridge"));

		// retainAll method in arrayList
		System.out.println("Using retainAll method");
		collegeName.retainAll(Collections.singleton("LSA"));
		System.out.println(collegeName);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");

	}

}
