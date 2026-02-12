package nextTermsProgramms;

import java.util.Scanner;

public class NextAmstrongNumber 
{
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int exponential(int base,int power)
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public static boolean checkSumOfExponential(int num)
	{
		int power=count(num);
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponential(ld,power);
			sum=sum+expo;
			num=num/10;
		}
		return sum==temp;
	}
	public static void checkNextAmstrong(int num)
	{
		for(int i=num+1;;i++)
		{
			int next=i;
			if(checkSumOfExponential(next))
			{
				System.out.println("The Next Amstrong number "+num+" is "+next);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		checkNextAmstrong(num);
	}
	
}
