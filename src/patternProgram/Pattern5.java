package patternProgram;

public class Pattern5 {

	public static void main(String[] args) {
		int n=3;
		int sp=n-1;//2
		int c=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp--;
			c=c+2;
		}
	}

}
