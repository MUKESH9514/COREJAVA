package arrayProgram;

public class Array7 {

	public static void main(String[] args) {
		int []a={1,2,4,5,8,10};
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = a[i]+1; j <a[i+1]; j++)
			{
				System.out.println(j);
			}

		}

	}

}
