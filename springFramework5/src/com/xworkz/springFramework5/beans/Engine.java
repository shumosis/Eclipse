package com.xworkz.springFramework5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Engine {
private String name;
private String type;
private String company;
@Autowired
@Qualifier("engineVersion")
private int version;
private int strokes;
@Autowired
@Qualifier("engineNumber")
private int number;
@Autowired
public Engine(@Qualifier("engineName")String name,@Qualifier("enginetypr") String type,@Qualifier("engineCompany") String company) {
	super();
	this.name = name;
	this.type = type;
	this.company = company;
}

public int getStrokes() {
	return strokes;
}
@Autowired
@Qualifier("engineStrokes")
public void setStrokes(int strokes) {
	this.strokes = strokes;
}

@Override
public String toString() {
	return "Engine [name=" + name + ", type=" + type + ", company=" + company + ", version=" + version + ", strokes="
			+ strokes + ", number=" + number + "]";
}






}
