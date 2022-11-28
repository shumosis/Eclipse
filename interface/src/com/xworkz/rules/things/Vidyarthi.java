package com.xworkz.rules.things;

public class Vidyarthi implements Clg{

	@Override
	public String setName() {
	System.out.println("runnins Setname mathod");
		return "BGMIT";
	}

	@Override
	public String getName() {
		System.out.println("runnins getName mathod");
		return "BGMIT";
	}

	@Override
	public String getdegreeName() {
		System.out.println("runnins getdegreeName mathod");
		return "BE";
	}

	@Override
	public boolean goodclg() {
		System.out.println("runnins goodclg mathod");
		return false;
	}

	@Override
	public String getPriciName() {
		System.out.println("runnins getPriciName mathod");
		return "kerror";
	}

}
