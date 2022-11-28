package com.xworkz.rules.things;

public class Bhakts implements Temple {

	@Override
	public int morningAarati() {
		System.out.println("running morningAarati");
		return 6;
	}

	@Override
	public int eveningAarati() {
		System.out.println("running eveningAarati ");
		return 6;
	}

	@Override
	public int prasadStarts() {
		System.out.println("running prasadStarts");
		return 12;
	}

	@Override
	public String panditName() {
		System.out.println("running panditName");
		return "Akshay";
	}

	@Override
	public int abhishekPrice() {
		System.out.println("running abhishekPrice");
		return 501;
	}

}
