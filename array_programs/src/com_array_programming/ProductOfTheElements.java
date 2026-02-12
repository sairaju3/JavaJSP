package com_array_programming;


public class ProductOfTheElements 
{
	public static int productftheElements(int[] arr)
	{
		
		int product=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			product=product*arr[i];
		}
		return product;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,8,9,3};
		int product=productftheElements(arr);
		System.out.println("product of The Array Elements : "+product);
	}
}

