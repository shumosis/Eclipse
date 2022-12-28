package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dtos.AirportDTO;
import com.xworkz.collections.dtos.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {
		
		CalenderDTO calenderDTO = new CalenderDTO("shu",1997,30);
		
		CalenderDTO calenderDTO1 = new CalenderDTO("shumosis",1927,30);
		
boolean equals= calenderDTO .equals(calenderDTO1) ;
		
		System.out.println(equals);
		
		Collection<CalenderDTO > calender = new ArrayList<CalenderDTO >();
		
		calender.add(calenderDTO1 );
		calender.add(calenderDTO );
		
		boolean contains = calender.contains(calenderDTO1 );
		System.out.println("contains :"+ true);
				

	}

}
