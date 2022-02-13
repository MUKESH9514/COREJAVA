package tyss;

import java.util.HashSet;

public class RemoveDuplicatesCharFromGivenString {

	public static void main(String[] args) {
		String s1 = "heLLo";
		HashSet<Character>set=new HashSet<Character>(); 
		for(int i=0;i<s1.length();i++) 
		{
			set.add(s1.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.println(ch);
		}

	}
}
