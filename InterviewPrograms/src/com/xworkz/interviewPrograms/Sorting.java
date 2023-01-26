package com.xworkz.interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("enter the array size");
int size = scanner.nextInt();
System.out.println("enterbthe array mmemebres");
int[] arr = new int[size];

for(int i = 0;i<size;i++) {
	arr[i]=scanner.nextInt();
}

//int[] arr1 = {5, 2, 8, 1, 9, 3};

// Sort the array
Arrays.sort(arr);

// Remove the first element
int[] newArr = new int[arr.length - 1];
System.arraycopy(arr, 1, newArr, 0, newArr.length);

// Print the modified array
for (int i : newArr) {
    System.out.print(i + " ");
}
}
}

