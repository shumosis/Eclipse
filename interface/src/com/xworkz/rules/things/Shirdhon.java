package com.xworkz.rules.things;

public class Shirdhon implements Village{

	@Override
	public String setName() {
		System.out.println("running setName");
		return "Shirdhon";
	}

	@Override
	public String getName() {
		System.out.println("running getName");
		return "Shirdhon";
	}

	@Override
	public String getSchoolName() {
		System.out.println("running getSchoolName");
		return "RB Vidyalaya";
	}

	@Override
	public boolean goodVillage() {
		System.out.println("running goodVillage");
		return true;
	}

	@Override
	public String mainWork() {
		System.out.println("running mainWork");
		return "farming";
	}

}
