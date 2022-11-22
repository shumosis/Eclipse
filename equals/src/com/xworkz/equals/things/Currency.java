package com.xworkz.equals.things;

public class Currency {
	
	private String name;
	private String color;
	private String country;
	private int lengthCm;
	private int widthCm;
	private int value;
	private String madeUpOf;
	private String owner;
	
	public Currency(String name, String color, String country, int lengthCm, int widthCm, int value, String madeUpOf,
			String owner) {
		super();
		this.name = name;
		this.color = color;
		this.country = country;
		this.lengthCm = lengthCm;
		this.widthCm = widthCm;
		this.value = value;
		this.madeUpOf = madeUpOf;
		this.owner = owner;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLengthCm() {
		return lengthCm;
	}

	public void setLengthCm(int lengthCm) {
		this.lengthCm = lengthCm;
	}

	public int getWidthCm() {
		return widthCm;
	}

	public void setWidthCm(int widthCm) {
		this.widthCm = widthCm;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMadeUpOf() {
		return madeUpOf;
	}

	public void setMadeUpOf(String madeUpOf) {
		this.madeUpOf = madeUpOf;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Currency [name=" + name + ", color=" + color + ", country=" + country + ", lengthCm=" + lengthCm
				+ ", widthCm=" + widthCm + ", value=" + value + ", madeUpOf=" + madeUpOf + ", owner=" + owner + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof  Currency ) 
		{
			System.out.println("checking insatnce");
			 Currency   currency  =( Currency )obj;
			if(this.name.equals( currency.name) && this.country.equals(currency.country) && this.color.equals( currency.color ) && this.owner.equals(currency.owner)) {
				System.out.println(" Currency  is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not  Currency ");
				
			}
			
		}
		return false;
	
	}


}
