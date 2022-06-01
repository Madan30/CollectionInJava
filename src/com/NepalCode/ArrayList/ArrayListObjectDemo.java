package com.NepalCode.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListObjectDemo {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s2 = new Student(2, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s3 = new Student(3, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s4 = new Student(4, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s5 = new Student(5, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s6 = new Student(6, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");
		Student s7 = new Student(7, "Madan", "Maitidevi", "9818445147", "madanghale10@gmail.com", "ghale");

		List<Student> studentList = new ArrayList<Student>();

		// add method in arraylsit
		studentList.add(s1);
		studentList.add(s2);

		studentList.add(s3);
		studentList.add(s4);

		studentList.add(s5);
		studentList.add(s6);

		studentList.add(s7);
		// studentList.add(s8); It gives arrayIndexoutOfBounche

		// remove method in arrayList
		studentList.remove(1);

		// using for each loop
		System.out.println("Using for loop");
		for (Student s : studentList) {
			System.out.println(s);
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// using iterator
		System.out.println("Using iterator");
		Iterator itr = studentList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// using  streams with lambda
		System.out.println("Using lamda");
		studentList.stream().forEach(sts -> {
			System.out.println(sts);
		});

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// using typical loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

	}

}
