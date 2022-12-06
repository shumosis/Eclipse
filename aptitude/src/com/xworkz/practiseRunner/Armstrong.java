package com.xworkz.practiseRunner;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;

		int c;
		int sum = 0;
		int temp;
		int original = n;
		for (; n != 0; n = n / 10) {

			c = n % 10;
			temp = c * c * c;

			sum = sum + temp;
			System.out.println(sum);

		}
		if (sum == original) {
			System.out.println("no is armstrong number");
		} else {
			System.out.println("no is not armstrong number");
		}

	}

}
