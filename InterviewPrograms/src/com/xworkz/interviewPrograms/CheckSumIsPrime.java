package com.xworkz.interviewPrograms;

import java.util.Scanner;

public class CheckSumIsPrime {

	public static void main(String[] args) {
           
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input1 = Sc.nextInt();
		int flag = 0;
		
		for(int  i=2;i<input1;i++) {
			if(prime(i)==1) {
				if(prime(input1 - i)==1) {
					flag =1;
					break;
				}
			}
		}
		if (flag ==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		}

	 static int prime(int n) {
		 int c =1;
		 for(int i = 2;i<n;i++) {
			 if(n%i==0) {
				 c=0;
				 break;
			 }
		 }
		
		return c;
	}
			
}
