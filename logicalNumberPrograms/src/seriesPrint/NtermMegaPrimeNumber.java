package seriesPrint;

import java.util.Scanner;

public class NtermMegaPrimeNumber 
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
	public static boolean digit(int num)
	{
		if(prime(num)) 
		{
			while(num>0)
			{
				int ld=num%10;
				if(!prime(ld))
					return false;
				num=num/10;
			}
			return true;
		}
		else
		   return false;
	}
	public static void nMegaPrimeNumbers(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int n=i;
			if(digit(n))
			{
				System.out.print(n+" ");
				count++;
			}
			if(count==num)
				break;	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value ");
		int num = sc.nextInt();
		nMegaPrimeNumbers(num);
	}
}
