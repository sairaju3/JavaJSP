package custom_exception;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void checkPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is Prime Number");
		}
		else
		{
			PrimeCustomexception p = new PrimeCustomexception();
			throw p;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Prime Number..");
		int num=sc.nextInt();
		checkPrime(num);
	}
}
