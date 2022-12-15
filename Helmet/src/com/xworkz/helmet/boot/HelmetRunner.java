package com.xworkz.helmet.boot;

import java.awt.Color;

import com.xworkz.helmet.constant.HemetType;
import com.xworkz.helmet.dto.HelmetDto;
import com.xworkz.helmet.repository.HelmetRepo;
import com.xworkz.helmet.repository.HelmetRepoImpl;
import com.xworkz.helmet.service.HelmetService;
import com.xworkz.helmet.service.HelmetserviceImpl;

public class HelmetRunner {
	
	public static void main(String[] args) {
		
		HelmetDto dto = new HelmetDto("vega",HemetType.GENTS,new Double (500),com.xworkz.helmet.constant.Color.COLORLESS);
		
		
		HelmetRepo  helmetRepo = new HelmetRepoImpl();
		
		
		HelmetService helmetService= new  HelmetserviceImpl(helmetRepo);
		
		boolean success = helmetService.validateAndSave(dto);
		
		System.out.println("succes" + success);
	}

}
