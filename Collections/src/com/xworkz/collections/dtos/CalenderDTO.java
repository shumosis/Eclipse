package com.xworkz.collections.dtos;

import java.util.Objects;

public class CalenderDTO {
	
	private String name;
	private int year;
	private int price;
	
	public CalenderDTO() {
	}

	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", year=" + year + ", price=" + price + "]";
	}

	public CalenderDTO(String name, int year, int price) {
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
		
		if (obj instanceof CalenderDTO) {
			CalenderDTO dto = (CalenderDTO) obj;
			if(dto.name.equals(this.name)) {
				return true;
			}
				
			}
	
	}
		return false;
		
	}}


