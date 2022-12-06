package com.xworkz.practiseRunner;

public class ArmstronuseWhile {

	public static void main(String[] args) {
		int n = 153;
		int c ;
		int temp;
		int original = n;
		int sum = 0;
		
		while(n>0) {
			
			c=n%10;
			temp = c*c*c;
			
			sum = sum + temp;
			
			System.out.println(sum);
			
			n=n/10;
			
		}
		if (original == sum) {
			System.out.println("no is armstromg num");
		}
		else {
			System.out.println("no is not armstrong number");
		}

	}

}
