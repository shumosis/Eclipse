package com.xworkz.exception.boot;

import javax.security.auth.DestroyFailedException;

import com.xworkz.exception.task.EventCreator;

public class EventRunner {

	public static void main(String[] args) {
		
		 EventCreator  eventCreator = new  EventCreator();
		 try {
			 System.out.println("befor exception");
			eventCreator.meth1();
			System.out.println("after exception");
		} catch (DestroyFailedException e) {
			
			System.out.println("removing exception");
		}
	}

}
