package patternProgram;

public class Pattern4 {

	public static void main(String[] args) {
		int n=3;//total rows
		int c=5;
		int sp=c-1; //4  //2  //0
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			} 

			System.out.println();
			sp=sp-2;
		}
	}

}
