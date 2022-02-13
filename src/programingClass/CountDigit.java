package programingClass;

public class CountDigit {

	public static void main(String[] args) {
      int num=238;
      int count=0;
      int num1=num;
      while(num>0)
      {
    	  num=num/10;
    	  count++;
      }
      System.out.println("count of digit in "+num1+"is "+count);
	}

}
