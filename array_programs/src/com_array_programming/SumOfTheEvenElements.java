package com_array_programming;

public class SumOfTheEvenElements 
{
	public static int sumofEven(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] arr= {3,5,8,9,1,2};
		int sumofeven=sumofEven(arr);
		System.out.println("Sum of Even Elements : "+sumofeven);
		
	}
}
