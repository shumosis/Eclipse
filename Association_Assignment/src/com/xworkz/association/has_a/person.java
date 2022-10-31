package com.xworkz.association.has_a;

public class person {
	

	
	public String name;
	public Email[] email;
	//public Job job = new Job(300000,"lead",true,company);
	public Job job;
	
	public person(String name, Email[] email, Job job) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
	}
	public void showOfPerson() 
	{
		System.out.println(name);
        job.showofjob();
        System.out.println("==================================");
        
         for(int i = 0;i<email.length;i++) {
        	 
        	 Email element = this.email[i];
        	 System.out.println(element);
        	// System.out.println(email[i].id);
        	// System.out.println(email[i].mobile_no);
        	// System.out.println(email[i].company.name);
        	//System.out.println(email[i].company.addres.location.state.name);
        	// System.out.println(email[i].password);
        	 
         }
	}

}
