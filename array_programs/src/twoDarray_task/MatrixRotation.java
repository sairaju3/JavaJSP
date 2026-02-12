package twoDarray_task;

import java.util.Scanner;

public class MatrixRotation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix dimension....");
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
		RotationClass rotation = new RotationClass();
		boolean condn=true;
		while(condn)
		{
			System.out.println("1.90");
			System.out.println("2.180");
			System.out.println("3.270");
			System.out.println("4.Exit");
			System.out.println("Select The Degree Elements..");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Rotate 90 deg..");
				rotation.rotate90deg(arr);
			}
			else if(choice==2)
			{
				System.out.println("rotate 180 deg...");
				rotation.rotate180deg(arr);
			}
			else if(choice==3)
			{
				System.out.println("Rotate 270 deg");
				rotation.rotate180deg(arr);
			}
			else if(choice==4) 
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Choice Option.... Enter Valid Number..");
			}
		}	
	}

	
}
