package com.xworkz.interviewPrograms;

import java.util.Scanner;
//Input Format

//The first line contains an integer,q, denoting the number of queries.
//Each line i of the q subsequent lines contains three space-separated integers 
//describing the respective a, b, n and  values for that query.
//(a +2°. b), (a + 2°. b + 2¹b).....
public class PrintingSeries {

	public static void main(String[] args) {
		
	     Scanner in = new Scanner(System.in);
	    System.out.println("enter the value for q");
	        int q=in.nextInt();
	        for(int i=0;i<q;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	               int current = a;
	            for (int j = 0; j < n; j++) {
	                current =current + (int) Math.pow(2, j) * b;
	                System.out.print(current + " ");
	              
	            }
	            System.out.println();
	        }
	        in.close();
		

	}

}
