package com.xworkz.accesSpecifiers;

public class Mamaof {
	
	String mamaof="shumosis";
	
	public Mama mama;

	public void takeingFromMama(Mama mama) 
	{
		System.out.println(mama.birthYear);
		System.out.println(mama.childern);
		System.out.println(mama.drink);
		System.out.println(mama.friend);
		System.out.println(mama.height);
		System.out.println(mama.goodMama);
		System.out.println(mama.name);
		System.out.println(mama.smoke);
		System.out.println(mama.weight);
		System.out.println(mama.wife);
		
		
		mama.getTown();
		System.out.println(mama.getTown());
		mama.setTown("bengaluru");
		System.out.println("after changing  :  " +mama.getTown());
	}

	

}
