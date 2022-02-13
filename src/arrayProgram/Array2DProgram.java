package arrayProgram;

import java.util.Scanner;

public class Array2DProgram {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter number of row");
      int row=s.nextInt();
      System.out.println("Enter number of column");
      int col=s.nextInt();
      int[][]a=new int[row][col];
      System.out.println("Enter value of matrix");
      for (int i = 0; i < a.length; i++) 
      {
		for (int j = 0; j < a[i].length; j++) 
		{
			System.out.println("Enter row"+i+"column"+j+"value");
			a[i][j]=s.nextInt();
		}
	  }
      System.out.println("Element of the matrix are");
     // for (int j = 0; j < a[i].length; j++) 
      {
	//	System.out.print(a[i][j]+" ");
	  }
	}

}
