package reversePyramidPattern;

import java.util.Scanner;

public class MirrorNumberPyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int star=2*row-1;
		int space=0;

		for(int i=1;i<=row;i++)
		{
			int num=i;
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) 
			{
				if (k <= star / 2)
					System.out.print(num++ + " ");
				else
					System.out.print(num-- + " ");
			}
			star=star-2;
			space++;			
			System.out.println();
		}
	}
}


