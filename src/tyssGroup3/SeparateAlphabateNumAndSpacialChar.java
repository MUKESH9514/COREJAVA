package tyssGroup3;

public class SeparateAlphabateNumAndSpacialChar {

	public static void main(String[] args) {
		String s = "abc1@2d$e";
		String ch="";
		String num="";
		String sp="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ch = ch+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				num=num+s.charAt(i) ; 
			}
			else
			{
				sp=sp+s.charAt(i);
			}
		}
		System.out.println("alphabet:\t"+ch);
		System.out.println("Number:\t"+num);
		System.out.println("SpacialChar:\t"+sp);
	}

}
