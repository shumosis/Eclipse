package com.xworkz.accesSpecifiers;

public class GasStoveeee {
	
	public  GasStove   gasStove  ;

	public void useMachine(  GasStove   gasStove  ) 
	{
		System.out.println( gasStove .brand);
		System.out.println( gasStove .color);
		System.out.println( gasStove .good);
		System.out.println( gasStove .height);
		
		System.out.println( gasStove .price);
		System.out.println( gasStove .serviceOfCompany);
		System.out.println( gasStove .SizeInLiter);
		System.out.println( gasStove .use);
		System.out.println( gasStove .weight);

		
		
		gasStove .getOwner();
		System.out.println( gasStove .getOwner());
		gasStove .setOwner("shumosis");
		System.out.println("after changing  :  " + gasStove .getOwner());


}
}