package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Mama;
import com.xworkz.accesSpecifiers.Mamaof;

public class MamaRunner {
	
	public static void main(String[] args) {
	
	Mama mama=new Mama("boo","adwait","pooja",6,1988,72, false, false,true,"Iam");
	
	Mamaof mamaof = new Mamaof();
	
	mama.getTown();
	
	mamaof.takeingFromMama(mama);

}
}