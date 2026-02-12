package advanceProgarms;

import java.util.Arrays;

// WAP to Sort only the Even Elements present in the given array in the Ascending order.

// i/p :- array - {8,5,3,6,2,7,4}
// o/p :- array - {2,5,3,4,6,7,8}
public class SortOnlyEvenElements 
{
	public static void sort(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0 )
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]%2==0)
					{
						if(arr[i]>arr[j])
						{
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {8,5,3,6,2,7,4} ;
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
