package com.xworkz.practise;

import java.util.Scanner;

public class Sum {

	public  int evenId(int [] arr) {
		
	int sum = 0;
	
	for(int i =0;i<arr.length;i++) {
		
		if(arr[i]%2!=0) {
			
			sum = sum +arr[i];
		
		}
	}
	
	return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("enter the array element");
		
		for (int i = 0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			
			
			
			
		}
		Sum sum = new Sum();
		System.out.println("the total sum of the element" +sum.evenId(arr));
	}

}

 
