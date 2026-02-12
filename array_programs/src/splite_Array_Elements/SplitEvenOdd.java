package splite_Array_Elements;


import java.util.Arrays;

public class SplitEvenOdd 
{
	public static void printElements(int[] arr) 
	{
		System.out.print("[");
		for (int i = 0; i <= arr.length - 1; i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}
	public static int countEvenElements(int arr[])
	{
		int count = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				count++;
		}
		//System.out.println(count);
		return count;
	}
	public static void spilt(int[] a)
	{
		int firstSize = countEvenElements(a);
		int secondSize = a.length - firstSize;
		
		int [] subArray1 = new int [firstSize];
		int [] subArray2 = new int [secondSize];
		
		int index1 = 0;
		int index2 = 0;
		for(int i = 0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				subArray1[index1++] = a[i];
			else
				subArray2[index2++] = a[i];
		}
		
		System.out.println("Even Elements");
		printElements(subArray1);
		System.out.println("Odd Elements");
		printElements(subArray2);
		
		//System.out.println("SubArray-1 (Even Elements):"+Arrays.toString(subArray1));
		//System.out.println("SubArray-2 (Odd Elements) :"+Arrays.toString(subArray2));
	}
	
	
	public static void main(String[] args)
	{
		int a [] = {2,5,7,9,6,8};
//		System.out.println("Given Array...");
//	    printElements(a);
		
		System.out.println("Given Array :"+Arrays.toString(a));
		
		spilt(a);
	}
}
