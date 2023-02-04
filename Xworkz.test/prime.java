
class prime
{
    public static void main(String [] shum)
	{
		int m=0;
		int num=17;
		boolean flag=false;
		m=num/10;
		
		if(num==0||num==1)
		{
			System.out.println("number is not prime number 0 and 1");
		}
		else
		{
			for(int index=2;index<=m;index++)
			{
				if(num%index==0)
				{
					System.out.println("number is not prime number");
					flag=true;
					break;
				}
				
			}
     	if(flag==false)
	    {
		System.out.println("prime number");
	    }
		}
	}
}