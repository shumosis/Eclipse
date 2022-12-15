package com.xworkz.exception.task;

import com.xworkz.exception.customCreaExce.GmailSizeExceededException;

public class EmailRepoImpl implements EmailRepository  {
	

	private String[] gmails = new String[10];
	private int gmailIndex = 0;
	
	
	@Override
	public boolean create(String gmail) {
		System.out.println("running create gmail repo");
		if (this.gmailIndex > this.gmails.length) {
			throw new GmailSizeExceededException();
		}
		this.gmails[gmailIndex] = gmail;
		this.gmailIndex++;
		return false;
      }
	@Override
	public int totalGmails() {
		System.out.println("running totalGmails");
		return EmailRepository.super.totalGmails();
	   
	}
}

