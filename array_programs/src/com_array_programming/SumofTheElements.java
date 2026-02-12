package com_array_programming;

public class SumofTheElements 
{
	public static int sumoftheElements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,8,9,3};
		int sum=sumoftheElements(arr);
		System.out.println("Sum of The Array Elements : "+sum);
	}
}
