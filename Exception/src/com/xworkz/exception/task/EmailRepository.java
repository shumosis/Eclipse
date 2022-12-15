package com.xworkz.exception.task;

public   interface EmailRepository {
	boolean create(String gmail);

	default int totalGmails() {
		return 10;

	}

}
