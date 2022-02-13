package importantsques;

public class Prime1 {

	//public static void main(String[] args) {
		static boolean isNotPrime(int n) {
		//int n=15;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				return false;
			}
			
		}
		return true;
		}
		
	public static void main(String[] args)
	{
		System.out.println(isNotPrime(12));
	}

}
