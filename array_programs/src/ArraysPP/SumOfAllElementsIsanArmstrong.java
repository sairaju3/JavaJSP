package ArraysPP;

import java.util.Arrays;

public class SumOfAllElementsIsanArmstrong 
{
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int exponential(int x , int n)
	{
		int expo=1;
		for(int i=1;i<=n;i++)
		{
			expo=expo*x;
			
		}
		return expo;
	
	}
	public static boolean checkArmstrong(int num)
	{
		int power=count(num);
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponential(ld, power);
			sum=sum+expo;
			num=num/10;
		}
		return sum==temp;
	}
	public static void checkSumOfArm(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		if(checkArmstrong(sum))
			System.out.println("Armstrong Number...");
		else
			System.out.println("Not a Armstrong Number...");
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {100, 50, 3};
		checkSumOfArm(arr);
		System.out.println(Arrays.toString(arr));
	}
}
