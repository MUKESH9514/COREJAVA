package programingClass;

public class PrintPositionalValuesOfDigit {

	public static void main(String[] args) {
		int num=21463;
	    int pos=1;
	    int ld;
	    while(num>0)
	    {
	    	ld=num%10;
	    	System.out.println(ld*pos);
	    	pos=pos*10;
	    	num=num/10;
	    }
		}
}
