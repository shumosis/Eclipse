package com.xworkz.shumos.boot;
import com.xworkz.shumos.*;
public class DistricCollectorRunner {
	
	public static void main(String[] args) {
		
		DistricCollector DC=new DistricCollector();
		
		DC.name="Mallesh";
		DC.age=30;
		DC.district="belgum";
		DC.batchno=34;
		
		System.out.println(DC.name);
		System.out.println(DC.age);
		System.out.println(DC.district);
		System.out.println(DC.batchno);
		

}
}