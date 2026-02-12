package advanceProgarms;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestElement 
{
	public static void descendingOrder(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static int[] removeDuplicate(int[] arr)
	{
		int count=0;
		int visited = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited)
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=visited;
						count++;
					}
				}
			}
		}
		if(count>0)
		{
			int[] newArray = new int[arr.length-count];
			int index = 0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]!=visited)
					newArray[index++]=arr[i];
			}
			return newArray;
		}
		else
			return  null;
	}
	public static int largestElement(int[] arr,int n)
	{
		int largest=Integer.MIN_VALUE;
	
		int[] newArray=removeDuplicate(arr);
		
		if(newArray!=null)
		{
			if(n<=newArray.length)
			{
				descendingOrder(newArray);
				largest=newArray[n-1];
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,5,3,3,7,9,0,1,-6,-3,-5};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the n Value");
		int n= sc.nextInt();
		int largest=largestElement(arr, n);

		if(largest==Integer.MIN_VALUE)
			System.out.println("No Largest Element found  for the given n Value "+n);
		else
			System.out.println("The "+n+" Largest Element is "+largest);	
	}
}
