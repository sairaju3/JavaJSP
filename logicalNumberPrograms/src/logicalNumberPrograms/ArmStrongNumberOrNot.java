package logicalNumberPrograms;

import java.util.Scanner;
public class ArmStrongNumberOrNot 
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
	public static int exponential(int base,int n)
	{
		int expo=1;
		for(int i=1;i<=n;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public static int sumOfExponential(int num)
	{
		int power = count(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			
			int expo=exponential(ld,power);
			sum=sum+expo;
			
			num=num/10;
		}
		return sum;
	}
	public static void checkArmStrongNumber(int num)
	{
		int sum=sumOfExponential(num);
		if(sum==num)
			System.out.println(num+" is an ArmStrong Number");
		else
			System.out.println(num+" is not an ArmStrong Number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		//System.out.println("Sum of Exponential is "+sumOfExponential(num));
		checkArmStrongNumber(num);
		
	}
}
