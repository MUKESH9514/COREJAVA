package tyss;

public class PrintFibbonaciNum {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println("Fibonacci series is ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i = 0; i < 10; i++) 
		{
			int c=a+b;
			if(c<25)
			{
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			else
			{
				break;
			}
			
		}
	}

}
