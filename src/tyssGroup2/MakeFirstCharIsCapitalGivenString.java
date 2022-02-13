package tyssGroup2;

public class MakeFirstCharIsCapitalGivenString {

	public static void main(String[] args) {
    String s="welcome to tyss";
    char ch=(char)(s.charAt(0)-32);
    System.out.print(ch);
    for(int i=1;i<s.length();i++)
    {
    	if(s.charAt(i)==' ') {
    		System.out.print(" "+(char)(s.charAt(i+1)-32));
    		i=i+1;
    		
    	}
    	else
    	{
    		System.out.print(s.charAt(i));
    	}
    }
   
   
    	
    
	}

}
