package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDetials {
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		
		System.out.println(intList.get(0));
		System.out.println(intList.size());
		
		// using iterator 
		Iterator it = intList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------------------------------------------------");
		// using for loop
		for(Integer ints: intList) {
			System.out.println(ints);
		}
		
		System.out.println("---------------------------------------------------");
		
		// using lamda
		intList.stream().forEach(ele ->{
			System.out.println(ele);
		});
		
	
	}

}
