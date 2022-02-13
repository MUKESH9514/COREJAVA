package string;

public class PrintStringStartingAndEndingGivenLetter {

	public static void main(String[] args) 
	{
		 String[]a= {"abc","aba","xyx","apple","axya"};
	       for (int i = 0; i < a.length; i++) 
	       {
			String s=a[i];
			if(s.charAt(0)=='a'&&s.charAt(s.length()-1)=='a')
			{
				System.out.println(s);
			}
		   }
	}

}
