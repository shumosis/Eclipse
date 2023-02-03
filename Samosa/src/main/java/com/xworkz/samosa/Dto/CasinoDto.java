package com.xworkz.samosa.Dto;

import lombok.Data;

@Data
public class CasinoDto {
	
	private String casinoName;
	private String cruiseName;
	private String entryFee;
	private boolean freeFood;
	private boolean freeAlcohol;
	
	public CasinoDto(){
		System.out.println("creating " + this.getClass().getSimpleName());
		
	}
	
}
