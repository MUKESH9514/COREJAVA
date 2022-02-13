package patternProgram;

public class Pattern2 {

	public static void main(String[] args) {
		int n=4;//total rows
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{

				System.out.print(k);
				k++;
				if(k==10)
				{
					k=1;
				}
			} 
			System.out.println();
		}
	}

}
