package com.xworkz.shumoss.overriding;

public class PoliticalParty {

	public String name;
	public int since;
	
	
	public PoliticalParty(String name, int since) {
		super();
		this.name = name;
		this.since = since;
	}
	public void showToShubham() {
		
		System.out.println(name);
		System.out.println(since);
	}
}
