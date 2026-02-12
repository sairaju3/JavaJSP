package practice;

import java.util.Scanner;

public class BinaryToDecimal 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Binary Number");
		int num=sc.nextInt();
		int decimal=0;
		int power=0;
		int temp=num;
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
}
