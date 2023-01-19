package com.xworkz.SpringLom.repository;

import org.springframework.stereotype.Component;

import com.xworkz.SpringLom.DTO.ResortDto;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean saveMadaliBro(ResortDto dto) {
		System.out.println("resort is open to save");
		return true;
	}

}
