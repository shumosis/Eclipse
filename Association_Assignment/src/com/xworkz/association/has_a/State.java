package com.xworkz.association.has_a;

public class State {
	
	public String name;
	public String cm;
	public String party;
	public int noOfDistricts;
	
	public State(String name, String cm, String party, int noOfDistricts) {
		super();
		this.name = name;
		this.cm = cm;
		this.party = party;
		this.noOfDistricts = noOfDistricts;
	} 
	public void showOfStates() 
	{
		System.out.println(name);
		System.out.println(cm);
		System.out.println(party);
		System.out.println(noOfDistricts);
	}
	

}
