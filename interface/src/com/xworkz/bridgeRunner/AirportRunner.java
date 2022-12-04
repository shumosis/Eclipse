package com.xworkz.bridgeRunner;

import com.xworkz.bridge.Airport;
import com.xworkz.bridge.AirportAuthority;
import com.xworkz.bridge.Passenger;

public class AirportRunner {

	public static void main(String[] args) {
	  
		Passenger passenger = new Passenger();
		AirportAuthority airportAuthority = new AirportAuthority(passenger);
		
		airportAuthority.checkRules();

	}

}
