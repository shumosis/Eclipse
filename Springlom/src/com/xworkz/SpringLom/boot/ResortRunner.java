package com.xworkz.SpringLom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringLom.DTO.FirstAidDto;
import com.xworkz.SpringLom.DTO.MissileDto;
import com.xworkz.SpringLom.DTO.ResortDto;
import com.xworkz.SpringLom.configuration.SpringConfiguration;
import com.xworkz.SpringLom.services.FirstAidServiceImpl;
import com.xworkz.SpringLom.services.MissileService;
import com.xworkz.SpringLom.services.ResortService;
import com.xworkz.SpringLom.services.ResortServiceImpl;

public class ResortRunner {
	public static void main(String[] args) {
		
		ApplicationContext kadhai =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	ResortServiceImpl naunBhareHyasarke	=kadhai.getBean(ResortServiceImpl.class);
	
	naunBhareHyasarke.validateAndSaveNaMadteni(new ResortDto());
	
	FirstAidServiceImpl naunBhareHyasarke1	=kadhai.getBean(FirstAidServiceImpl.class);
	naunBhareHyasarke1.validateAndSaveNaMadteni(new FirstAidDto());
	
	MissileService naunBhareHyasarke2	=kadhai.getBean(MissileService.class);
	
	naunBhareHyasarke2.validateAndSaveNaMadteni(new MissileDto());
	}
	
	

}
