package com.xworkz.collections.dtos;

import java.util.Objects;

public class PlaceDTO {
	
	private String name;
	private String citynear;
	private int ticket;
	
	public PlaceDTO() {
	}

	public PlaceDTO(String name, String citynear, int ticket) {
		this.name = name;
		this.citynear = citynear;
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", citynear=" + citynear + ", ticket=" + ticket + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the citynear
	 */
	public String getCitynear() {
		return citynear;
	}

	/**
	 * @param citynear the citynear to set
	 */
	public void setCitynear(String citynear) {
		this.citynear = citynear;
	}

	/**
	 * @return the ticket
	 */
	public int getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			
		if (obj instanceof PlaceDTO) {
	        PlaceDTO other = (PlaceDTO) obj;
	        if(other.name.equals(name)) {
	        	return true;
	        }
		
	}}
		return false;}

}
