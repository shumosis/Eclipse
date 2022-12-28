package com.xworkz.collections.dtos;

import java.util.Objects;

public class HolidayDTO {
	
	private String why;
	private int days;
	private int date;
	
	public HolidayDTO() {
	}

	public HolidayDTO(String why, int days, int date) {
		this.why = why;
		this.days = days;
		this.date = date;
	}

	@Override
	public String toString() {
		return "HolidayDTO [why=" + why + ", days=" + days + ", date=" + date + "]";
	}

	/**
	 * @return the why
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * @param why the why to set
	 */
	public void setWhy(String why) {
		this.why = why;
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

	

	@Override
	public boolean equals(Object obj) {
		if ( obj != null) {
			
		
		if (obj instanceof HolidayDTO) {
	    HolidayDTO other = (HolidayDTO) obj;
		if(other.why.equals(obj)) {
			return true;
		}
	}
		
		}
		return false;
		}
	
	
	
	
	

}
