package com_array_programming;

public class MergingOfTwoArrays 
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
	public static int[] merging(int a[],int b[])
	{
		int[] c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			c[index++]=a[i];
		}
		
		for(int i=0;i<=b.length-1;i++)
		{
			c[index++]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int[] a= {10,5,6,8}; 
		int[] b= {4,5,7,9};
		System.out.println("First Array");
		printElements(a);
		System.out.println("Second Array");
		printElements(b);
		int[] c= merging(a,b);
		printElements(c);
		
	}
}
