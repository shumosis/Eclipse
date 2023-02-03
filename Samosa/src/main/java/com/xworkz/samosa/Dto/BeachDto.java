package com.xworkz.samosa.Dto;

import lombok.Data;

@Data
public class BeachDto {
	
	private String beachName;
	private String location;
	private boolean clean;
	private String games;
	
	public BeachDto(){
		System.out.println("creating " + this.getClass().getSimpleName());
}
	
}
