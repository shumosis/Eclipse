package com.xworkz.interviewPrograms;

public class Finbocci {

 public static void main(String[] args) {
		
int fib1 = 0;
int fib2 = 1;

for(int i =0;i<10;i++) {
    
	int fib3 = fib1 + fib2;
	System.out.print(fib3+"  ");
        fib1 = fib2;
         fib2= fib3;
     
	}
 }
}
