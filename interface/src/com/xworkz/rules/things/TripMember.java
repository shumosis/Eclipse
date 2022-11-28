package com.xworkz.rules.things;

public class TripMember implements Trip {

	@Override
	public String setPlace() {
		System.out.println("running setPlace");
		return "goa";
	}

	@Override
	public int setMembers() {
		System.out.println("running setMembers");
		return 8;
	}

	@Override
	public boolean onBike() {
		System.out.println("running onBike");
		return true;
	}

	@Override
	public int setDate() {
		System.out.println("running setDate");
		return 12;
	}

	@Override
	public boolean succesful() {
		System.out.println("running succesful");
		return false;
	}

}
