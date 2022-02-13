package tysssAssignment;

public class FindPrimeNumInGivenArray {

	public static void main(String[] args) {
    int[]a= {2,3,4,5,6,7,8};
    for(int i=0;i<a.length;i++)
    {
    	int n=a[i];
    	int j=2;
		while(j<=n)
		{
			if(n%j==0)
			{
				break;
			}
			else
			{
				j++;
			}
		}
		if(n==j)
		{
			System.out.println(a[i]+" num is Prime");
		}
		else
		{
			System.out.println(a[i]+" num is Not Prime");
		}
	}

    
	}

}
