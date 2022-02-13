package string;

public class PrintStringStartingWithGivenLetter {

	public static void main(String[] args) 
	{
       String[]a= {"abc","aba","xyx","apple","axya"};
       for (int i = 0; i < a.length; i++) 
       {
		String s=a[i];
		if(s.charAt(0)=='a')
		{
			System.out.println(s);
		}
	   }
	}

}
