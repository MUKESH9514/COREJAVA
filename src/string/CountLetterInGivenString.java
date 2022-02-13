package string;

public class CountLetterInGivenString {

	public static void main(String[] args) 
	{
        String s1="Maharashtra";
        char[]ch=s1.toCharArray();
        int count=0;
        int count1=0;
        for (int i = 0; i < ch.length; i++) 
        {
		  if(ch[i]=='a')
		  {
			 count++; 
		  }
		  else if(ch[i]=='h')
		  {
			  count1++;
		  }
		}
        System.out.println(count);
        System.out.println(count1);
	}

}
