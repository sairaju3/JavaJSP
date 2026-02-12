package com_array_programming;

public class MergePrimeNumbers 
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
	public static boolean checkPrime(int ele)
	{
		int count=0;
		for(int i=1;i<=ele;i++)
		{
			if(ele%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static int countPrimeElements(int[] a)
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(checkPrime(i))
			{
				count++;
			}
		}
		return count;
	}
	
	public static int[] merging(int a[],int b[],int totalCount)
	{
		int[] c= new int[totalCount];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(checkPrime(a[i]))
			{
				c[index++]=a[i];
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			if(checkPrime(b[i]))
			{
				c[index++]=b[i];
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int[] a= {10,5,6,8}; 
		int[] b= {4,5,7,2};
		System.out.println("First Array");
		printElements(a);
		System.out.println("Second Array");
		printElements(b);
		
		
		int count1=countPrimeElements(a);
		int count2=countPrimeElements(b);
		int total=count1+count2;
		if(total>0)
		{
			System.out.println("After Merging");
			int[] evenMerge=merging(a, b, total);
			printElements(evenMerge);
		}
		else
		{
			System.out.println("No Prime Elements Present in The two Array..");
		}
	}
	
}
