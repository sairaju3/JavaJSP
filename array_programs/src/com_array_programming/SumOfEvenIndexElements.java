package com_array_programming;

public class SumOfEvenIndexElements 
{
	public static int sumOfEvenIndex(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int sumofEvenIndex=sumOfEvenIndex(arr);
		System.out.println("Sum of Even Index Elements : "+sumofEvenIndex);
	}
}
