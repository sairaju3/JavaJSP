package logicalNumberPrograms;

import java.util.Scanner;

public class TechNumber 
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
	public static int placeValue(int num)
	{
		int place=1;
		int count=count(num);
		for(int i=1;i<=count/2;i++)
		{
			place=place*10;
		}
		
		return place;
	}
	public static boolean checkSqaure(int num)
	{
		int temp=num;
		int square=0;
		if(count(num)%2==0)
		{
//			int count=count(num);
			int place=placeValue(num);
			int last=num%place;
			int fh=num/place;
			int sum=fh+last;
			square=sum*sum;
			
		}
		return square==temp;
	}
	public static void check(int num)
	{
		if(checkSqaure(num))
		{
			System.out.println(num+" is a tech Number");
		}
		else
		{
			System.out.println(num+" is not a tech number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		check(num);
	}
}
