package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dtos.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		
		AirportDTO airportDTO1 =new AirportDTO("shivaji","delhi","international");
		
		AirportDTO airportDTO2 =new AirportDTO("shivaji","mumbai", "domestic");
		
		boolean equals= airportDTO1.equals(airportDTO2) ;
		
		System.out.println(equals);
		
		Collection<AirportDTO> airport = new ArrayList<AirportDTO>();
		
		airport.add(airportDTO1);
		airport.add(airportDTO2);
		
		boolean contains = airport.contains(airportDTO2);
		System.out.println("contains :"+ true);
				

	}

}
