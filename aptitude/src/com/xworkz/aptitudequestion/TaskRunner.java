package com.xworkz.aptitudequestion;

import com.xworkz.MamTask;

public class TaskRunner {

	public static void main(String[] args) {
		
		System.out.println(MamTask.name);
		
		MamTask mamtask = new MamTask(18);
		
		System.out.println(mamtask.price);
		
		mamtask.gettask();
		

	}

}
