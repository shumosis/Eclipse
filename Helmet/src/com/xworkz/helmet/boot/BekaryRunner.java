package com.xworkz.helmet.boot;

import java.time.LocalTime;

import com.xworkz.helmet.dto.BekaryDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BekaryRepo;
import com.xworkz.helmet.repository.BekaryRepoImpl;
import com.xworkz.helmet.service.BekaryService;
import com.xworkz.helmet.service.BekaryServiceImpl;

public class BekaryRunner {

	public static void main(String[] args) {
	
		BekaryDto bekaryDt = new BekaryDto("kanti","manu","inMind",8767938302d,"sweetWords","shumosis",LocalTime.now());
		
		BekaryRepo bekaryRepo = new BekaryRepoImpl();
		
		BekaryService bekaryService = new BekaryServiceImpl(bekaryRepo);
		
		try {
			bekaryService.validateAndSave(bekaryDt);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
