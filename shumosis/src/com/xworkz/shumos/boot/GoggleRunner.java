package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class GoggleRunner {

	public static void main(String[] args) {
		
		String[] color= {"red","blck","blue"};
        String[] shape= {"round","square","Cylindrical"};
		 String[] sizes= {"medium","big","small"};
		 String[] uses= {"goodlooks","protection"};
		 String[] types= {"Avientor","Antigleare","Sunglasses"};
		
   Goggle goggle=new Goggle("cfl","rayban",3,25,3000,true,color, shape,
   		sizes,uses,types);
   
   goggle.display() ;

	}

}
