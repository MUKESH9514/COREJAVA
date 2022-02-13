package arrayProgram;

public class Array1 {

	public static void main(String[] args) {
		char [] ch= {'t','b','c','d','t','a'};
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				c=1;
				System.out.println("a is present");
				break;
			}
		}
		if(c==0)
		{
			System.out.println("a is not present");
		}
	}


}
