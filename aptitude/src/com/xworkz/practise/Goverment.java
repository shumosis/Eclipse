package com.xworkz.practise;

public class Goverment {
	
    String name;
	String city;
    int height;
    int weight;
    boolean good;
    
    public Goverment() {
	this("shubham");	
	}
   
    public Goverment(String name) {
    	this("shubham","mudhol",5,60,true);
		this.name = name;
	}

	public Goverment(String name,String city, int height, int weight, boolean good) {
	   
		this.city = city;
		this.height = height;
		this.weight = weight;
		this.good = good;
	}

	
    
    
	

}
