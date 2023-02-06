package com.xworkz.shumos.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MobileDto {
	
	private String name;
    private String ownerName;
    private String companyName;
    private double price;
    private double ram;
    
    
}
