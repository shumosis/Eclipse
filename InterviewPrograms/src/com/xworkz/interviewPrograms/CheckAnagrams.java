package com.xworkz.interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter th  input1");
		String input1 = sc.next();
		System.out.println("enter the input 2");
		String input2 = sc.next();
		
		if(input1.length()==input2.length()) {
			char temp1[] =input1.toLowerCase().toCharArray();
			char temp2[] =input2.toLowerCase().toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
		
		
		if(Arrays.equals(temp1,temp2))
			System.out.println(1);
		else
			System.out.println(0);
		}	

	}

}
