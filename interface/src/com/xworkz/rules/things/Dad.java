package com.xworkz.rules.things;

public class Dad implements Mom{

	@Override
	public String shouts() {
		System.out.println("running shouts ");
		return "very much";
	}

	@Override
	public String Cooking() {
	System.out.println("running Cooking");
		return "chicken";
	}

	@Override
	public String Working() {
		System.out.println("running working");
		return "teacher";
	}

	@Override
	public boolean loving() {
   System.out.println("running loving");
		return true;
	}

	@Override
	public boolean support() {
		System.out.println("running supportive");
		return true;
	}

}
