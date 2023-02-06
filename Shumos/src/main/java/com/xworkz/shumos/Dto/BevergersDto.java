package com.xworkz.shumos.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BevergersDto {
	
	private String name;
	private String company;
	private String flavour;
	private String shop;
	private int price;
	private int quantity;
	private boolean good;
	private boolean useful;

}
