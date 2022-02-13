package importantsques;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[]a={10,20,30,40};
		int[]b= {50,60,70,80,200};
		int alength=a.length;
		int blength=b.length;
		int clength=alength+blength;
		int[] c=new int[clength];
		for (int i = 0; i < a.length; i++) 
		{
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			c[alength+i]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");

		}
		System.out.println("Number of Array Length is "+c.length);
	}

}
