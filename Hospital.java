package com.xworkz.equals.things;

public class Hospital {
	
	private String name;
	private String location;
	private String type;
	private String owner;
	private String speciality;
	private String mainDoctor;
	private boolean good;
	private int patientsNo;
	private int fees;
	private int eshtablishment;
	
	public Hospital(String name, String location, String type, String owner, String speciality, String mainDoctor,
			boolean good, int patientsNo, int fees, int eshtablishment) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.owner = owner;
		this.speciality = speciality;
		this.mainDoctor = mainDoctor;
		this.good = good;
		this.patientsNo = patientsNo;
		this.fees = fees;
		this.eshtablishment = eshtablishment;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getMainDoctor() {
		return mainDoctor;
	}

	public void setMainDoctor(String mainDoctor) {
		this.mainDoctor = mainDoctor;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public int getPatientsNo() {
		return patientsNo;
	}

	public void setPatientsNo(int patientsNo) {
		this.patientsNo = patientsNo;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getEshtablishment() {
		return eshtablishment;
	}

	public void setEshtablishment(int eshtablishment) {
		this.eshtablishment = eshtablishment;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", type=" + type + ", owner=" + owner
				+ ", speciality=" + speciality + ", mainDoctor=" + mainDoctor + ", good=" + good + ", patientsNo="
				+ patientsNo + ", fees=" + fees + ", eshtablishment=" + eshtablishment + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof Institution) 
		{
			System.out.println("checking insatnce");
			Hospital hospital =(Hospital)obj;
			if(this.name.equals( hospital.name) && this.location.equals( hospital.location) && this.owner.equals( hospital.owner) &&
					this.mainDoctor.equals( hospital.mainDoctor)  && this.type.equals( hospital.type ) && this.speciality.equals(hospital.speciality) 
					
					){
				System.out.println("Hospital is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not Hospital");
				
			}
			
		}
		return false;
	
}
}
