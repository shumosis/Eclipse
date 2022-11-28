package com.xworkz.rules.boot;

import com.xworkz.rules.things.Bus;
import com.xworkz.rules.things.Traveller;

public class BusRunner {

	public static void main(String[] args) {
		
		
		Bus bus = new  Traveller();
         
		bus.setEnd();
		bus.onTime();
		bus.setStart();
		bus.setTicketPrice();
		bus.settime();
	}

}
