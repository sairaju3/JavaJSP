package logicalNumberPrograms;

import java.util.Scanner;
public class HarshadNumberOrNot 
{
	public static boolean harshadNumber(int num)
	{
		int sum=0;
		int temp=num;
		while (num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return temp%sum==0;
	}
	public static void check(int num)
	{
		if(harshadNumber(num))
			System.out.println(num+" is a Harshad Number");
		else
			System.out.println(num+" is not a Harshad Number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		check(num);
	}
}
