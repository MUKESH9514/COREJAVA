package programingClass;

public class SumOfProductConsecutiveDigit {

	public static void main(String[] args) {
		int num=2315;
		int ld1;
		int ld2;
		int sum=0;
		while(num>0)
		{
			ld1=num%10;
			num=num/10;
			ld2=num%10;
			sum=sum+(ld1*ld2);
		}
		System.out.println(sum);
	}

}
