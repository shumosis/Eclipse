package com.xworkz.associations.things;
public class Piller {
	
	public String id;
	public String place;
	public int height;
	public Shape shape =Shape.CYLINDRICAL;
	public boolean supported;
	public Company company;
	
	public Piller(String id,String place,int height,boolean supported,Company company) {
		
		this.id=id;
		this.place=place;
		this.height=height;
		this.supported=supported;
		this.company=company;
	}
	public void showme() {
		System.out.println(id);
		System.out.println(place);
		System.out.println(height);
		System.out.println(supported);
		System.out.println(shape);
	
	}
	
	
}
