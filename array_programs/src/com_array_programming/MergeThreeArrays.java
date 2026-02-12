	package com_array_programming;

public class MergeThreeArrays 
{
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
			
		}
		System.out.println("]");
	}
	public static int[] meging(int a[],int b[],int[] c)
	{
		int[] d=new int[a.length+b.length+c.length];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			d[index++]=a[i];
		}
		for(int i=0;i<=b.length-1;i++)
		{
			d[index++]=b[i];
		}
		//int index2=a.length+b.length;
		for(int i=0;i<=c.length-1;i++)
		{
			d[index++]=c[i];
		}
		return d;
	}
	public static void main(String[] args) 
	{
		int[] a= {10,5,6,8}; 
		int[] b= {4,5,7,9};
		int[] c= {2,4,5};
		System.out.println("First Array");
		printElements(a);
		System.out.println("Second Array");
		printElements(b);
		System.out.println("Third Array");
		printElements(c);
		
		int[] d= meging(a,b,c);
		printElements(d);
		
	}
}
