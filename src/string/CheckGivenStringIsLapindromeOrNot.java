package string;

public class CheckGivenStringIsLapindromeOrNot {

	public static void main(String[] args) 
	{
      String s1="abcab";
      String[] s2=s1.split("c");
      for (int i = 0; i < s2.length; i++) 
      {
    	  System.out.println(s2[i]);
	  }
      
	}

}
