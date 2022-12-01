package com.xworkz.rules.followers;

public class XworkzRajajiNagar implements  TrafficRule ,Xworkz{


	@Override
	public boolean wearHelmet() {
		
		return true;
	}

	@Override
	public boolean tripleRiding() {

		return false;
	}

	@Override
	public String interview() {
		
		return "acuvate";
	}

	@Override
	public String training() {
		
		return "java";
	}

	@Override
	public double placements() {
		
		return 100;
	}

}
