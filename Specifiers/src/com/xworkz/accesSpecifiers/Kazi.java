package com.xworkz.accesSpecifiers;

public class Kazi {
	
	

	public Nadeem  nadeem ;

	public void useAkshay(Nadeem  nadeem ) 
	{
		System.out.println(nadeem .birthYear);
		System.out.println(nadeem .clg);
		System.out.println(nadeem .drink);
		System.out.println(nadeem .friend);
		System.out.println(nadeem .gf);
		System.out.println(nadeem .goodBoy);
		System.out.println(nadeem .height);
		System.out.println(nadeem .weight);
		System.out.println(nadeem .shirtSize);
		System.out.println(nadeem .smoke);
		nadeem .getTown();
		System.out.println(nadeem .getTown());
		nadeem .setTown("mudhol");
		System.out.println("after changing  :  " +nadeem .getTown());
	}


}
