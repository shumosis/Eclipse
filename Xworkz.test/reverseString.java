

class reverseString
{
	public static void main(String[] shumo)
	{
		String str="shubham";
		String rev="";
		
		for(int index=str.length()-1;index>=0;index--)
		{
			rev=rev+str.charAt(index);
		}
		System.out.println(str);
		System.out.println(rev);
	}
}	
		