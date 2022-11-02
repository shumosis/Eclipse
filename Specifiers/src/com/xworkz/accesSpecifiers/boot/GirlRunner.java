package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Girl;
import com.xworkz.accesSpecifiers.Girlof;

public class GirlRunner {
	
	public static void main (String[] shumos) 
	{
		Girl girl = new Girl("pakka gort illa","helidre nimgu gort aagteti", false,4,1998,65, false, false,"yes i think", true);
		
		Girlof girlof= new Girlof();
		
		girl.getName();
		
		
        girlof.loveGirl(girl);
        		
		
		
		
		
	}

}
