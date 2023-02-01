package com.xworkz.interviewPrograms;

import java.util.Scanner;

public class IndexOfGivenElement {

	
	
public static int index(int[] marks ,int mar) {
		 int i = 0 ;
		if(marks != null) {
			for( i = marks.length -1 ;i>=0;i--) {
				
				if(marks[i]==mar) {
					
					
				break;
				}
				
			}
		}
		return i ;
}

	public static void main(String[] args) {
		
		//int[] marks= {94,96,95,98,97,96};
		
		//int mar = 98;
		
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the element to find index");
		int mar = sc.nextInt();
		System.out.println("enter the marks");
		int marks[] = new int[size];
		for(int i = 0;i<size;i++) {
			marks[i]=sc.nextInt();
			
		}
	System.out.println(index(marks, mar));
		
		}
}