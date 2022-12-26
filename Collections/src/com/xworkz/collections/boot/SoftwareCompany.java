package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {

		Collection<String> softCom = new ArrayList<String>() ;
		
		String softwareComany1 = "A";
		String softwareComany2 = "B";
		String softwareComany3 = "C";
		String softwareComany4 = "D";
		String softwareComany5 = "E";
		String softwareComany6 = "F";
		String softwareComany7 = "G";
		String softwareComany8 = "H";
		String softwareComany9 = "I";
		String softwareComany10 = "J";
		String softwareComany11 = "K";
		String softwareComany12 = "L";
		String softwareComany13 = "M";
		String softwareComany14 = "N";
		String softwareComany15 = "O";
		String softwareComany16 = "P";
		String softwareComany17 = "Q";
		String softwareComany18 = "R";
		String softwareComany19 = "S";
		String softwareComany20 = "T";
		String softwareComany21 = "U";
		
		softCom.add(softwareComany21);
		softCom.add(softwareComany20);
		softCom.add(softwareComany19);
		softCom.add(softwareComany18);
		softCom.add(softwareComany17);
		softCom.add(softwareComany16);
		softCom.add(softwareComany15);
		softCom.add(softwareComany14);
		softCom.add(softwareComany13);
		softCom.add(softwareComany12);
		softCom.add(softwareComany11);
		softCom.add(softwareComany10);
		softCom.add(softwareComany9);
		softCom.add(softwareComany8);
		softCom.add(softwareComany7);
		softCom.add(softwareComany5);
		softCom.add(softwareComany4);
		softCom.add(softwareComany3);
		softCom.add(softwareComany2);
		softCom.add(softwareComany1);
		
		System.out.println(softCom.size());

	     Iterator<String> ref =  softCom .iterator();
	     
	     while(ref.hasNext()) {
	    	 
	    	 String value = ref.next();
	    	 System.out.println(value);
	     }
		
	}

}
