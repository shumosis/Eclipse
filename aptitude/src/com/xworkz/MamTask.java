package com.xworkz;

public class MamTask {
	

	public static void main(String[] args) {
	for (int i = 0; i <=5; i++) {
		
		for (int j = 0; j<=i; j++) {
			System.out.print("*");
		}
	System.out.println(" ");
	}
	
	
	int i,j,row = 6;
    for ( i= 0; i < row;i++) 
    {
       for( j=row-i;j>1;j--) 
       {
       System.out.print(" ");  
       }
	   for ( j = 0; j <=i; j++)
       {
       System.out.print( "* " );
       }
     System.out.println();    
	}

}
	
	}
