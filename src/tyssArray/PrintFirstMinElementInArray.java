package tyssArray;

public class PrintFirstMinElementInArray {

	public static void main(String[] args) {
		int[]arr1= {20,30,50,10,40};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}

		System.out.println("First Minimum Element "+arr1[0]);


	}


}


