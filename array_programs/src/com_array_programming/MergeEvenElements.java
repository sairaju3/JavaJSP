package com_array_programming;

public class MergeEvenElements 
{
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]+" ");
			else
				System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	public static int countEvenElements(int[] a)
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int[] meging(int a[],int b[],int totalCount)
	{
		int[] c= new int[totalCount];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				c[index++]=a[i];
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2==0)
			{
				c[index++]=b[i];
			}
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
		
		int count1=countEvenElements(a);
		int count2=countEvenElements(b);
		int totalCount=count1+count2;
		
		if(totalCount>0)
		{
			System.out.println("After Merging");
			int[] evenMerge=meging(a, b, totalCount);
			printElements(evenMerge);
		}
		else
		{
			System.out.println("No Even Elements Present in The two Array..");
		}
	}
}
