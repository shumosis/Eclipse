package com.xworkz.equals.things;

public class Institution {

	
	private String name;
	private String location;
	private String society;
	private String owner;
	private String type;
	private boolean degree;
	private int establshment;
	private int studentsNo;
	private int fees;
	private String  educationType;
	
	public Institution(String name, String location, String society, String owner, String type, boolean degree,
			int establshment, int studentsNo, int fees, String educationType) {
		super();
		this.name = name;
		this.location = location;
		this.society = society;
		this.owner = owner;
		this.type = type;
		this.degree = degree;
		this.establshment = establshment;
		this.studentsNo = studentsNo;
		this.fees = fees;
		this.educationType = educationType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDegree() {
		return degree;
	}

	public void setDegree(boolean degree) {
		this.degree = degree;
	}

	public int getEstablshment() {
		return establshment;
	}

	public void setEstablshment(int establshment) {
		this.establshment = establshment;
	}

	public int getStudentsNo() {
		return studentsNo;
	}

	public void setStudentsNo(int studentsNo) {
		this.studentsNo = studentsNo;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", location=" + location + ", society=" + society + ", owner=" + owner
				+ ", type=" + type + ", degree=" + degree + ", establshment=" + establshment + ", studentsNo="
				+ studentsNo + ", fees=" + fees + ", educationType=" + educationType + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof Institution) 
		{
			System.out.println("checking insatnce");
			Institution institution =(Institution)obj;
			if(this.name.equals( institution .name) && this.location.equals( institution.location) && this.owner.equals( institution.owner) &&
					this.society.equals( institution.society)  && this.educationType.equals( institution.educationType ) ){
				System.out.println("Institution is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not Institution");
				
			}
			
		}
		return false;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
