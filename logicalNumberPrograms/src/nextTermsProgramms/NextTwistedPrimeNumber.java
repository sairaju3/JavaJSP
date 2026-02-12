package nextTermsProgramms;

import java.util.Scanner;

public class NextTwistedPrimeNumber 
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
	public static int checkReverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static boolean checkTwistedPrime(int num)
	{
		int rev=checkReverse(num);
		if(checkPrime(num))
		{
			if(checkPrime(rev))
				return true;
			else
				return false;
		}
		else
			return false;
		
			
		
	}
	public static void CheckNextTwistedPrime(int num)
	{
	
		for(int i=num+1;;i++)
		{
			int next=i;
			if(checkTwistedPrime(next))
			{
				System.out.println("The Next Twisted Prime number "+num+" is "+next);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		CheckNextTwistedPrime(num);
		//checkTwistedPrime(num);
	}
}

