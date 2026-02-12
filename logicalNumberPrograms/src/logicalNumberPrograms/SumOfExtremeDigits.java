package logicalNumberPrograms;

import java.util.Scanner;

public class SumOfExtremeDigits 
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
	
	public static void mean(int num)
	{
		int temp=num;
		int lastdigit=num%10;
		num=num/10;
		
		while(num>9)
		{
			int ld=num%10;
			num=num/10;
		}
		int sum=lastdigit+temp;
		if(prime(sum))
		{
			System.out.println(temp+" is a prime number");
		}
		else
		{
			System.out.println(temp+" is not a prime number");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		mean(num);
	}
		
}
