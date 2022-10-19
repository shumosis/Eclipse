package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class PaperRunner {

	public static void main(String[] args) 
	{
		String[] color= {"white","pink","blue"};
        String[] shape= {"round","square","ractangle"};
		 String[] sizes= {"king","long","small"};
		 String[] uses= {"write","read"};
		 String[] types= {"cardsheet","drawing","rulled"};
		
    Paper paper =new Paper("cfl",4,3,1,30,true,color, shape,
   		sizes,uses,types);
   
   paper.display() ;

	}

		

	}


