package com.xworkz.helmet.dto;

import java.time.LocalTime;

public class BuildingDto extends AbstractAuditDto {
	
	private int no;
	private String name;
	private int floors ;
	private boolean lift;
	private boolean Parking ;
	private String type;
	
	public BuildingDto() {
	}

	public BuildingDto(int no, String name, int floors, boolean lift, boolean parking, String type,String createdby, LocalTime localTime) {
		super( createdby,  localTime);
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		Parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDto [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", Parking="
				+ Parking + ", type=" + type + ", getCreatedby()=" + getCreatedby() + ", getCreatedDateTime()="
				+ getCreatedDateTime() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return Parking;
	}

	public void setParking(boolean parking) {
		Parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
