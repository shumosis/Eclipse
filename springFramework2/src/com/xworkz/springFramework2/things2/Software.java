package com.xworkz.springFramework2.things2;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("nameOfSoftware")
	private String name;
	@Autowired
	@Qualifier("version")
	private int version;
	@Autowired
	@Qualifier("free")
	private boolean free;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Override
	public String toString() {
		return "Software [developer=" + developer + ", name=" + name + ", version=" + version + ", free=" + free
				+ ", date=" + date + "]";
	}
	
	

}
