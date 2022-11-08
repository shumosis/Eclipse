package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pcchaining.Photographer;
import com.xworkz.shumoss.pcchaining.PreWeddingPhotoshoot;

public class PreWeddingRunner {

	public static void main(String[] args) {
		
		 PreWeddingPhotoshoot  PreWeddingPhotoshoot = new Photographer("marrage","OmMa",10000);
		 
		 System.out.println(PreWeddingPhotoshoot.psFor);
		 System.out.println(PreWeddingPhotoshoot.psOF);
		 System.out.println(PreWeddingPhotoshoot.fees);
		 
		 
	

	}

}
