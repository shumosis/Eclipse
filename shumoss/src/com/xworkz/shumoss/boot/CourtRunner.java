package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pc.*;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court1 = new DistrictCourt();
		DistrictCourt  districtCourt = ( DistrictCourt) court1;
		System.out.println(districtCourt.judtice);
		System.out.println(districtCourt.types);
		System.out.println(districtCourt.cases);
		System.out.println(districtCourt.place);
		
		
		Court court2 = new StateCourt();
		StateCourt  StateCourt = ( StateCourt)court2;
		System.out.println(StateCourt.cases);
		System.out.println(StateCourt.place);
		
		Court court3 = new SupremeCourt();
		SupremeCourt SupremeCourt=(SupremeCourt) court3;  
		System.out.println(SupremeCourt.cases);
		System.out.println(SupremeCourt.place);

	}

}
