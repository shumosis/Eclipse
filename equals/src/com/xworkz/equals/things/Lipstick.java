package com.xworkz.equals.things;

public class Lipstick {
	
	private String name;
	private String brand;
	private String color;
	private String store;
	private String user;
	private String brandAmbassader;
	private boolean quality;
	private int weight;
	private int price;
	private int expiry;
	
	public Lipstick(String name, String brand, String color, String store, String user, String brandAmbassader,
			boolean quality, int weight, int price, int expiry) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.store = store;
		this.user = user;
		this.brandAmbassader = brandAmbassader;
		this.quality = quality;
		this.weight = weight;
		this.price = price;
		this.expiry = expiry;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBrandAmbassader() {
		return brandAmbassader;
	}

	public void setBrandAmbassader(String brandAmbassader) {
		this.brandAmbassader = brandAmbassader;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getExpiry() {
		return expiry;
	}

	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", brand=" + brand + ", color=" + color + ", store=" + store + ", user="
				+ user + ", brandAmbassader=" + brandAmbassader + ", quality=" + quality + ", weight=" + weight
				+ ", price=" + price + ", expiry=" + expiry + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof  Lipstick ) 
		{
			System.out.println("checking insatnce");
			 Lipstick  lipstick =( Lipstick)obj;
			if(this.color.equals( lipstick.color) && this.brand.equals(lipstick.brand) && this.brandAmbassader.equals(lipstick.brandAmbassader) 
					&& this.name.equals(lipstick.name) && this.store.equals(lipstick.store) && this.user.equals(lipstick.user)) {
				System.out.println("lipstick is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not lipstick");
				
			}
			
		}
		return false;
	
	}
	

}
