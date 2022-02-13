package tysssAssignment;
public class HappyNum {

	public static void main(String[] args) {
		int num=658;
		int n=num;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int ld=n%10;
				sum=sum+ld;
				n=n/10;
			}
			n=sum;
		}

		System.out.println(n);


	}
}
