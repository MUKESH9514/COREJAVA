package importantsques;

public class PrintPrimeNo1to31 {

	public static void main(String[] args) 
	{
		
		for(int num=1;num<100;num++)
		{
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
				System.out.println(num);
			}	
			
		}
	}

}
