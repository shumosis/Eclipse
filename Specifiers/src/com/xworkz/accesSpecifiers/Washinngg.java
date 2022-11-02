package com.xworkz.accesSpecifiers;

public class Washinngg 
{
	public  WashingMachine   washingMachine ;

	public void useMachine( WashingMachine  washingMachine ) 
	{
		System.out.println(washingMachine.brand);
		System.out.println(washingMachine.color);
		System.out.println(washingMachine.good);
		System.out.println(washingMachine.height);
		
		System.out.println(washingMachine.price);
		System.out.println(washingMachine.serviceOfCompany);
		System.out.println(washingMachine.SizeInLiter);
		System.out.println(washingMachine.use);
		System.out.println(washingMachine.weight);

		
		
		washingMachine.getOwner();
		System.out.println(washingMachine.getOwner());
		washingMachine.setOwner("shumosis");
		System.out.println("after changing  :  " +washingMachine.getOwner());
	}


}
