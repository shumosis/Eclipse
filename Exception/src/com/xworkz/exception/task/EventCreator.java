package com.xworkz.exception.task;

import javax.security.auth.DestroyFailedException;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

public class EventCreator {

	
	public void meth1() throws DestroyFailedException {
	System.out.println("running method1");	
	
	meth2();
	}
	public void meth2() throws DestroyFailedException {
	System.out.println("running method2");	
	
	meth3();
	}

	public void meth3() throws DestroyFailedException {
	System.out.println("running method3");	
	
	meth4();
	}

	public void meth4() throws DestroyFailedException {
	System.out.println("running method4");	
	
	meth5();
	}

	public void meth5() throws DestroyFailedException{
	System.out.println("running method5");
	
	throw new  DestroyFailedException();
	
	
	}	

}
