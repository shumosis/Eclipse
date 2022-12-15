package com.xworkz.exception.boot;

import com.xworkz.exception.task.EmailRepoImpl;
import com.xworkz.exception.task.EmailRepository;

public class EmailRunner {

	public static void main(String[] args) {
		EmailRepository gmailRepository=new EmailRepoImpl ();
		gmailRepository.create("shubham@gmail.com");
		gmailRepository.create("shrisham@gmail.com");
		gmailRepository.create("akshay@gmail.com");
		gmailRepository.create("sanju@gmail.com");
		gmailRepository.create("natrajan@gmail.com");
		gmailRepository.create("vijay@gmail.com");
		gmailRepository.create("maruti@gmail.com");
		gmailRepository.create("kallu@gmail.com");
		gmailRepository.create("manu@gmail.com");
		gmailRepository.create("rani@gmail.com");
		//gmailRepository.create("mallesh@gmail.com");
		System.out.println(gmailRepository.totalGmails());

		
			
		
	}
	

}
