package advanceLevelPrograms;

import java.util.Scanner;

public class TwistedPrimeNumber 
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
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static void checkTwistedNumber(int num)
	{
		if(prime(num))
		{
		int reverse = reverse(num);
			if(prime(reverse))
			{
			
				System.out.println(num+" is a Twisted Number...");
			}
			else
			{
			System.out.println(num+" is Not a Twisted Number...");
			}
		}
		else
		{
			System.out.println(num+" is Not A prime Number..");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		checkTwistedNumber(num);
	}
}
