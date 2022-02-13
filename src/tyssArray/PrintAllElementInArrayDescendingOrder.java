package tyssArray;

public class PrintAllElementInArrayDescendingOrder {

	public static void main(String[] args) {
		int[]arr1= {20,30,50,10,40};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	
	}

}
