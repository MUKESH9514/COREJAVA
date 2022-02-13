package patternProgram;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;//total rows
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{
				if(j%2==0)
				{
					System.out.print(k);
					k++;
					if(k==10)
					{
						k=1;
					}
					
				}
				else
				{
					System.out.print("*");
				}
			} 
			System.out.println();
		}
	}

}
