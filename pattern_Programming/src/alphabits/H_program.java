package alphabits;

import java.util.Scanner;

public class H_program 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		System.out.println("Enter The Col Value");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if( (i!=1 && j==col ) || (j==1  ) || (i==row/2+1) || (j==col ))
					
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
