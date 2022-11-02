package com.xworkz.accesSpecifiers;

public class Ovennn {
	
	public Oven oven ;

	public void useMachine( Oven oven ) 
	{
		System.out.println( oven.brand);
		System.out.println( oven.color);
		System.out.println( oven.good);
		System.out.println( oven.height);
		
		System.out.println( oven.price);
		System.out.println( oven.serviceOfCompany);
		System.out.println( oven.SizeInLiter);
		System.out.println( oven.use);
		System.out.println( oven.weight);

		
		
		 oven.getOwner();
		System.out.println( oven.getOwner());
		 oven.setOwner("mudhol");
		System.out.println("after changing  :  " + oven.getOwner());

}
}
