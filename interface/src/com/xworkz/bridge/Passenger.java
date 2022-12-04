package com.xworkz.bridge;

public class Passenger implements MetroRules ,Airport{

	@Override
	public String wearMask() {
	System.out.println("yes Always wear mask");
		return "true";
	}

	@Override
	public String standAwayfromDoor() {
		System.out.println("yes Stand away from door ");
		return "yes";
	}

	@Override
	public boolean keepClean() {
	System.out.println("running keepclean");
		return true;
	}

	@Override
	public boolean carryAadhar() {
		System.out.println("running AadharCArd");
		return true;
	}

}
