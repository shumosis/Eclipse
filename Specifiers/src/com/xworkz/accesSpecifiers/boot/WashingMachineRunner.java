package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.WashingMachine;
import com.xworkz.accesSpecifiers.Washinngg;

public class WashingMachineRunner {

	public static void main(String[] args) {
	
		WashingMachine washingMachine = new WashingMachine("lg","gray","washcloths",2,25,2,50,20000, false, false) ;
		
		washingMachine.getOwner();
		
		 Washinngg  washinngg = new  Washinngg();
		 
		 washinngg.useMachine(washingMachine);

	}

}
