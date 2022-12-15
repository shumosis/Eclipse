package com.xworkz.exception.task;

public interface SweetNameRepo {
	
	boolean prepare(String names);
	
	default int totalSweets() {
		System.out.println("running total sweets");
		return 10;

}
}
