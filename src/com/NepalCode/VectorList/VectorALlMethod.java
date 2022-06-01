package com.NepalCode.VectorList;

import java.util.Vector;

public class VectorALlMethod {

	public static void main(String[] args) {

		Vector<String> name = new Vector<String>();
		
		// add method
		name.add("Madan Ghale");
		name.add("Demon Rai");
		name.add("Sanju Rai");
		name.add("Uvi thapa");

		System.out.println(name);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		// remove method
		System.out.println("Using remove method");
		name.remove("Demon Rai");
		System.out.println(name);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		
		Vector<Integer>num = new Vector<Integer>();
		
		num.add(1);
		num.add(2);
		
		num.add(3);
		num.add(4);
		
		num.add(5);
		num.add(6);
		
		num.add(7);
		num.add(8);
		
		System.out.println(num);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		Vector<Integer>num1 = new Vector<Integer>();
		
		num1.add(9);
		num1.add(10);
		
		num1.add(11);
		num1.add(12);
		
		num1.add(13);
		num1.add(14);
		
		num1.add(15);
		num1.add(16);
		
		System.out.println(num1);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		// addAll method
		System.out.println("Using addAll method");
		num1.addAll(num);
		System.out.println(num1);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		// removeAll method
		System.out.println("Using remove all method");
		num1.removeAll(num);
		System.out.println(num1);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		// removeIf method
		System.out.println("Using removeIf method");
		num1.removeIf(ele -> ele%2==0);
		System.out.println(num1);
		
		

	}

}
