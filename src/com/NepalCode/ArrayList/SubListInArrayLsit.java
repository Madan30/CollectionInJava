package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SubListInArrayLsit {
	public static void main(String[] args) {
		
		// sublist in array
		
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer> sublist = new ArrayList<>(arr1.subList(2,10));
		
		System.out.println(sublist);
	}

}
