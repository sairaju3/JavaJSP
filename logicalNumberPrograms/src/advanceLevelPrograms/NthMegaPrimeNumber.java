package advanceLevelPrograms;

import java.util.Scanner;

public class NthMegaPrimeNumber 
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
	public static boolean checkMegaNumber(int num)
	{
		if(prime(num))
		{
			while(num>0)
			{
				int ld=num%10;
				if(!prime(ld))
				{
					return false;
				}
				num=num/10;
			}
			return true;
		}
		else
			return false;
		//return num==0;
	}
	public static void checkNthPrimeNumber(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(checkMegaNumber(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" nt Mega Number is "+num);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int n = sc.nextInt();
		checkNthPrimeNumber(n);
	}
}
