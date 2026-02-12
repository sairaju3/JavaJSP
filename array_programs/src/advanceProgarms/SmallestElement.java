package advanceProgarms;

import java.util.Arrays;

public class SmallestElement 
{	
	public static int fingSamllestElement(int[] arr)
	{
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		int arr[] = {55,6,3,7,9,33};
		System.out.println(Arrays.toString(arr));
		int largest=fingSamllestElement(arr);
		System.out.println("The Smallest Element is : "+largest);
	}
	

}
