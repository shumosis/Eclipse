package com.xworkz.exception.task;

public interface PanCardRepo {
	boolean linking(String card);

	default int total() {
		System.out.println("running total");
		return 10;

	}

}
