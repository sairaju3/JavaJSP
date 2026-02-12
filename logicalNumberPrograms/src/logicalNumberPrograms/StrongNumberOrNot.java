package logicalNumberPrograms;

import java.util.Scanner;
public class StrongNumberOrNot 
{
	public static boolean factoral(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			int fact=1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;	
			}
			sum=sum+fact;
			num=num/10;
		}
		return sum==temp;
	}
	public static void check(int num)
	{
		if(factoral(num))
			System.out.println(num+" is a Strong Number");
		else
			System.out.println(num+" is not a Strong Number");	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number.");
		int num=sc.nextInt();
		check(num);
		
	}
	
}
