package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pcchaining.Catering;
import com.xworkz.shumoss.pcchaining.Menu;

public class CaterinRunner {
	
	public static void main(String[] shumos) {
		
		
		Catering catering = new Menu("marrage","shumosis"," Akshay");
		
		System.out.println(catering.cateringFor);
		System.out.println(catering.cateringCompanyOwner);
		System.out.println(catering.cateringCompany);
		
			
		
		
		
	}

}
