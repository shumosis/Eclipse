package com.xworkz.interviewPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

public class LargestPythagoreanNumber {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input= sc.nextInt();
		
		int[] a =new int[3];
		a=Pythagorean(input);
		for(int i =0 ;i<3;i++) {
			System.out.println(a[i]+" ");
		
		}}

	
	
	static int[] Pythagorean(int input) {
		int i , j ,k ;
		int[] a = new int[3];
		for(i=input;i>1;i--) {
		   for ( j = input; j > 2; j--) {
			   for(k = input;k > 3;k--) {
				   if(i*i + j*j == k*k) {
					   
					   if(i>j) {
						   a[0]= j;
						   a[1]= i;
						   a[2]=k;
					   }else {
							   a[0]=i;
							   a[1]=j;
							   a[2]=k;
							 
							   return a;
					   }
					   }
			   }
					  
		   }
			   }
			
		
		
		return a;
}


}
