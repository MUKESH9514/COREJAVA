package tyss;

public class PrintName100TimesWithoutLoop {

	public static void main(String[] args) {

		name(1);
	}
	public static void name(int a)
	{
		String s = "Hello";
		if(a<101)
		{	
			System.out.println(a+" "+s);
			a=a+1;
			name(a);
		}
		else
		{
			return;
		}

	}


}
