package tyss;

public class SwapTwoStringWithoutThirdVar {

	public static void main(String[] args) {
  String s1 = "java";
  String s2 = "python";
  System.out.println("Before Swap");
  System.out.println("s1: "+ s1+" s2:"+ s2);
  s1=s1+s2;   //javapython
  s2=s1.substring(0,s1.length()-s2.length());
  s1=s1.substring(s2.length());
  System.out.println("Afrer Swap");
  System.out.println("s1:" +s1+" s2:"+ s2);
	}

}
