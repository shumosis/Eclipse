package com.xworkz.associations.things;

public class Temple {
	
	public String name;
	public God god;
	public String mainPriest;
	public int noOfVisitors;
	public double collectionPerDay;
	
	public void showTemple(String name,God god,String mainPriest,int noOfVisitors,double collectionPerDay) 
	{
		this.name=name;
		this.god=god;
		this.mainPriest=mainPriest;
		this.noOfVisitors=noOfVisitors;
		this.collectionPerDay=collectionPerDay;
		
		System.out.println(name);
		
		System.out.println(mainPriest);
		System.out.println(noOfVisitors);
		System.out.println(collectionPerDay);
		
		
		
		
	}

}
