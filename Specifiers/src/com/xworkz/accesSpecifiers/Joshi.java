package com.xworkz.accesSpecifiers;

public class Joshi 
{
String Surname = "joshi";

public Akshay akshay;

public void useAkshay(Akshay akshay) 
{
	System.out.println(akshay.birthYear);
	System.out.println(akshay.clg);
	System.out.println(akshay.drink);
	System.out.println(akshay.friend);
	System.out.println(akshay.gf);
	System.out.println(akshay.goodBoy);
	System.out.println(akshay.height);
	System.out.println(akshay.weight);
	System.out.println(akshay.shirtSize);
	System.out.println(akshay.smoke);
	akshay.getTown();
	System.out.println(akshay.getTown());
	akshay.setTown("mudhol");
	System.out.println("after changing  :  " +akshay.getTown());
}

}
