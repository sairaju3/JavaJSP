package com.streamAPI;
//WAP TO FIND THE SUM OF THE SQUARES OF EVEN ELEMENTS PRESENT IN THE GIVEN ARRAY.


import java.util.Arrays;

public class SumOfSquareOfEven 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {2,3,4,5,7,8,9};
		System.out.println(Arrays.toString(arr));
		int sum=Arrays.stream(arr).filter(a->a%2==0).map(a->a*a).sum();
		System.out.println(sum);
		
	}
}
