package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.overriding.Moon;
import com.xworkz.shumoss.overriding.Sattelite;

public class MoonRunner {

	public static void main(String[] args) {
		
		
		Moon moon = new Sattelite("circle",1000000,"Chandrayana");
		
		moon.showme();
		

	}

}
