package com.xworkz.associations.things;

public class Brand {
	
	public String name;
	public double gstNo;
	public Location location;
	public int rating;
	
	public void shumos(String name, double gstNo, Location location, int rating) {

		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;
		
	}
	public void showmebrand() {
		System.out.println(name);
		System.out.println(gstNo);
	
		System.out.println(rating);
	}
	

}
