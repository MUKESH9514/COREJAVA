package programingClass;

public class PrintSeries2 {

	public static void main(String[] args) {
    int k=1;
    int sum=0;
    for(int i=1;i<=10;i++)
    {
    	System.out.print(k+",");
    	sum=sum+k;
    	k=k+3;
    }
    System.out.println();
    System.out.println(sum+" is sum");
	}

}
