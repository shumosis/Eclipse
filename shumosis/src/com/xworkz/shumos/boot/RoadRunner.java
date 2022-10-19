package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class RoadRunner {

	public static void main(String[] args) {
	
			
		     String[] braches= {"navrangRoad","rajkumarRoad"};
	         String[] signalAt= {"sagar hotel","hyundai shoowroom"};
			 String[] civilEngineers= {"joshi","chitargi"};
			 String[]  mainPoints= {"orion mall","xworkz"};
			 String[]  metroStations= {"mahalaxmi","Rajajinagr"};
			
	    Road road=new Road("chord road",30,5,"Yashwantpura","kangeri",true, braches, signalAt,
	    		civilEngineers,mainPoints, metroStations);
	    
	   road.display() ;
	  
	   
		}

	}


