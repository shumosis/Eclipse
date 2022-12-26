package com.xworkz.interviewPrograms;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
        String input1 = sc.next();
        
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i<input1.length();i++) {
         if(input1.charAt(i)=='(' ||input1.charAt(i)=='['||input1.charAt(i)=='{') 
        	 st.push(input1.charAt(i));
         if(input1.charAt(i)==')' ||input1.charAt(i)==']'||input1.charAt(i)=='}') {
        	 char top=(char)st.pop();
        	 if((top=='(' && input1.charAt(i)!=')')||(top=='[' && input1.charAt(i)!=']')||
        			 (top=='{' && input1.charAt(i)!='}')) {
        		 break;
        	 }
        	 }
         }
        if(st.empty())
        		 System.out.println(1);
        else
        		 System.out.println(0);
         
        
	}
}
	


