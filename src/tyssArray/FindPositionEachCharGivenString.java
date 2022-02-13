package tyssArray;

import java.util.HashSet;


public class FindPositionEachCharGivenString {

	public static void main(String[] args) {
		String s = "Tester";
		s=s.toLowerCase();

		HashSet<Character>set=new HashSet<Character>(); 
		for(int i=0;i<s.length();i++) 
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch +" " + (i+1));
					//break;
				}
			}
			
		}
	}

		
	
	

}
