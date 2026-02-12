package two_D_Array;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value ");
		int row=sc.nextInt();
		System.out.println("Enter the col value ");
		int col = sc.nextInt();
		int [][] arr = new int[row][col];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the value for row = "+i+" and coloum = "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
