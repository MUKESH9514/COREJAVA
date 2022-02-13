package tysssAssignment;

public class SwapFirstAndLastWordInGivenString {

	public static void main(String[] args) {
     String s="welcome to tyss company";
     String[] s1=s.split(" ");
     String s2=s1[0];  // welcome
     s1[0]=s1[s1.length-1]; //company
     s1[s1.length-1]=s2; //welcome
     for(int i=0;i<s1.length;i++)
     {
    	 System.out.print(s1[i]+" ");
     }
     
	}

}
