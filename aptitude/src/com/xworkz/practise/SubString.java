package com.xworkz.practise;

import java.util.Arrays;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		

		//Scanner Sc= new Scanner(System.in);
		
		//System.out.println("enter the string");
		
		//String str = Sc.nextLine();
		//String str = "shumosis";
		//String x=str.substring(0,2);
	
		//System.out.println(x);
		
		//String y = str.substring(3);
	//	System.out.println(y);
		//String a = "shubham";
	//	String b = "garve";
		//String m = a.replace(a,b);
		
		//System.out.println(m);
		
		String  word = "abcdefg";
		 
		int len = word.length();
		
		if(len%2 != 0) {
			len--;
			System.out.println(len);
		}
		
		String firstHalf = word.substring(0,3);
		System.out.println(firstHalf);
		String secondHalf = word.substring(3);
		System.out.println(secondHalf);
		
		//String  word = "abcdefg";
	//	int len = word.length();

		//String firstHalf = word.substring(0, len/2 - (len % 2 == 1 ? 1 : 0));
	//	System.out.println(firstHalf);
		//String secondHalf = word.substring(len/2);
	//	System.out.println(secondHalf);
		
}

}
