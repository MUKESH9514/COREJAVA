package programingClass;

public class DisplaySecondDigitOfGivenNo {

	public static void main(String[] args) {
		int num=23516;
		while(num>99)
		{
			num=num/10;
		}
		System.out.println(num%10);
	}

}

