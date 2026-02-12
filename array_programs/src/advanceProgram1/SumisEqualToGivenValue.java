package advanceProgram1;

import java.util.Arrays;
import java.util.Scanner;

public class SumisEqualToGivenValue 
{
	public static void sumIsEqualToGivenValue(int[] arr,int sum)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,4,7,5,1,6,3};
		System.out.println("Enter Sum Value");
		int sum =sc.nextInt();
		System.out.println(Arrays.toString(arr));
		sumIsEqualToGivenValue(arr,sum);
	}
}
