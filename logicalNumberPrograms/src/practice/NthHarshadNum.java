package practice;

import java.util.Scanner;

public class NthHarshadNum 
{
	public static boolean checkHarshd(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return temp%sum==0;
	}
	public static void nthHarshadNum(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(checkHarshd(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" Harshad Number is "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value");
		int num=sc.nextInt();
		nthHarshadNum(num);
	}
}
