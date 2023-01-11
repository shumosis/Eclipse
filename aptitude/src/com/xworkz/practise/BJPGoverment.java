package com.xworkz.practise;

public class BJPGoverment extends Goverment {
	
	String mla ;
	int duration;

	public BJPGoverment(String mla,int duration,String city, int height, int weight, boolean good) {
		super(city, height, weight, good);
		
		
	}
	public void getname() {
		System.out.println(super.city);
		super.city="shubham";
	}
	
	

}