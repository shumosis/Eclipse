package com.xworkz.map.boot2;

import java.util.Map;
import java.util.TreeMap;

public class PresidentRunner {

	public static void main(String[] args) {
	
		Map<String,String> coutryPresident = new TreeMap<String, String>((e1,e2)->e2.compareTo(e1));
		
		coutryPresident.put("india","modi");
		coutryPresident.put("Srilanka","Shinde");
		coutryPresident.put("Banglasesh","mifti");
		coutryPresident.put("russia","putin");
		coutryPresident.put("us","Biden");
		coutryPresident.put("England","rushi sunak");
		coutryPresident.put("France","John Carter");
		coutryPresident.put("Saudi arebia","Shekh Salman");
		coutryPresident.put("nepal","bhoje");
		coutryPresident.put("china","shanghai");
		coutryPresident.put("Austrilia","will miller");
		coutryPresident.put("japan","romkplo");
		coutryPresident.put("bhutan","jadhavee");
		coutryPresident.put("iran","mujawqar");
		coutryPresident.put("kenia","kulakkarnii");
		coutryPresident.put("Africa","moredeuppo");
		coutryPresident.put("korea","king john un");
		coutryPresident.put("Germany","russelml");
		coutryPresident.put("Ukrain","shatgekl");
		coutryPresident.put("Palestine","dhumnsoio");
		
		
		coutryPresident.forEach((e1,e2)->System.out.println("key   :"+e1+"   value   :"+e2));
		
		System.out.println("==============================================");
	    coutryPresident.forEach((e1,e2)->{if(e1.length()>10) {
	    	coutryPresident.replace(e1, "kalkatta");
	    	e2=null;
	    	 System.out.println("key   :"+e1+"   value   :"+e2);
	    	 }});

	}

}
