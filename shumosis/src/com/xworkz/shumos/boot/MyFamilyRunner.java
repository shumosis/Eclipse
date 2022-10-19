package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class MyFamilyRunner {

	public static void main(String[] args)
	{
		String[] adult= {"sonbai","ramchandra","sunita","suresh","prema","mallesh"};
        String[] child= {"chinu","manas","adwaith"};
		String[] lady= {"prema","sunita","sonabai"};
		String[] gents= {"mallesh","suresh","ramchandra"};
		String[] sonInLaws= {"arvind","prakash"};
		
		 MyFamily family =new  MyFamily("cfl",22,7,10,5,true,adult,child,
   		lady,gents,sonInLaws);
   
   family.display() ;

	}

}
