package string;

public class InGivenStringPrintOnlySumOfNum {

	public static void main(String[] args) 
	{
       String s="sfg1k4k7*3";
       char[]ch=s.toCharArray();
       int sum=0;
       for (int i = 0; i < ch.length; i++) 
       {
		if(ch[i]>='0'&&ch[i]<='9')
		{
			sum=sum+(ch[i]-48);
		}
	   }
       System.out.println(sum);
	}

}
