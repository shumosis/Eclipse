package com.xworkz.rules.things;

public class Students implements VinodaMam {

	@Override
	public String givePresentationTopic() {
		System.out.println("running givePresentationTopic ");
		return "methods";
	}

	@Override
	public String takePresentation() {
		System.out.println("running takePresentation");
		return "yes";
	}

	@Override
	public boolean xworkzFavourite() {
		System.out.println("running xworkzFavourite");
		return true;
	}

	@Override
	public String takeAttendance() {
		System.out.println("running takeAttendance");
		return "yes";
	}

	@Override
	public boolean happyGirl() {
	    System.out.println("running happyGirl");
		return true;
	}

}
