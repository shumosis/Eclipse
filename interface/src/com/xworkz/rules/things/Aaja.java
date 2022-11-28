package com.xworkz.rules.things;

public class Aaja implements Aaji{

	@Override
	public String aajijName() {
		System.out.println("name is");
		return "sonabai";
	}

	@Override
	public boolean givesMoney() {
		System.out.println(" she give money  everyday");
		return true;
	}

	@Override
	public boolean caring() {
       System.out.println("she is vary caring");
		return true;
	}

	@Override
	public String work() {
		System.out.println("");
		return "teacher";
	}

	@Override
	public int totalGold() {
		System.out.println("");
		return 50;
	}

}
