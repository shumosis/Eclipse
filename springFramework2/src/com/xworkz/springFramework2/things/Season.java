package com.xworkz.springFramework2.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private int duration;
	private String startingMonth;
	private String[] seasons;
	
	
	public String[] getSeasons() {
		return seasons;
	}
	@Value("rainy ,monsoon ,summer")
	public void setSeasons(String[] seasons) {
		this.seasons = seasons;
	}
	public String getName() {
		return name;
	}
	public int getDuration() {
		return duration;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
	@Value("rainy")
	public void setName(String name) {
		this.name = name;
	}
	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Value("january")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
