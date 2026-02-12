package ArraysPP;

import java.util.Arrays;

public class MissingElement 
{
	public static void sort(int[] arr)
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
	}
	public static void check(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				System.out.println("Missing Element:- "+(arr[i]+1));
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {1, 2, 4, 6, 3, 7, 8};
		check(arr);
	}
}
