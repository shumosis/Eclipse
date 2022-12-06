package com.xworkz.practiseRunner;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		for(int index=str.length()-1;index>=0;index--)
		{
			char ch=str.charAt(index);
			System.out.print(ch);
		}

	}

}
