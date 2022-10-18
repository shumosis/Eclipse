package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class BgmitRunner {

	public static void main(String[] args) {
		
	     String[] braches= {"enc","cs","mech","civil"};
         String[] enc_teachers= {"shetter","kori"};
		 String[] civil_teachers= {"joshi","chitargi"};
		 String[] mech_teachers= {"sugandhi","komar"};
		 String[]  cs_teachers= {"manjunath","kumbhar"};
		
    Bgmit bgmit=new Bgmit("keroor",4,500,70,true,true, braches,enc_teachers,civil_teachers,mech_teachers,cs_teachers);
    Bgmit bgmit2= new Bgmit("--" ,3,4,4, false,false,braches,enc_teachers,civil_teachers,mech_teachers,cs_teachers);
   bgmit.display() ;
   bgmit2.display();
   
	}

}
