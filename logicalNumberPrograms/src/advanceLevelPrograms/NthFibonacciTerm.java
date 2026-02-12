package advanceLevelPrograms;

import java.util.Scanner;

public class NthFibonacciTerm 
{
	public static void fibonacci(int num)
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		fibonacci(num);
		
	}
}
