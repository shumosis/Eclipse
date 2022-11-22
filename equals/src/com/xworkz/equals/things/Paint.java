package com.xworkz.equals.things;

public class Paint {
	
	private String brand;
	private String color;
	private String user;
	private String name;
	private int price;
	private int liter;
	private int weight;
	private String paintFor;
	private boolean quality;
	private boolean shining;
	
	public Paint(String brand, String color, String user, String name, int price, int liter, int weight,
			String paintFor, boolean quality, boolean shining) {
		super();
		this.brand = brand;
		this.color = color;
		this.user = user;
		this.name = name;
		this.price = price;
		this.liter = liter;
		this.weight = weight;
		this.paintFor = paintFor;
		this.quality = quality;
		this.shining = shining;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPaintFor() {
		return paintFor;
	}

	public void setPaintFor(String paintFor) {
		this.paintFor = paintFor;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isShining() {
		return shining;
	}

	public void setShining(boolean shining) {
		this.shining = shining;
	}
	
	

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", color=" + color + ", user=" + user + ", name=" + name + ", price=" + price
				+ ", liter=" + liter + ", weight=" + weight + ", paintFor=" + paintFor + ", quality=" + quality
				+ ", shining=" + shining + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof Paint) 
		{
			System.out.println("checking insatnce");
			Paint paint =(Paint)obj;
			if(this.color.equals(paint.color)) {
				System.out.println("color is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not paint");
				
			}
			
		}
		return false;
	
	}
	
}
	
	
	


