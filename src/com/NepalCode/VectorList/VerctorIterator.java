package com.NepalCode.VectorList;

import java.util.Iterator;
import java.util.Vector;

public class VerctorIterator {
	public static void main(String[] args) {
	
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(1);
		list.add(2);
		
		list.add(3);
		list.add(4);
		
		list.add(5);
		list.add(6);
		
		list.add(7);
		list.add(8);
		
		list.add(9);
		list.add(10);
		
		System.out.println(list);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		// using typical for loop
		System.out.println("Using typical for loop");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		// using for loop
		System.out.println("Using for loop");
		for(Integer ins: list) {
			System.out.println(ins);
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		
		// using Iterator
		System.out.println("Using iterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		// stream with lambda expression
		System.out.println("Using lambda expression");
		list.stream().forEach(ele ->{
			System.out.println(ele);
		});
		
		
	}

}
