
package advanceLevelPrograms;

import java.util.Scanner;

public class NPlusOnethFibonacciTerm 
{
	public static void fibonacciTerm(int num)
	{
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++)
		{
			int c=a+b;
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
		fibonacciTerm(num);
		
	}
}
