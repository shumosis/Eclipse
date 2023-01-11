package com.xworkz.springFramework2.things2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("id")
	private String id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private String gstNo;
	@Autowired
	@Qualifier("location")
	private String location;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", location=" + location
				+ ", ownerName=" + ownerName + "]";
	}
	
	

}
