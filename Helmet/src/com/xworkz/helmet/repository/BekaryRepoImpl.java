package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.BekaryDto;
import com.xworkz.helmet.exception.IcantEatMoreException;

public class BekaryRepoImpl implements BekaryRepo {
	
	BekaryDto[] bekaryDtos = new BekaryDto[5];
	
	int index = 0;



	@Override
	public boolean Save(BekaryDto dto) {
		if(this.index>=this.bekaryDtos.length) {
			System.out.println("bahut ho raha hai");
			throw new IcantEatMoreException("dk nind bhal aat");
		}else {
			this.bekaryDtos[index] = dto;
			System.out.println("data is saved"+dto+"At index  " +index);
			index++;
		}
		
		return true;
	}
	}
