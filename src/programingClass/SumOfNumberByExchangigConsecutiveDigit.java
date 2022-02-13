package programingClass;

public class SumOfNumberByExchangigConsecutiveDigit {

	public static void main(String[] args) {
    int num=2415;
    int sum=0;
    int ld1;
    int ld2;
    int ld3;
    while(num>2)
    {
      ld1=num%100;//15
      ld2=ld1%10;//5
      int num1=ld1;//15
      ld3=num1/10;//1
      sum=sum+ld2*10+ld3;
      num=num/10;
    }
    System.out.println(sum);
	}

}
