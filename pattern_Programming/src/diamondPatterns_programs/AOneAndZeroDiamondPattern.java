package diamondPatterns_programs;

import java.util.Scanner;
/*
    A 
  1 0 1 
A 0 A 0 A 
  1 0 1 
    A 
 */

public class AOneAndZeroDiamondPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		
		int star=1;
		int space=row/2;
		
		for(int i=1;i<=row;i++)
		{
		
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k%2==0)
					System.out.print(0 +" ");
				else if(i%2!=0)
					System.out.print("A"+" ");
				else
					System.out.print(1 +" ");
			}
			if(i<=row/2)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
		
			System.out.println();		
		}
	}
}
