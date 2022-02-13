package qsp;

public class D {

	public static void main(String[] args) {
		String s1="why is sky blue";
		String[] s2=s1.split("why");
		String[] s3=s1.split("sky");
		String[] s4=s1.split(" ");
		String s5=" ";
		for(int i=0;i<s2.length;i++)
		{
			s5=s2[i]+" "+s5;
		}
		s5=s5.trim();
		System.out.println(s5);
		
	}

}
