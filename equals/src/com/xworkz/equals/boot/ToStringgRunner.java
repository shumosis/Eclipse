package com.xworkz.equals.boot;

public class ToStringgRunner {

	public static void main(String[] args) { 
		int count=0;
		int count1=0;
		char c =0;
		
		String Str = "Triple Riding is a Kannada movie released on 25 Nov 2022 The movie is directed by Mahesh Gowda and featured Aditi PrabhudevaRachana Inder Sadhu Kokila and Rangayana Raghu as lead characters.";
		
		String[] splitted=Str.split(" ");
		for (int i = 0;i<splitted.length;i++)
		{
			System.out.println(splitted[i]);
		}
		System.out.println("================");
		
		
		char[] ch=Str.toCharArray();
		
	
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='R') {
			count++;
			}
		}
		System.out.println("R count : "+count);
	
		System.out.println("======================");
	        //isDigit(s. charAt(i))
	       //'Character. isDigit'
		  //System.out.println("Displaying digits: "+str.replaceAll("\D", ""));
		for(int i=0;i<ch.length;i++) {
			
		 c=Str.charAt(i);
		
		 if(Character.isDigit(c)) {
			 
			 System.out.println(c);
		 }
		
		}
		System.out.println("======================");
		StringBuffer rev=new StringBuffer ("Triple Riding is a Kannada movie released on 25 Nov 2022 The movie is directed by Mahesh Gowda and featured Aditi PrabhudevaRachana Inder Sadhu Kokila and Rangayana Raghu as lead characters.");	
		rev.reverse();
		System.out.println(rev);
		System.out.println("======================");
		System.out.println(Str.toLowerCase());
		System.out.println("======================");
		System.out.println(Str.toUpperCase());
		System.out.println("======================");
		
		
		String str = "Triple Riding is a Kannada movie released on 25 Nov 2022 The movie is directed by Mahesh Gowda and featured Aditi PrabhudevaRachana Inder Sadhu Kokila and Rangayana Raghu as lead characters.";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		 }
}
