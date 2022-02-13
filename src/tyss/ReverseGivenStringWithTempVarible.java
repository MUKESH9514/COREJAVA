package tyss;

public class ReverseGivenStringWithTempVarible 
{
	public static void main(String[] args) 
	{	
		String s="tyss";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i); 
		}
		System.out.println(rev);
	}
}

