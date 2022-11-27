package com.xworkz.equals.things;

public class Vehicle {
	
	private String name;
	private String brand;
	private String owner;
	private String color;
	private int price;
	private double weight;
	private String passinng;
	private String showroom_name;
	private String length;
	private boolean good;
	
	public Vehicle(String name, String brand, String owner, String color, int price, double weight, String passinng,
			String showroom_name, String length, boolean good) {
		super();
		this.name = name;
		this.brand = brand;
		this.owner = owner;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.passinng = passinng;
		this.showroom_name = showroom_name;
		this.length = length;
		this.good = good;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPassinng() {
		return passinng;
	}

	public void setPassinng(String passinng) {
		this.passinng = passinng;
	}

	public String getShowroom_name() {
		return showroom_name;
	}

	public void setShowroom_name(String showroom_name) {
		this.showroom_name = showroom_name;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", owner=" + owner + ", color=" + color + ", price="
				+ price + ", weight=" + weight + ", passinng=" + passinng + ", showroom_name=" + showroom_name
				+ ", length=" + length + ", good=" + good + "]";
	} 
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof Vehicle) 
		{
			System.out.println("checking insatnce");
			Vehicle vehicle =(Vehicle)obj;
			if(this.name.equals(vehicle.name) && this.brand.equals(vehicle.brand)) {
				System.out.println("vehicle is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not vehicle");
				
			}
			
		}
		return false;
	
	}

}
