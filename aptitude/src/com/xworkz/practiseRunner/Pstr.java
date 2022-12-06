package com.xworkz.practiseRunner;

public class Pstr {

	public static void main(String[] args) {


		String str="nayan";
		String revstr="";
		
		for(int index=str.length()-1;index>=0;index--)
		{
			revstr=revstr+str.charAt(index);
		}
		System.out.println(revstr);
		System.out.println(str);
		
	if(revstr.equals(str))
	{
		System.out.println("str is palindrome");
	}
	else
	{
		System.out.println("str is not palindrome");
	}
	}

}
