package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Friedge;
import com.xworkz.accesSpecifiers.Friedgeee;


public class FriedgeRunner {

	public static void main(String[] args) {
		
		
		Friedge  friedge  = new Friedge ("lg","gray","forcooling",2,25,2,500,20000, false, false) ;
		
		friedge .getOwner();
		
		 Friedgeee   friedgeee = new   Friedgeee();
		 
		 friedgeee.useMachine(friedge);

	}

}
