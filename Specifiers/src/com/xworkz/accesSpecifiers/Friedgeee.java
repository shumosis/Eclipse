package com.xworkz.accesSpecifiers;

public class Friedgeee {
	
	public  Friedge friedge  ;

	public void useMachine(Friedge  friedge ) 
	{
		System.out.println(friedge .brand);
		System.out.println(friedge .color);
		System.out.println(friedge .good);
		System.out.println(friedge .height);
		
		System.out.println(friedge .price);
		System.out.println(friedge .serviceOfCompany);
		System.out.println(friedge .SizeInLiter);
		System.out.println(friedge .use);
		System.out.println(friedge .weight);

		
		
		friedge .getOwner();
		System.out.println(friedge .getOwner());
		friedge .setOwner("Shumosis");
		System.out.println("after changing  :  " +friedge .getOwner());

}
	
	
}
