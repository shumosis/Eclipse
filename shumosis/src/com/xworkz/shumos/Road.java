package com.xworkz.shumos;

public class Road {
	public String name;
	public double length;
	public double width;
	public String starting;
	public String end;
	public boolean googlemap;
	public String[] braches;
	public String[] signalAt;
	public String[] civilEngineers;
	public String[] mainPoints;
	public String[] metroStations;
	
	public Road(String name,double length,double width,String starting,String end,
			boolean googlemap,String[] braches,String[] signalAt,String[] civilEngineers,
			String[] mainPoints,String[] metroStations) 
	{
		
		
	this.name=name;
	this. length= length;
	this.width=width;
	this. starting= starting;
	this.end=end;
	this.googlemap=googlemap;
	this.braches=braches;
	this.signalAt=signalAt;
	this.civilEngineers=civilEngineers;
	this.mainPoints=mainPoints;
	this. metroStations= metroStations;
		
	System.out.println("clg is just ok");
	}
	public void display() 
	{
		System.out.println(this.name);
		System.out.println(this. length);
		System.out.println(this.width);
		System.out.println(this. starting);
		System.out.println(this.end);
		System.out.println(this.googlemap);
		
		System.out.println(this.braches);
		for(int i=0;i<this.braches.length;i++) {
			String brache=this.braches[i];
			System.out.println(brache);
		}
		
		System.out.println(	this.signalAt);
        for(int i=0;i<	this.signalAt.length;i++)
        {
			String signal=signalAt[i];
			System.out.println(signal);
		}
        
		
        System.out.println(this.civilEngineers);
		 for(int i=0;i<this.civilEngineers.length;i++)
        {
			
			String engineers=this.civilEngineers[i];
			System.out.println( engineers);
		}
        
		
		 System.out.println(this.mainPoints);
        for(int i=0;i<this.mainPoints.length;i++) 
        {
			
			String mainpoint=this.mainPoints[i];
			System.out.println(mainpoint);
		}
        
		System.out.println(this.metroStations);
        for(int i=0;i<this.metroStations.length;i++) 
        {
			
			String metro =this.metroStations[i];
			System.out.println(metro);
		}
	}


}
