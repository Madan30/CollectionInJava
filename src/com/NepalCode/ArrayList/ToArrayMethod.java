package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethod {
	public static void main(String[] args) {
		
		// to array method
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("abc","bcd","cde","def","efg"));
		
		Object [] objArr = newList.toArray();
		
		System.out.println(Arrays.toString(objArr));
		
		for(Object o: objArr) {
			System.out.println((String)o);
		}
	}

}
