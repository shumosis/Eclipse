package com.xworkz.rules.things;

public class CampMembers implements ArmyCamp {

	@Override
	public String setLocation() {
		System.out.println(" running setLocation");
		return "mysore";
	}

	@Override
	public int setMembers() {
		System.out.println(" running setMembers");
		return 12;
	}

	@Override
	public String setCaptain() {
		System.out.println(" running   setCaptain");
		return "shumosis";
	}

	@Override
	public int wakeTime() {
		System.out.println(" running wakeTime");
		return 8;
	}

	@Override
	public int sleepTime() {
		System.out.println(" running  sleepTime");
		return 12;
	}

}
