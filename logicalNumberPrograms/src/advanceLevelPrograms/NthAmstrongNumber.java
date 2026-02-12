package advanceLevelPrograms;

import java.util.Scanner;

public class NthAmstrongNumber 
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
	public static int exponential(int base, int power)
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public static boolean sumOfExpo(int num)
	{
		int sum=0;
		int power=count(num);
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponential(ld,power);
			sum=sum+expo;
			num=num/10;
		}
		return sum==temp;
	}
	public static void amstrongNumber(int n)
	{
		
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(sumOfExpo(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" th Amstrong Number = "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n=sc.nextInt();
		amstrongNumber(n);
	}
	
	
}
