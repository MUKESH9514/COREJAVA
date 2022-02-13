package programingClass;

public class SumofAlldigit {

	public static void main(String[] args) {
		int num=265;
		int sum=0;
		int ld;
		while(num>0)
		{
			ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}
