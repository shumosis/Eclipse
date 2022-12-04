package com.xworkz.bridge;

public class AccoutHolder implements BankRules {

	@Override
	public int minBalance() {
		System.out.println("running minBalance");
		return 100;
	}

	@Override
	public boolean wearMask() {
		System.out.println("running wearmask");
		return true;
	}

}
