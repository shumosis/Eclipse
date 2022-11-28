package com.xworkz.rules.things;

public class Employee implements Company {

	@Override
	public int getInTime() {
		System.out.println("running getInTime");
		return 8;
	}

	@Override
	public int getOutTime() {
		System.out.println("running  getOutTime");
		return 4;
	}

	@Override
	public boolean Workhard() {
		System.out.println("running Workhard");
		return true;
	}

	@Override
	public int lunchTime() {
		System.out.println("running lunchTime");
		return 12;
	}

	@Override
	public boolean shoesCompulsory() {
		System.out.println("running shoesCompulsory");
		return true;
	}

}
