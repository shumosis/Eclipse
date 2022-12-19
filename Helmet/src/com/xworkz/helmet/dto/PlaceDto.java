package com.xworkz.helmet.dto;

public class PlaceDto extends AbstractAuditDto {
	
	private String name ;
	private String location ;
	private String famousFor;
	private boolean good;
	
	public PlaceDto() {
	}

	public PlaceDto(String name, String location, String famousFor, boolean good) {
		this.name = name;
		this.location = location;
		this.famousFor = famousFor;
		this.good = good;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", location=" + location + ", famousFor=" + famousFor + ", good=" + good
				+ "]";
	}
    
}
