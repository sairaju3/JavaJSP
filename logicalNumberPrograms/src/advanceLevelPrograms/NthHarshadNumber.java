package advanceLevelPrograms;

import java.util.Scanner;

public class NthHarshadNumber 
{
	public static int checkHarshadNumber(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public static boolean check(int num)
	{
		int sum=checkHarshadNumber(num);
		if(num%sum==0)
			return true;
		else
			return false;
	}
	public static void checkHarshad(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(check(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" th Harshad Number = "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number..");
		int n = sc.nextInt();
		checkHarshad(n);
	}
	
}
