package programingClass;

public class SumOfProductCorrespondinDigit {

	public static void main(String[] args) {
		int num1=327;
		int num2=539;
		int ld1;
		int ld2;
		int sum=0;
		while(num1>0)
		{
			ld1=num1%10;
			num1=num1/10;
			ld2=num2%10;
			num2=num2/10;
			sum=sum+(ld1*ld2);
		}
		System.out.println(sum);
	}

}
