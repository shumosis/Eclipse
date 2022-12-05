package com.xworkz.bridge;

public class JavaTrainee  extends Person implements XworkzRule {

	@Override
	public boolean uploadTask() {
		System.out.println("running uploadTask");
		return true;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completed program");
		return true;
	}

	@Override
	public String eat() {
		System.out.println("running eat");
		return "chicken";
	}

	@Override
	public int sleep() {
		System.out.println("running sleep");
		return 10;
	}

}
