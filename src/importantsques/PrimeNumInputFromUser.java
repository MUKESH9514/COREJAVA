package importantsques;

import java.util.Scanner;

public class PrimeNumInputFromUser 
{
 public static void main(String[] args) 
 {
 System.out.println("enter a number");
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
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
			System.out.println(num+" is prime ");
		}	
		else
		{
			System.out.println(num+" is not prime ");
		}
 }

}
