package com.xworkz.equals.things;

public class WaterBottle {

	private String name;
	private String color;
	private String brand;
	private String owner;
	private String usedfor;
	private String shape;
	private int liter;
	private int price;
	private String use;
	private String storeName;
	
	public WaterBottle(String name, String color, String brand, String owner, String usedfor, String shape, int liter,
			int price, String use, String storeName) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.owner = owner;
		this.usedfor = usedfor;
		this.shape = shape;
		this.liter = liter;
		this.price = price;
		this.use = use;
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "WaterBottle [name=" + name + ", color=" + color + ", brand=" + brand + ", owner=" + owner + ", usedfor="
				+ usedfor + ", shape=" + shape + ", liter=" + liter + ", price=" + price + ", use=" + use
				+ ", storeName=" + storeName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getUsedfor() {
		return usedfor;
	}

	public void setUsedfor(String usedfor) {
		this.usedfor = usedfor;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof WaterBottle) 
		{
			System.out.println("checking insatnce");
			WaterBottle WaterBottle =(WaterBottle)obj;
			if(this.name.equals(WaterBottle.name) && this.brand.equals(brand) && this.color.equals(WaterBottle.color)) {
				System.out.println("WaterBottle is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not WaterBottle");
				
			}
			
		}
		return false;
	
	}

	
}
