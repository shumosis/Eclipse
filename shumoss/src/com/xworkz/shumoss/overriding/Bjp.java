package com.xworkz.shumoss.overriding;

public class Bjp extends PoliticalParty {
	
	public String leader;

	public Bjp(String name, int since,String leader) {
		super(name, since);
		this.leader = leader;
		
	}
	public void showToShubham() {
		super.showToShubham();
		
		System.out.println(leader);
	}
	
}
