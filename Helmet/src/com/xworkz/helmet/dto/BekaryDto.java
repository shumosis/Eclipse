package com.xworkz.helmet.dto;

import java.time.LocalTime;

public class BekaryDto extends AbstractAuditDto {
	
	private String name;
	private String owner;
	private String location;
	private double contact;
	private String famousFor;
	
	public BekaryDto() {
	}

	@Override
	public String toString() {
		return "BekaryDto [name=" + name + ", owner=" + owner + ", location=" + location + ", contact=" + contact
				+ ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public BekaryDto(String name, String owner, String location, double contact, String famousFor,String createdby, LocalTime localTime) {
		super( createdby,  localTime);
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.contact = contact;
		this.famousFor = famousFor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	
	

}
