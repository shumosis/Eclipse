package com.xworkz.collections.dtos;

public class AirportDTO {
	
  private	String name ;
  private String city;
  private String type;
  
  
  public AirportDTO() {
	  System.out.println("running deafault");
  }


public AirportDTO(String name, String city, String type) {
	this.name = name;
	this.city = city;
	this.type = type;
}


@Override
public String toString() {
	return "AirportDTO [name=" + name + ", city=" + city + ", type=" + type + "]";
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}





@Override
public boolean equals(Object obj) {
	if(obj != null) {
		if(obj instanceof AirportDTO) {
			 AirportDTO dto = ( AirportDTO)obj;
			 if(dto.name.equals(this.name)) {
				 return true;
			 }
		}
	}
	return false;
	
}
  
  
	

}
