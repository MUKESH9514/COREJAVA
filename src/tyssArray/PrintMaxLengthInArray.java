package tyssArray;

public class PrintMaxLengthInArray 
{
	public static void main(String[] args) 
	{
		String[]strArr= {"hello","all","welcome","to","java","tyss123"};
		String maxElement=strArr[0];
		for(int i=1;i<strArr.length;i++)
		{
			if(maxElement.length()<strArr[i].length())
			{
				maxElement=strArr[i];
			}
		}
		for(int i=0;i<strArr.length;i++)
		{
			if(maxElement.length()==strArr[i].length())
			{
				System.out.println(strArr[i]);
			}
		}

	}
}
