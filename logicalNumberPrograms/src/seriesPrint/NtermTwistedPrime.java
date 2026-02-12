package seriesPrint;

import java.util.Scanner;

public class NtermTwistedPrime 
{
	public static boolean count(int num)
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
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static boolean checkTwisedPrime(int num)
	{
		if(count(num))
		{
			int rev=reverse(num);
			if(count(rev))
			{
				return true	;
			}	
			else 
				return false;
		}
		else
			return false;
	}
	
	public static void printNTwistedPrime(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int n=i;
			if(checkTwisedPrime(n))
			{
				System.out.print(n+"");
				count++;
				if(count!=num)
				{
					System.out.print(",");
				}
			}
			if(count==num)
				break;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value..");
		int num = sc.nextInt();
		printNTwistedPrime(num);
	}
}
