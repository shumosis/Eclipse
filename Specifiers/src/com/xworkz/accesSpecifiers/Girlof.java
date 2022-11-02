package com.xworkz.accesSpecifiers;

public class Girlof 
{
	String bfname = "shumosis";

	public Girl girl;

	public void loveGirl(Girl girl) 
	{
		System.out.println(girl.birthYear);
		System.out.println(girl.clg);
		System.out.println(girl.cute);
		System.out.println(girl.drink);
		System.out.println(girl.friend);
		System.out.println(girl.goodgirl);
		System.out.println(girl.height);
		System.out.println(girl.smoke);
		System.out.println(girl.weight);
		System.out.println(girl.bf);
		
		girl.getName();
		System.out.println(girl.getName());
		girl.setName("nang aakine beku");
		System.out.println("after changing  :  " +girl.getName());
	}

}
