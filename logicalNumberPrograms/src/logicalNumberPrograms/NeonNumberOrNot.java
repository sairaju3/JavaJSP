package logicalNumberPrograms;

import java.util.Scanner;
public class NeonNumberOrNot 
{
	public static boolean sumOfDigits(int num)
	{
		int square=num*num;
		int sum=0;
		while(square>0)
		{
			int ld=square%10;
			sum=sum+ld;
			square=square/10;
		}
		return sum==num;
	}
	public static void display(int num)
	{
		if(sumOfDigits(num))
		{
			System.out.println(num+" is a Neon Number");
		}
		else
		{
			System.out.println(num+" is not a Neon Number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		display(num);
	}
}
