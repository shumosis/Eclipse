package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.BuildingDto;
import com.xworkz.helmet.exception.IcantEatMoreException;

public class BuildingRepoImpl implements BuildingRepo {
	
	BuildingDto[] dingDto = new BuildingDto[5];
	int index =0;

	@Override
	public boolean store(BuildingDto dto) {
		if(this.index>=this.dingDto.length) {
			System.err.println("i will not eat more");
			throw new IcantEatMoreException("dk basss");
			}else {
				this.dingDto[this.index] =dto;
				System.out.println("dto is saved  "+dto+"at index  "+index  );
				index++;
			}
			
	
		
		
		return true;
	}

}
