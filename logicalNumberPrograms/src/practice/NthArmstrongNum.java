package practice;

import java.util.Scanner;

public class NthArmstrongNum 
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
	public static int exponential(int x,int n)
	{
		int expo=1;
		for(int i=1;i<=n;i++)
		{
			expo=expo*x;
		}
		return expo;
	}
	public static boolean sumOfexpo(int num)
	{
		int power=count(num);
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponential(ld, power);
			sum=sum+expo;
			num=num/10;
		}
		return sum==temp;
	}
	public static void nthArmstrong(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(sumOfexpo(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" Armstrong Number is "+num);
				break;
			}
		}
		
	}
	
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value");
		int num=sc.nextInt();
		nthArmstrong(num);
	}
}
