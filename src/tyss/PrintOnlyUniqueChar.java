package tyss;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {
		String s1 = "heLLo";

		LinkedHashSet<Character>set=new LinkedHashSet<Character>(); 
		for(int i=0;i<s1.length();i++) 
		{
			set.add(s1.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(ch==s1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch);
			}
		}

	}
}
