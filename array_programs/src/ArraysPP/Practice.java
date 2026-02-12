package ArraysPP;

import java.util.Arrays;
import java.util.Scanner;

public class Practice 
{
//	public static int[] leftRotate(int[] arr)
//	{
//		int temp=arr[arr.length-1];
//		for(int i=arr.length-1;i>=1;i--)
//		{
//			arr[i]=arr[i-1];
//		}
//		arr[0]=temp;
//		return arr;
//	}
	
	public static int secondLargest(int[] arr)
	{
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		if(arr.length>2)
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]>largest)
				{
					secondLargest=largest;
					largest=arr[i];
				}
				else if(arr[i]>secondLargest && arr[i]!=largest)
				{
					secondLargest=arr[i];
				}
			}
			if(secondLargest==0)
				System.out.println("No Second LArs");
			else
				System.out.println("Second LArgest Ele "+secondLargest);
		}
		else
		{
			System.out.println("no");
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter n ");
//		int n= sc.nextInt();
		int[] arr= {2,4,6,8,9}; 
		System.out.println(secondLargest(arr));
//		for(int i=1;i<=n;i++)
//		{
//			leftRotate(arr);
//		}
//		System.out.println(Arrays.toString(arr));
		
	}
}
