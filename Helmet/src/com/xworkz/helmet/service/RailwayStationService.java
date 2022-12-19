package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.RailwayStationDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.RailwayStationRepo;

public interface RailwayStationService {
	
    
	
	boolean validateAndSave(RailwayStationDto staionDto) throws somethingIsNotGoodException;

}
