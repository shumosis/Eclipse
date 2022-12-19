package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.PlaceDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;

public interface PlaceService {
	
	
	boolean validateAndSave(PlaceDto place) throws somethingIsNotGoodException;
	
	
	
		

}
