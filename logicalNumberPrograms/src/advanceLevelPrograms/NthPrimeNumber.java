package advanceLevelPrograms;

import java.util.Scanner;

public class NthPrimeNumber 
{
	public static boolean checkPrime(int num)
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
			if(checkPrime(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+"th Prime Number = "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Number...");
		int n = sc.nextInt();
		nthPrime(n);
	}
}
