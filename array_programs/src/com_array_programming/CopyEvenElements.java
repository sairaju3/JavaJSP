package com_array_programming;

public class CopyEvenElements 
{
	public static int count(int[] arr)
	{
		int count=0;
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("]");
	}
	public static int[] copyElements(int[] arr , int [] newArr)
	{
		int index=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				newArr[index++]=arr[i];
			}
		}
		return newArr;
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,5,7,8,6};
		System.out.println("Array Elements...");
		printElements(arr);
		
		int count=count(arr);
		if(count==0)
		{
			System.out.println("No Even Elements Present in the given array ");
		}
		else
		{
			int [] newArr=new int[count];
			copyElements(arr, newArr);
			System.out.println("After Copying...");
			printElements(newArr);
		}
	}
}
