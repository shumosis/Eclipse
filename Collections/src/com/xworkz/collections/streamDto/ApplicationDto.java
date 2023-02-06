package com.xworkz.collections.streamDto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.collections.dtos.AirportDTO;

public class ApplicationDto implements Serializable ,Comparable<ApplicationDto>{
	
	private String name ;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;
	
	public ApplicationDto(String name, double version, boolean free, String developedBy, double price) {
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ApplicationDto() {
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			if(obj instanceof ApplicationDto) {
				ApplicationDto dto = (ApplicationDto)obj;
				 if(dto.name.equals(this.name) && dto.developedBy.equals(this.developedBy)) {
					 return true;
			}
		}
		
		
	}
		return false;
	}

	@Override
	public String toString() {
		return "ApplicationDto [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public int compareTo(ApplicationDto obj) {
		
		return obj.name.compareTo(this.name);
	}
	
	
	

}
