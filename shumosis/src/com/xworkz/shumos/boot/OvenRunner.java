package com.xworkz.shumos.boot;

import com.xworkz.shumos.Oven;


public class OvenRunner {

	public static void main(String[] args)
	{

		String[] color= {"black","blue"};
        String[] shape= {"square","ractangle"};
		 String[] sizes= {"king","small"};
		 String[] uses= {"cooking","hotfood"};
		 String[] types= {"hotel","home"};
		
    Oven oven =new Oven("samsung",4,3,1,30000,true,color, shape,
   		sizes,uses,types);
   
   oven.display() ;


	}

}
