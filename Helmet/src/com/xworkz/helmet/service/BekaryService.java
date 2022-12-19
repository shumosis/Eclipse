package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.BekaryDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BekaryRepo;

public interface BekaryService {
	

	boolean validateAndSave(BekaryDto dto) throws somethingIsNotGoodException;

}
