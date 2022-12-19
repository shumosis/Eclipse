package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.BuildingDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BuildingRepo;

public interface BuildingService  {
	
	
	boolean validateAndSave(BuildingDto dto) throws somethingIsNotGoodException;
	

}
