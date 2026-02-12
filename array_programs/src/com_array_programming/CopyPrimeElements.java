package com_array_programming;
public class CopyPrimeElements 
{
	public static boolean checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("]");
	}
	public static int[] copyPrimeElements(int[] arr , int [] newArr)
	{
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(checkPrime(arr[i])) 
			{
				newArr[index++]=arr[i];
			}
		}
		return newArr;
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,5,7,8,6};
		int [] newArr=new int[arr.length];
		System.out.println("Array Elements...");
		
		printElements(arr);
		copyPrimeElements(arr, newArr);
		System.out.println("After Copying...");
		printElements(newArr);
		
	}
}
