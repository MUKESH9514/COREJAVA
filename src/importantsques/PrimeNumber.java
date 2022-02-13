package importantsques;

public class PrimeNumber 
{
public static void main(String[] args) 
 {
			int num=7;
			int num1=0;
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					num1=num1+1;
				}
			}
			if(num1==0)
			{
				System.out.println(num +" number is prime");
			}	
			else
			{
				System.out.println(num +" number is not prime");
			}
		}
	}


