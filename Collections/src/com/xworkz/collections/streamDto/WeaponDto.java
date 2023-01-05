package com.xworkz.collections.streamDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class WeaponDto implements Serializable ,Comparable<WeaponDto> {
	
	private String name;
	
	private String madeBy;
	
	private LocalDate madeOn;
	
	private double price;
	
	private Type type;

	

	public WeaponDto() {
	}

	public WeaponDto(String name, String madeBy, LocalDate madeOn, double price, Type type) {
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
	 if(obj!=null) {
		 if(obj instanceof WeaponDto) {
			  
			 WeaponDto dto = (WeaponDto)obj;
			 if(dto.name.equals(this.name)) {
				 return true;
			 }
		 }
	 }
		return false;
	}
	@Override
	public int compareTo(WeaponDto obj) {
		
		return obj.name.compareTo(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	

}
