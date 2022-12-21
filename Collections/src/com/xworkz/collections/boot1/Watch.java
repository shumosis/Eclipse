package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
	
		Collection<String> watches = new ArrayList<String>() ;
		
		String watch1 ="titan";
		String watch2 ="fastrack";
		String watch3 ="sonata";
		String watch4 ="fossil";
		String watch5 ="maxa";
		
		watches.add(watch5);
		watches.add(watch4);
		watches.add(watch3);
		watches.add(watch2);
		watches.add(watch1);
		
		System.out.println( watches.size());
		
 Iterator<String> ref = watches.iterator();
	     
	     while(ref.hasNext()) {
	    	 
	    	 String value = ref.next();
	    	 System.out.println(value);
	     }
		 
		
	}

}
