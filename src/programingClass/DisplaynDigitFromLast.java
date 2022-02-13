package programingClass;

public class DisplaynDigitFromLast {

	public static void main(String[] args) {
		int num=23578;
		int n=3;
		int i=0;
		while(num>0)
		{
			i++;
			if(i==n)
			{
				break;
			}
			num=num/10;
		}
		int ld=num%10;
		System.out.println(ld);

	}

}
