package com.xworkz.bridge;

public abstract class Person extends Object{
	
	private String name ;
	
	private int height;
	 
	private int weight;
	
	private String town;
	
	private String job;
	
	
	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getHeight() {
		
		System.out.println(height);
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		System.out.println(weight);
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTown() {
		System.out.println(town);
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getJob() {
		System.out.println(job);
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	abstract String eat();
	
	abstract int sleep();
	
	
	

}
