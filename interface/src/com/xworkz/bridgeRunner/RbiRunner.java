package com.xworkz.bridgeRunner;

import com.xworkz.bridge.AccoutHolder;
import com.xworkz.bridge.RBI;

public class RbiRunner {

	public static void main(String[] args) {
		
		AccoutHolder AccoutHolder = new AccoutHolder();
		
		RBI rbi = new RBI(AccoutHolder);
		
		
		rbi.checkRules();
	}

}
