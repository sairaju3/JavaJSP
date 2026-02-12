package com_array_programming;

public class SumOfPrimeElements 
{
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
	public static int sumOfPrime(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(checkPrime(arr[i]))
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5,6};
		int sumofPrimeElements=sumOfPrime(arr);
		System.out.println("Sum of Prime Elements : "+sumofPrimeElements); 
	}
}
