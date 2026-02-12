package advanceLevelPrograms;

import java.util.Scanner;

public class TaskTwisedPrimeOrNot 
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
	public static int placeValue(int num)
	{
		int count=count(num);
		int place=1;
		for(int i=1;i<=count/2;i++)
		{
			place=place*10;
		}
		return place;
	}
	public static int reverse(int num)
	{
		int rev =0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static boolean checkPrime(int num)
	{
		int counts=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				counts++;
			}
		}
		return counts==2;
	}
	public static int splictNumber(int num)
	{
		int place=placeValue(num);
		int sum=0;
				int lf=num%place;
				int fh=num/place;
				int last=reverse(lf);
				int first=reverse(fh);
				sum=first+last;
		
		return sum;
	}
	public static boolean twistedPrime(int num)
	{
		if(checkPrime(num))
		{
			int rev=reverse(num);
			if(checkPrime(rev))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
			return false;
	}
	public static void checkTwistedPrime(int num)
	{
		if(num>999)
		{
			int sum=splictNumber(num);
			if(twistedPrime(sum))
			{
				System.out.println(sum+" is Twisted Prime..");
			}
			else
			{
				System.out.println(sum+" is not a Twisted Prime..");
			}
			
		}
		else
		{
			System.out.println("Enter valid number..");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		checkTwistedPrime(num);
	}
}
