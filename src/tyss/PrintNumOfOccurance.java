package tyss;

import java.util.HashSet;

public class PrintNumOfOccurance {

	public static void main(String[] args) {
		String s1 = "hello";

		HashSet<Character>set=new HashSet<Character>(); 
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
			System.out.println(ch +" " + count);
		}
	}



}
