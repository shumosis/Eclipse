package com.xworkz.rules.things;


public class KabbadiPlayer implements Kabbadi{

	@Override
	public int noOfPlayers() {
		System.out.println(" running noOfPlayers ");
		return 7;
	}

	@Override
	public int bonousPoint() {
		System.out.println(" running bonousPoint");
		return 1;
	}

	@Override
	public int superTcklePoint() {
		System.out.println(" running superTcklePoint");
		return 2;
	}

	@Override
	public int allOutPoint() {
		System.out.println(" running allOutPoint");
		return 2;
	}

	@Override
	public int winningPoint() {
		System.out.println(" running winningPoint");
		return 2;
	}

}
