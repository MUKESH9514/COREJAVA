package tyss;

public class CheckPalindromeNum {

	public static void main(String[] args) 
	{
     int n=121;
     int temp=n;
     int rev=0;
     int ld;
     while(temp>0)
     {
    	 ld=temp%10;																																																																																																																																																																																																																																																																																																																																																								
    	 rev=rev*10+ld;
    	 temp=temp/10;
     }
     if(n==rev)
     {
    	 System.out.println("Palindrome");
     }
     else
     {
    	 System.out.println("Not Palindrome"); 
     }
	}

}
