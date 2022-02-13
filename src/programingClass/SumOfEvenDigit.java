package programingClass;

public class SumOfEvenDigit {

	public static void main(String[] args) {
     int num=23617;
     int sum=0;
     int num1;
     while(num>0)
     {
    	 num1=num%10;
    	 if(num%2==0)
    	 {
    		sum=sum+num1; 
    	 }
    	 num=num/10;
     }
     System.out.println(sum);
	}

}
