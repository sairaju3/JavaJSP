package advanceProgarms;

import java.util.Arrays;

public class LargestElement 
{
	public static int findLargestElement(int[] arr)
	{
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				if(arr[i]>largest)
				{
					largest=arr[i];
				}
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		int arr[] = {55,6,3,7,9,33};
		System.out.println(Arrays.toString(arr));
		int largest=findLargestElement(arr);
		System.out.println("The Largest Element is : "+largest);
	}
}
