package com.xworkz.practiseRunner;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str="hands on learning happens here";
		String s="";
		int count = 0;
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				
				count++;
			}else {
				s+=ch;//s=s+ch;
			}

		}
		System.out.println("white spaces :" +count);
		System.out.println("String without spaces:"+s);
		}	
		
	}

	
