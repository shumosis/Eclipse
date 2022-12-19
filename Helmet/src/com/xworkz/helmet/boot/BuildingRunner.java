package com.xworkz.helmet.boot;

import java.time.LocalTime;

import com.xworkz.helmet.dto.BuildingDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BuildingRepo;
import com.xworkz.helmet.repository.BuildingRepoImpl;
import com.xworkz.helmet.service.BuildingService;
import com.xworkz.helmet.service.BuildingServiceIImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		
		BuildingDto buildingDto = new BuildingDto(546,"soksha",5, true, true,"residential","shumosis",LocalTime.now());
		
		BuildingRepo buildingRepo = new BuildingRepoImpl();
		
		BuildingService buildingService = new BuildingServiceIImpl(buildingRepo);
		
		try {
			buildingService.validateAndSave(buildingDto);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
		}

	}

}
