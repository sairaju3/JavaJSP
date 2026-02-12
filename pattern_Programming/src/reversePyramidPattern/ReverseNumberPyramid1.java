package reversePyramidPattern;
/*
4 4 4 4 4 4 4 
  3 3 3 3 3 
    2 2 2 
      1 
 */


import java.util.Scanner;

public class ReverseNumberPyramid1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int star=2*row-1;
		int space=0;
		int num=row;
		for(int i=1;i<=row;i++)
		{
			
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) 
			{
				System.out.print(num + " ");
			}
			star=star-2;
			space++;
			num--;
			System.out.println();
		}
	}
}


