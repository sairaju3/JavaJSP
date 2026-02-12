package practice;

import java.util.Scanner;

public class NthMegaPrime 
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
	public static boolean megaPrime(int num)
	{
		if(checkPrime(num))
		{
			while(num>0)
			{
				int ld=num%10;
				if(!checkPrime(ld))
				{
					return false;
				}
				
				num=num/10;
			}
			if(num==0)
				return true;
		}
		else
		{
			return false;
		}
		return num==0;
	}
	public static void nthPrime(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(megaPrime(num))
				count++;
			if(count==n)
			{
				System.out.println("The "+n+" Mega Prime Number is "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int n = sc.nextInt();
		nthPrime(n);
	}
}
