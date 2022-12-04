package com.xworkz.bridge;

public class Reader implements LibraryRules {

	@Override
	public int membershipFees() {
		System.out.println("runn membershipFees");
		return 700;
	}

	@Override
	public boolean maintainsailence() {
		System.out.println("runn maintainsailence");
		return false;
	}

}
