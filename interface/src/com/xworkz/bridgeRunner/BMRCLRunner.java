package com.xworkz.bridgeRunner;

import com.xworkz.bridge.BMRCL;
import com.xworkz.bridge.Passenger;

public class BMRCLRunner {

	public static void main(String[] args) {
		

		Passenger passenger = new Passenger();
		
		BMRCL bmrcl = new BMRCL(passenger);
		
		bmrcl.checkingRule();

	}

}
