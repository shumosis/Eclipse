package com.xworkz.practise;

import java.util.Arrays;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		

		//Scanner Sc= new Scanner(System.in);
		
		//System.out.println("enter the string");
		
		//String str = Sc.nextLine();
		String str = "shumosis";
		String x=str.substring(0,2);
	
		System.out.println(x);
		
		String y = str.substring(3);
		System.out.println(y);
		String a = "shubham";
		String b = "garve";
		String m = a.replace(a,b);
		
		System.out.println(m);
}

}
