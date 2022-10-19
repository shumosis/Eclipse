package com.xworkz.shumos;

public class MyFamily 
{
	public String familyname;
	public double members;
	public double childrens;
	public double adults;
	public double ladies;
	public boolean love;
	public String[] adult ;
	public String[] childs;
	public String[] lady;
	public String[] gents;
	public String[] sonInLaws;
	
	public MyFamily (String familyname,double members,double childrens,double  adults,
			double ladies
			,boolean love,String[] adult ,String[]  childs,String[] sonInLaws, String[] lady,
			String[] gents)
	{
		
			this.familyname=familyname;
			this.members=members;
			this.childrens =childrens;
			this. adults= adults;
			this.ladies=ladies;
			this.love=love;
			this.adult =adult ;
			this.childs=childs;
			this. lady= lady;
			this. gents= gents;
			this.sonInLaws=sonInLaws;
			
			System.out.println("i love this family");
	}

public void display() 
{
	System.out.println(this.familyname);
	System.out.println(this.members);
	System.out.println(this.childrens);
	System.out.println(this.adults);
	System.out.println(this.ladies);
	System.out.println(this.love);
	

	System.out.println(this.adult);
	for(int i=0;i<this.adult.length;i++)
	{
		String col=this.adult[i];
		System.out.println(col);
	}
	
	
	System.out.println(this.childs);
	for(int i=0;i<this.childs.length;i++)
	{
		String sha=this.childs[i];
		System.out.println(sha);
	}
	
	
	System.out.println(this.lady);
	for(int i=0;i<this.lady.length;i++)
	{
		String use=this.lady[i];
		System.out.println(use);
	}
	
	
	System.out.println(this.gents);
	for(int i=0;i<this.gents.length;i++)
	{
		String use=this.gents[i];
		System.out.println(use);
	}
   
	
	System.out.println(this.sonInLaws);
	for(int i=0;i<this.sonInLaws.length;i++)
	{
		String use=this.sonInLaws[i];
		System.out.println(use);
	}


}

}
