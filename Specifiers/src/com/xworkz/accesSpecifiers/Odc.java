package com.xworkz.accesSpecifiers;

public class Odc {
	

	public OmkarSir omkarsir;

	public void takingfrom(OmkarSir omkarsir) 
	{
		System.out.println(omkarsir.birthYear);
		System.out.println(omkarsir.cute);
		System.out.println(omkarsir.drink);
		System.out.println(omkarsir.friend);
		System.out.println(omkarsir.gf);
		System.out.println(omkarsir.goodTeacher);
		System.out.println(omkarsir.job);
		System.out.println(omkarsir.partTimeJob);
		System.out.println(omkarsir.salary);
		System.out.println(omkarsir.smoke);
	
		omkarsir.getjob();
		System.out.println(omkarsir.getjob());
		omkarsir.setJob("xworkz");
		System.out.println("after changing  :  " +omkarsir.getjob());
	}


}
