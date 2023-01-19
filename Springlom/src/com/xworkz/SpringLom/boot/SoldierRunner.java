package com.xworkz.SpringLom.boot;

import com.xworkz.SpringLom.DTO.SolderDto;
import com.xworkz.SpringLom.repository.SolderRepo;
import com.xworkz.SpringLom.repository.SolderRepoImpl;
import com.xworkz.SpringLom.services.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SolderDto dto = new SolderDto("shumosis",23355,"india","first","mareatha",true);
	    SolderRepo repository = new SolderRepoImpl();
		SoldierServiceImpl services = new SoldierServiceImpl();
		services.setRepo(repository);
		services.validateAndSave(dto);

	}
}
