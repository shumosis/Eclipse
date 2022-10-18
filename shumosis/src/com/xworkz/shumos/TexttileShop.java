package com.xworkz.shumos;

public class TexttileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	
	public TexttileShop()
	{
		super();
	}
	
	public TexttileShop(String ownerName)
	{
		this();
		this.ownerName=ownerName;
	}
	public TexttileShop( String ownerWifeName,long ownerDaughterNumber)
	{
		this("vaibhav");
		this.ownerDaughterNumber=ownerDaughterNumber;
		this.ownerWifeName=ownerWifeName;
	}
	public TexttileShop( String ownerWifeName,long ownerDaughterNumber, String ownerDaughterName)
	{
		this(ownerWifeName,8767938302L);
		this.ownerDaughterName=ownerDaughterName;
	}
	public TexttileShop(String ownerDaughterName,int ownerNoOfWifes)
	{
		this("shrushti",8767938302L,ownerDaughterName);
		this.ownerNoOfWifes=ownerNoOfWifes;
	}
	public TexttileShop(int ownerNoOfWifes,int shopNo )
	{
		this("kavya",3);
		this.shopNo=shopNo;
	}
	public TexttileShop(int ownerNoOfWifes,int shopNo ,long contactNo)
	{
		this(3,4563);
		this.contactNo=contactNo;
	}
	
	public TexttileShop(int shopNo ,long contactNo )
	{
		this(3,shopNo,8767938302L);
		this.contactNo=contactNo;
	}
	
}


