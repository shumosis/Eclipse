package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		
		Collection<String> animals = new ArrayList<String>() ;
		
		String animal1 ="lion" ;
		String animal2 = "tiger";
		
		
		animals.add("lion");
		animals.add("tiger");
		animals.add("elephant");
		animals.add("mouse");
		animals.add("cat");
		animals.add("human");
		animals.add("jeeraf");
		animals.add("ants");
		animals.add("dog");
		animals.add("panther");
		
		System.out.println(animals.size());
		
	     Iterator<String> ref = animals.iterator();
	     
	     while(ref.hasNext()) {
	    	 
	    	 String value = ref.next();
	    	 System.out.println(value);
	     }
		 

	}

}
