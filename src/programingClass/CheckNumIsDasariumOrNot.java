package programingClass;

public class CheckNumIsDasariumOrNot {

	public static void main(String[] args) {
  int num=19;
  int sum=0;
  int pos=1;
  int pos1;
  int num1;
  while(num>0)
  {
	  num1=num%10;
	  pos1=num1*num1;
	  sum=sum+pos1;
	  num=num/10;
  }
  System.out.println(sum);
	}

}
