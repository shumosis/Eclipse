package com.xworkz.rules.boot;

import com.xworkz.rules.things.Trip;
import com.xworkz.rules.things.TripMember;

public class TripRunner {

	public static void main(String[] args) {
		
		Trip trip = new TripMember();
		
		trip.onBike();
		trip.setDate();
		trip.setMembers();
		trip.setPlace();
		trip.succesful();

	}

}
