package com.xworkz.rules.things;

public class Husband implements Wife {

	@Override
	public boolean drinking() {
		System.out.println("running  drinking");
		return false;
	}

	@Override
	public boolean smoking() {
		System.out.println("running smoking");
		return false;
	}

	@Override
	public String bringtomato() {
		System.out.println("running bringtomato");
		return "tomato";
	}

	@Override
	public String bringSaree() {
		System.out.println("running bringSaree");	
		return "Saree";
	}

	@Override
	public String eatIdaly() {
		System.out.println("running eatIdaly");
		return "Idaly";
	}

}
