
public class AlphabetPattern {

	public static void main(String abcd[]) {
		String str = "xyz";
		
		for(int i = 0;i<3;i++) 
		{
			System.out.print(str.toUpperCase().charAt(i));
			for(int j = 1;j<=i;j++)
			{
				
			System.out.print(str.toLowerCase().charAt(i));
			}
			   
			    
		System.out.println();	
}
}
}
	

			

	
// xyz=>X-Yy-Zzz