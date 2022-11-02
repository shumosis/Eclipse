package com.xworkz.accesSpecifiers;

public class EngClg 
{
	private String name = "bgmit";
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
	int noOfBranches;
	
	public EngClg(String town, String priciple, String cahirman, String district, double area, double startYear,
			double noOfStudents, double fees, boolean goodTeachers, boolean goodClg, int noOfBranches) {
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
		this.noOfBranches = noOfBranches;
	}
	public String getName() {
		return this.name =name;
	}
    void setName(String name) {
		this.name=name;
	}

}
