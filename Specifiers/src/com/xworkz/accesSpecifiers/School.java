package com.xworkz.accesSpecifiers;

public class School {
	private String name = "Rb Vidyalaya";
	String town ;
	String priciple;
	String cahirman;
	String district;
	double area;
	double startYear;
	double noOfStudents;
	double fees;
	boolean goodTeachers;
	boolean goodClg;
    boolean ground;
	
	public School(String town, String priciple, String cahirman, String district, double area, double startYear,
			double noOfStudents, double fees, boolean goodTeachers, boolean goodClg,boolean ground) {
		super();
		this.town = town;
		this.priciple = priciple;
		this.cahirman = cahirman;
		this.district = district;
		this.area = area;
		this.startYear = startYear;
		this.noOfStudents = noOfStudents;
		this.fees = fees;
		this.goodTeachers = goodTeachers;
		this.goodClg = goodClg;
		this.ground= ground;
	}
	public String getName() {
		return this.name =name;
	}
    void setName(String name) {
		this.name=name;
	}
}
