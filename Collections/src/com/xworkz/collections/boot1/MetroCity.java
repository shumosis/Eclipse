package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {

	public static void main(String[] args) {
		

		Collection<String> metroCitys = new ArrayList<String>() ;
		
		String Metrocity1 = "bengaluru";
		String Metrocity2 = "mumbai";
		String Metrocity3 = "puna";
		String Metrocity4 = "delhi";
		String Metrocity5 = "kolkata";
		
		metroCitys.add(Metrocity5);
		metroCitys.add(Metrocity4);
		metroCitys.add(Metrocity3);
		metroCitys.add(Metrocity2);
		metroCitys.add(Metrocity1);
		
		System.out.println(metroCitys.size());
		 
			
			
		     Iterator<String> ref = metroCitys .iterator();
		     
		     while(ref.hasNext()) {
		    	 
		    	 String value = ref.next();
		    	 System.out.println(value);
		     }
	}

}
