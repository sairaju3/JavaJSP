package advanceLevelPrograms;

import java.util.Scanner;

public class NthTwistedPrimeNumber 
{
	public static boolean prime(int num)
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
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int ld = num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static boolean checkTwistedPrime(int num)
	{
		if(prime(num))
		{
			int rev=reverse(num);
			if(prime(rev))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	
	}

	public static void checkNthTwisted(int n)
		{
			int count=0;
			for(int i=1;;i++)
			{
				int num=i;
				if(checkTwistedPrime(num))
				{
					count++;
				}
				if(count==n)
				{
					System.out.println("The "+n+" th Twisted Prime Number is "+num);
					break;
				}
		   }
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number......");
		int n = sc.nextInt();
		checkNthTwisted(n);
	}
	
}
