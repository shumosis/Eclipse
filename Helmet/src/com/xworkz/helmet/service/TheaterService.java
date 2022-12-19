package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.Theaterdto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;

public interface TheaterService {
	
	
	boolean validateAndSave(Theaterdto dto) throws somethingIsNotGoodException;

}
