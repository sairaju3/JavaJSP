package practice;

import java.util.Scanner;

public class binary 
{
	public static void binary(int num)
	{
		int power=0;
		int decimal=0;
		if(num==0)
		{
			System.out.println(num);
		}
		else
		{
			while(num>0)
			{
				int ld=num%10;
				if(ld==1)
				{
					int expo=1;
					for(int i=1;i<=power;i++)
					{
						expo=expo*2;
					}
					decimal=decimal+expo;
				}
				power++;
				num=num/10;
			}
			System.out.println(decimal);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Binary Number");
		int num=sc.nextInt();
		binary(num);
	}
}
