package com.xworkz.shumos.boot;
import com.xworkz.shumos.*;
public class BusRunner {

	public static void main(String[] args) {
		
	Bus bmtc= new Bus();
	bmtc.no=6453;
	bmtc.Starting="more";
	bmtc.destination="xworkz";
	

	System.out.println(bmtc.no);
	System.out.println(bmtc.Starting);
	System.out.println(bmtc.destination);
	}

}
