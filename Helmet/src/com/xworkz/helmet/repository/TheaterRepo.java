package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.Theaterdto;

public interface TheaterRepo {
	
	boolean store(Theaterdto dto) throws RuntimeException;

}
