package practice;

import java.util.Arrays;

public class Practice 
{
	public static void checkmissingNumber(int[] arr)
	{
		int num=arr.length+1;
		System.out.println(num);
		int mis=num*(num+1)/2;
		int act=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			act=act+arr[i];
		}
		int num1= mis-act;
		System.out.println("Missing Number is : "+num1);
	}
	public static void arrange(int[] arr)
	{
		int low=0;
		int high=arr.length-1;
		int[] newArr=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==1)
				newArr[i]=arr[high--];
			else
				newArr[i]=arr[low++];
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		arrange(arr);
		//checkmissingNumber(arr);
	}
}
