package com.xworkz.interviewPrograms;

import java.util.ArrayList;
import java.util.List;

//Java Program to Convert a List to an array
//using toArray() Within a loop

//Importing utility classes
import java.util.*;

//Main class
public class MinAndMax {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty LinkedList of string type
		// by declaring object of List
		List<String> list = new LinkedList<String>();

		// Adding elements to above LinkedList
		// using add() method
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("Practice");

		// Converting List to array
		// using toArray() method
		
		String[]  arr1 = new String[list.size()];
		
		 list.toArray(arr1);

		// Printing elements of array
		// using for-each loop
		for (String x : arr1)
			System.out.print(x + " ");
	}
}

