package com.xworkz.accesSpecifiers;

public class shcoolll {
	
	public School  school  ;

	public void useschool(School school  ) 
	{
		System.out.println(school.area);
		System.out.println(school.cahirman);
		System.out.println(school.district);
		System.out.println(school.fees);
		System.out.println(school.goodClg);
		System.out.println(school.goodTeachers);
		System.out.println(school.ground);
		System.out.println(school.priciple);
		System.out.println(school.startYear);
		System.out.println(school.town);
		school.getName();
		System.out.println(school.getName());
		school.setName("Rayat shikshan Sanstha");
		System.out.println("after changing  :  " +school.getName());
	}

}
