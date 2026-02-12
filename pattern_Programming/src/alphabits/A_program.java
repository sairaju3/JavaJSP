package alphabits;

import java.util.Scanner;

public class A_program 
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
				//if((j==col/2) || (i==j && i>=row/2+1) || (i+j==row+1 && i<=row/2+1) )
				//if((i==1) || (j==1) || (i==row) || (j==col))
				//if((i==1 && j!=1) || (j==1 && i!=1&& i!=row) || (i==row && j!=1) )
				//if((i==1 && j!=col) || (j==1 ) || (i==row && j!=col ) || (j==col && i!=row&& i!=1 && i!=row/2+1) || (i==row/2+1 && j!=col))
				if( (i==1 && j!=1 && j!=col) || (j==1 && i!=1) || (i==row/2+1) || (j==col && i!=1) )
					
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
