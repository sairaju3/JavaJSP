package string_PP;

import java.util.Scanner;

public class Practice2 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row");
		int row = sc.nextInt();
		
		int star=row;
		int space=0;
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				
			}
			if(i<=row/2)
			{
				star=star-2;
				space++;
			}
			else
			{
				star=star+2;
				space--;
			}
			System.out.println();
		}
	}
}
