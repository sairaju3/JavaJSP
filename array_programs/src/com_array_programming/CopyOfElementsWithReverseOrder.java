package com_array_programming;

public class CopyOfElementsWithReverseOrder 
{
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
		for(int i=arr.length-1;i>=0;i--)
		{
			newArr[index]=arr[i];
			index++;
		}
		return newArr;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,4,6,8,9};
		System.out.println("Array Elements...");
		printElements(arr);
		int [] newArr=new int[arr.length];
		System.out.println("Before copying...");
		printElements(newArr);
		
		copyElements(arr, newArr);
		System.out.println("After Copying...");
		printElements(newArr);
	}
}
