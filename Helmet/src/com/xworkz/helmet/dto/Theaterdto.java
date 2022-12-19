package com.xworkz.helmet.dto;

public class Theaterdto extends AbstractAuditDto  {
	
	private String name;
	private String id;
	private String brand;
	private int Seats;
	
	public  Theaterdto() {
		System.out.println("running daefault constructor");
	}

	public Theaterdto(String name, String id, String brand, int seats) {
		this.name = name;
		this.id = id;
		this.brand = brand;
		Seats = seats;
	}

	@Override
	public String toString() {
		return "Theaterdto [name=" + name + ", id=" + id + ", brand=" + brand + ", Seats=" + Seats + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int seats) {
		Seats = seats;
	}
	
	

}
