package com.xworkz.rules.boot;

import com.xworkz.rules.things.Kabbadi;
import com.xworkz.rules.things.KabbadiPlayer;

public class KabbadiRunner {

	public static void main(String[] args) {
		
		Kabbadi kabbadi = new KabbadiPlayer();
		
		 kabbadi.allOutPoint();
		 kabbadi.bonousPoint();
		 kabbadi.noOfPlayers();
		 kabbadi.superTcklePoint();
		 kabbadi.winningPoint();
	

	}

}
