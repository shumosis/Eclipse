package com.xworkz.practiseRunner;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
	      System.out.println("start");
	      System.out.println("end");;
          int start =Sc.nextInt();
         // System.out.println(start);
          int end = Sc.nextInt();
          //System.out.println(end);
          
       
          
          for(int i = start;i<=end;i++) {
        	  System.out.println(i);
        	  
        	  int num=i;
        	  int temp = num;
        	 // System.out.println(" "+temp);
        	  int count = 0;
        	  while(temp >0) {
        		  count++;
        		  temp = temp/10;
        	  }
        	  int n = temp;
        	  int ref = 0;
        	  int sum = 0;
        	  while(n>0) {
        		  
        		  ref = n%10;
        		  sum +=(int)Math.pow(ref,count);
        		  count--;
        	  }
        	  if(num == sum) {
        		  System.out.println(num+" ");
        	  }
          }
	}

}
