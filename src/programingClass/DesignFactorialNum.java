package programingClass;

public class DesignFactorialNum {
	public static int factNum(int a)
	{
		int fact=1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int result=factNum(4);
		System.out.println(result);

	}

}
