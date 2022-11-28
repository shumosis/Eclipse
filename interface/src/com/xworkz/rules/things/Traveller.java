package com.xworkz.rules.things;

public class Traveller implements Bus {

	@Override
	public String setStart() {
		System.out.println("running setStart ");
		return "vidyaranyapuara";
	}

	@Override
	public String setEnd() {
		System.out.println("running setEnd");
		return "rajajinagar";
	}

	@Override
	public int settime() {
		System.out.println("running settime");
		return 7;
	}

	@Override
	public int setTicketPrice() {
		System.out.println("running setTicketPrice");
		return 25;
	}

	@Override
	public boolean onTime() {
		System.out.println("running onTime ");
		return false;
	}

}
