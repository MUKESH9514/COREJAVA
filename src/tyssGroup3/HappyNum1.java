package tyssGroup3;

public class HappyNum1 {

	public static void main(String[] args) {
int r,s;
int n=49;
while(n>9)
{
	s=0;
	while(n!=0)
	{
		r=n%10;
		s=s+(r*r);
		n=n/10;
	}
	n=s;
}
     if(n==1)
     {
    	 System.out.println("Given number is happy");
     }
     else
     {
    	 System.out.println("Given number is not happy");
     }
	}

}
