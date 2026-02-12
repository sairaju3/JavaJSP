package com_array_programming;

public class ProductOfOddElements 
{
	public static int productOfOdd(int[] arr)
	{
		int product=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				product=product*arr[i];
			}
		}
		return product;
	}
	public static void main(String[] args) {
		
		int[] arr= {3,5,2,6,8,2}; 
		int productofodd=productOfOdd(arr);
		System.out.println("Product of Odd Elements : "+productofodd);
	}
}
