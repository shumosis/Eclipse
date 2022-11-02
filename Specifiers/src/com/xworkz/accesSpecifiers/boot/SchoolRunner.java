package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.School;
import com.xworkz.accesSpecifiers.shcoolll;

public class SchoolRunner {


	public static void main(String[] args) {
	
		School school  = new School("mudhol","principle","chirantimath","bagalkot", 50,2012,500,10000, false, false, true);
		
		shcoolll Shcoolll  =new  shcoolll ();
		
				 school .getName();
		
	
				 Shcoolll.useschool(school);

}
}
