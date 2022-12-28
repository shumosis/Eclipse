package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dtos.AirportDTO;
import com.xworkz.collections.dtos.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDTO placeDTO= new PlaceDTO("nandi hills", "mumbai", 40);
	
		PlaceDTO placeDTO1= new PlaceDTO("coorg", "mumbai", 40);
		
boolean equals= placeDTO1.equals( placeDTO) ;
		
		System.out.println(equals);
		
		Collection<	PlaceDTO > place = new ArrayList<	PlaceDTO >();
		
		place.add(placeDTO);
		place.add(placeDTO1);
		
		boolean contains = place.contains(placeDTO);
		System.out.println("contains :"+ true);
				
	}

}
