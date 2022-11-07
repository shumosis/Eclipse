package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pc.*;

public class JailRunner  {

	public static void main(String[] args) {
		
		Jail jail = new Subjail();
		Subjail subjail =(Subjail) jail;
		
		System.out.println(subjail.types);
		System.out.println(subjail.placeFor);
		System.out.println(subjail.level);
		System.out.println(subjail.name);
		
		
		Jail jail1 = new  OpenJail();
		 OpenJail  OpenJail = ( OpenJail )jail1;
		 
		 System.out.println( OpenJail.level);
		 System.out.println( OpenJail.name);
		 
		 
		 Jail jail2 = new SpeacialJail();
		 SpeacialJail SpeacialJail = (SpeacialJail)jail2;
		 
		 System.out.println(SpeacialJail.level);
		 System.out.println(SpeacialJail.name);
		 

		
		

	}

}
