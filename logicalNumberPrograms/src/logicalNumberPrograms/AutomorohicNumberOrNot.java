package logicalNumberPrograms;

import java.util.Scanner;

public class AutomorohicNumberOrNot 
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
	public static int place(int num)
	{
		int count=count(num);
		int place = 1;
		for(int i=1; i<=count;i++)
		{
			place=place*10;
		}
		return place;
	}
	public static void square(int num)
	{
		int square=num*num;
		int place=place(num);
		int last=square%place;
		if(last==num)
			System.out.println(num+" is a automorphic number");
		else
			System.out.println(num+" is not a automorphic number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		square(num);
	}
}
