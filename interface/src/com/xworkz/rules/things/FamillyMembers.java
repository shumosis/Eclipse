package com.xworkz.rules.things;

public class FamillyMembers implements Home {

	@Override
	public int waketime() {
		System.out.println("running waketime");
		return 6;
	}

	@Override
	public int sleeptime() {
		System.out.println("running  sleeptime");
		return 10;
	}

	@Override
	public boolean lateNightParty() {
		System.out.println("running  lateNightParty");
		return false;
	}

	@Override
	public int marrageAtAge() {
		System.out.println("running  marrageAtAge");
		return 24;
	}

	@Override
	public String IfGf() {
		System.out.println("running IfGf ");
		return "Chappal";
	}

}
