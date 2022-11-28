package com.xworkz.rules.things;

public class Players implements Cricket{

	@Override
	public int boundry() {
		System.out.println("running boundry ");
		return 4;
	}

	@Override
	public int six() {
		System.out.println("running six");
		
		return 6;
	}

	@Override
	public int wideball() {
		System.out.println("running wideball");
		return 1;
	}

	@Override
	public String noball() {
		System.out.println("running  noball");
		return "free hit";
	}

	@Override
	public String bestPlayer() {
		System.out.println("running bestPlayer");
		return "nobody is best";
	}

}
