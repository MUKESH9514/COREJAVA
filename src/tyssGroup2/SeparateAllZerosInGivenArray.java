package tyssGroup2;

public class SeparateAllZerosInGivenArray {

	public static void main(String[] args) {
		int []a= {3,1,0,1,0,0,1,2,0};
		// 3 1 1 1 2 0 0 0 0(OUT PUT)
		int []b=new int[a.length];  //6
		int m=0;
		int n=b.length-1;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
