package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pcchaining.BachalorParty;
import com.xworkz.shumoss.pcchaining.Facility;

public class BachlerPartyRunner {

	public static void main(String[] args) {
		
		BachalorParty bachalorParty = new Facility("xworkz","omkarSir","AksharaSir");
		
		System.out.println(bachalorParty.place);
		System.out.println(bachalorParty.organiser);
		System.out.println(bachalorParty.maintainance);
	

	}

}
