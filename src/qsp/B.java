package qsp;

public class B {

	public static void main(String[] args) {
		String s1="hello how are you";
		String[] s2=s1.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++)
		{
			s3=s2[i]+" "+s3;
		}
		s3=s3.trim();
		System.out.println(s3);
		
	}

}
