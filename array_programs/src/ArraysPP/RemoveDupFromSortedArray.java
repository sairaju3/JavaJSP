package ArraysPP;

import java.util.Arrays;

public class RemoveDupFromSortedArray 
{
	public static int[] sort(int[] arr) 
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] removeDup(int[] arr)
	{
		int[] sort=sort(arr);
		int viited=Integer.MIN_VALUE;
		for(int i=0;i<=sort.length-1;i++)
		{
			if(arr[i]!=viited)
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=viited;
					}
				}
			}
			
		}
		
		return arr;
	}
	public static void main(String[] args) 
	{
			
		int [] arr= {3,5,6,7,8,3,4,5};
		System.out.println(Arrays.toString(sort(arr)));
		System.out.println(Arrays.toString(removeDup(arr)));
		
	}
}
