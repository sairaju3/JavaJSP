package com_array_programming;
// WAP to Copy the Elements Present in the Given Array into a new Array
public class CopyOfElements 
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
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[i]=arr[i];
		}
		return newArr;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,4,6,8,9};
		int [] newArr=new int[arr.length];
		System.out.println("Before copying...");
		printElements(newArr);
		
		copyElements(arr, newArr);
		System.out.println("After Copying...");
		printElements(newArr);
	}
	 
}
