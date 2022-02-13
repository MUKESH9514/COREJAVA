package tyss;

public class ReverseGivenStringWithoutLegthVar {

	public static void main(String[] args) {
		String s = "tyss";
		char[] s1=s.toCharArray();
		int count=0;
		for(char c:s1)
		{
			count++;
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s1[i]);
		}
	}

}
