package com.xworkz.helmet.boot;

import java.time.LocalTime;

import com.xworkz.helmet.dto.RailwayStationDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.RailwayStationRepo;
import com.xworkz.helmet.repository.RailwayStationRepoImpl;
import com.xworkz.helmet.service.RailwayStationService;
import com.xworkz.helmet.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {
		RailwayStationDto railwayStationDto =new RailwayStationDto("yashwantpur",23, 20,"yashwantpur","shumosis",LocalTime.now());
		
		RailwayStationRepo railwayStationRepo = new RailwayStationRepoImpl();
		
		RailwayStationService railwayStationService = new RailwayStationServiceImpl(railwayStationRepo);
		
		try {
			railwayStationService.validateAndSave(railwayStationDto);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
		}
	}

}
