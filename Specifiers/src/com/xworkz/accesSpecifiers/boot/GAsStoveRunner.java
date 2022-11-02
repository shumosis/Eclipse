package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.GasStove;
import com.xworkz.accesSpecifiers.GasStoveeee;

public class GAsStoveRunner {
	
	public static void main(String[] args) {
		
		 GasStove   gasStove  = new   GasStove ("lg","gray","cooking",2,25,2,50,20000, false, false) ;
		
		 gasStove .getOwner();
		
		 GasStoveeee  GasStoveeee  = new  GasStoveeee ();
		 
		 GasStoveeee .useMachine( gasStove );
		

	}

}
