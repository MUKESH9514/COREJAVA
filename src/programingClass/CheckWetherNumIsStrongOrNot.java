package programingClass;

public class CheckWetherNumIsStrongOrNot {

	public static void main(String[] args) {
   int num=145;
   int num1=num;
   int fact=1;
   int sum=0;
   while(num>0)
   {
	   num1=num%10;
	   fact=fact*num1;
	   sum=sum+fact;
	   num=num/10;
   }
    if(sum==num)
    {
    	System.out.println("number is strong");
    }
    else
    {
    	System.out.println("number is not strong");

    }
	}

}
