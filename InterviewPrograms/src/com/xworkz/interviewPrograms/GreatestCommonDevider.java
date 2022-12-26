package com.xworkz.interviewPrograms;

import java.util.Scanner;

public class GreatestCommonDevider {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input1");
		int input1 = sc.nextInt();
		System.out.println("enter the input2");
		int input2 = sc.nextInt();
		System.out.println("enter the input3");
		int input3 = sc.nextInt();
		
		int max;
		
		if(input1>=input2 && input1>=input3 ) {
			max=input1;
		}else if(input2>=input1 && input2>=input3) {
			max=input2;
		}else {
			max = input3;
		}
		for(int i = max;i>=1;i--) {
			if(input1%i==0 && input2%i==0 && input3%i==0) {
				System.out.println(i);
				break;
				
			}
	
		}

	}

}
