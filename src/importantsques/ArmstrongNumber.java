package importantsques;

public class ArmstrongNumber 
{
   public static int digitCount(int n)
   {
	   int count=0;
	   while(n>0)
	   {
		   n=n/10;
		   count++;
	   }
	   return count;
   }
   public static int powerOf(int b,int n)
   {
	   int x=b;
	   int n1=n;
	   int power=1;
	   for(int i=0;i<n1;i++)
	   {
		   power=power*x;
	   }
	   return power;
   }
   public static void main(String[] args)
   {
	   int num=371;
	   int num1=num;
	   int sum=0;
	   int ld;
	   int c=digitCount(num1);
	   while(num>0)
	   {
		   ld=num%10;
		   ld=powerOf(ld,c);
		   sum=sum+ld;
		   num=num/10;
	   }
	   if(num1==sum)
	   {
		   System.out.println("num is Armstrong");
	   }
	   else 
	   {
		   System.out.println("num is Not Armstrong");

	   }
	   
   }
}
