package com.xworkz.shumos.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatsDto {
	
	private String name;
	private String fromState;
	private String cook;
	private String hotel;
	private String area;
	private String mainIngredient;
	private String typeOfChutney;
	private int price;
	private boolean taste;
	private boolean worthy ;
	private int ratings ;
	private boolean wantAgain ;
	

}
