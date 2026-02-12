package practice;

import java.util.Scanner;

public class NthPrimeNum 
{
	public static boolean checkprime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void nthPrime(int n)
	{
		int count=0;
		for(int i=1;true;i++)
		{
			int num=i;
			if(checkprime(num))
			{
				count++;
			}
			if(count==n) 
			{
				System.out.println("The "+n+" is prime number is "+num);
				break;
				
				
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value");
		int num=sc.nextInt();
		nthPrime(num);
	}
}
