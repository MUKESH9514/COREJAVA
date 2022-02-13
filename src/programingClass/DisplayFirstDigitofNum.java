package programingClass;

public class DisplayFirstDigitofNum {

	public static void main(String[] args) {
		int num=2564;
		while(num>9)
		{
			num=num/10;
		}
		System.out.println(num);
	}

}
