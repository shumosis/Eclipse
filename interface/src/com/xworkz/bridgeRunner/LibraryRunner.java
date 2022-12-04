package com.xworkz.bridgeRunner;

import com.xworkz.bridge.Library;
import com.xworkz.bridge.Reader;

public class LibraryRunner {

	public static void main(String[] args) {
		
		Reader reader = new Reader();
		
		Library library = new Library(reader);
		
		library.checkingrules();
		

	}

}
