package advanceLevelPrograms;

import java.util.Scanner;

public class MegaPrimeNumber 
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
	public static void megaNumber(int num)
	{
		int temp=num;
		if(prime(num))
		{
			while(num>0)
			{
				int ld=num%10;
				
				if(!prime(ld))
				{
					System.out.println(temp+" is not A mega Number...");
					break;
				}
				num=num/10;
			}
			if(num==0)
			{
				System.out.println(temp+" is a Mega Prime Number...");
			}
		}
		else
		{
			System.out.println(num+" is not a Prime Number..");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num= sc.nextInt();
		megaNumber(num);
	}
}
