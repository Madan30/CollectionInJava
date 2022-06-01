package com.NepalCode.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDetails {
	
	// linkedList work

	public static void main(String[] args) {

		Customer c1 = new Customer("Madan", "madanghale", "ghale");
		Customer c2 = new Customer("Sanju", "sanjurai", "rai");
		Customer c3 = new Customer("Anju", "anjupoudel", "poudel");
		Customer c4 = new Customer("Sonam", "sonamsherpa", "sherpa");
		Customer c5 = new Customer("Uvi", "uvithapa", "thapa");
		Customer c6 = new Customer("Damon", "damonrai", "rai");

		LinkedList<Customer> customer = new LinkedList<>();
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		customer.add(c5);
		customer.add(c6);

		System.out.println(customer);
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

		// traverse and fetch data
		System.out.println("Using iterator");
		Iterator<Customer> itr = customer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

		// using typical for loop
		System.out.println("Using typical for loop");
		for (int i = 0; i < customer.size(); i++) {
			System.out.println(customer.get(i));
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

		// using for loop
		System.out.println("Using for each loop");
		for (Customer cus : customer) {
			System.out.println(cus);
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

		// using stream
		System.out.println("Using stream and lambda");
		customer.stream().forEach(ele -> {
			System.out.println(ele);
		});

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

	}

}
