package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrrayListAllIterator {

	public static void main(String[] args) {

		List<String> sname = new ArrayList<String>();

		sname.add("Ghale");
		sname.add("madan");
		sname.add("Damon");
		sname.add("rai");
		sname.add("sanju");
		sname.add("uvi");

		System.out.println(sname);

		System.out.println("----------------------------------------------------------");

		// using typical for loop
		System.out.println("Using typical for loop");
		for (int i = 0; i < sname.size(); i++) {
			System.out.println(sname.get(i));

		}
		
		System.out.println("----------------------------------------------------------");
		// using for loop
		System.out.println("Using for loop");
		for(String s: sname) {
			System.out.println(s);
		}
		
		
		System.out.println("----------------------------------------------------------");
		
		// using iterator
		System.out.println("Using iterator");
		Iterator<String> itr = sname.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------------------------------------------");
		
		// stream with lambda 
		System.out.println("Using lamdba expression");
		sname.stream().forEach(ele ->{
			System.out.println(ele);
		});

	}

}
