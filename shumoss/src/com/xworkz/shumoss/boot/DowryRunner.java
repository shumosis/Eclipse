package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pcchaining.OmkarSir;

public class DowryRunner {

	public static void main(String[] args) {
		
		OmkarSir omkarsir = new OmkarSir(false,"marrage","groom");
		
		System.out.println(omkarsir.right);
		System.out.println(omkarsir.when);
		System.out.println(omkarsir.who);
		
		omkarsir.trueman(false, true);
		 System.out.println(omkarsir.sirgiveDowry);
		 System.out.println(omkarsir.sirtakeDowry);
		
		

	}

}
