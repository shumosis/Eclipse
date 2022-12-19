package com.xworkz.helmet.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RailwayStationDto extends AbstractAuditDto{
	
	private String name;
	private int noOfPlatforms;
	private int platformsTicket;
	private String area;
	
	
	public RailwayStationDto() {
	}


	public RailwayStationDto(String name, int noOfPlatforms, int platformsTicket, String area,String  createdby,LocalTime localTime) {
		super( createdby,localTime);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.platformsTicket = platformsTicket;
		this.area = area;
	}


	@Override
	public String toString() {
		return "RailwayStationDto [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", platformsTicket="
				+ platformsTicket + ", area=" + area + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}


	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}


	public int getPlatformsTicket() {
		return platformsTicket;
	}


	public void setPlatformsTicket(int platformsTicket) {
		this.platformsTicket = platformsTicket;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	
	
	

}
