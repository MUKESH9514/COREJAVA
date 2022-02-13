package arrayProgram;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		System.out.println(" Before swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Scanner s=new Scanner(System.in);
		System.out.println("enter index values to be swapped");
		int i1=s.nextInt();
		int i2=s.nextInt();
		a[i1]=a[i1]+a[i2];
		a[i2]=a[i1]-a[i2];
		a[i1]=a[i1]-a[i2];
		System.out.println("After swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
