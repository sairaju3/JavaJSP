package seriesPrint;

import java.util.Scanner;

public class NtermPrimeNumber 
{
	public static boolean count(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static void printPrimeNumber(int num)
	{
		int count=0;
		System.out.println("First "+num+" terms of Prime Number Series..");
		for(int i=1;;i++)
		{
			if(count(i))
			{
				System.out.print(i+"");
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
		System.out.println("Enter n Value");
		int num=sc.nextInt();
		printPrimeNumber(num);
	}
	
}
