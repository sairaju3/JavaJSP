package nextTermsProgramms;

import java.util.Scanner;

public class NextPrimeNumber 
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
	public static void nextPrime(int n)
	{
		for(int i=n+1;;i++)
		{
			int next=i;
			if(checkPrime(next))
			{
				System.out.println("The next Prime Number "+next);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int n = sc.nextInt();
		nextPrime(n);
	}
}
