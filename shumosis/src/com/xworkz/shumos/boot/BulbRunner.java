package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class BulbRunner {

	public static void main(String[] args) 
	{
		String[] color= {"red","white","yellow"};
        String[] shape= {"round","square","Cylindrical"};
		 String[] sizes= {"medium","big"};
		 String[] uses= {"Design","light"};
		 String[] types= {"cfl","led","fluroscent"};
		
   Bulb bulb=new Bulb("cfl",5,3,25,3000,true,color, shape,
   		sizes,uses,types);
   
  bulb.display() ;

	}

}
