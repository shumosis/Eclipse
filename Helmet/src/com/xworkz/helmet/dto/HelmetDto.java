package com.xworkz.helmet.dto;

import com.xworkz.helmet.constant.Color;
import com.xworkz.helmet.constant.HemetType;

public class HelmetDto extends  AbstractAuditDto{
	
	private String brand;
	private HemetType type;
	private Double price;
	private Color color;
	
	public  HelmetDto() {
		System.out.println("calling deafault constructor");
	}

	@Override
	public String toString() {
		return "HelmetDto [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HemetType getType() {
		return type;
	}

	public void setType(HemetType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public HelmetDto(String brand, HemetType type, Double price, Color color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}
	
	

}
