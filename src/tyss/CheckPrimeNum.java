package tyss;

public class CheckPrimeNum {

	public static void main(String[] args) {
		int n=5;
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		if(n==i)
		{
			System.out.println("num is Prime");
		}
		else
		{
			System.out.println("num is Not Prime");
		}
	}

}
