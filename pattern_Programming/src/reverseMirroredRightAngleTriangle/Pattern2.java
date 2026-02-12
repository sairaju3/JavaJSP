package reverseMirroredRightAngleTriangle;
/*
1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1 
 */

import java.util.Scanner;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
	
		for(int i=1;i<=row;i++)
		{
			int num=1;
			for(int j=1;j<=row;j++)
			{	
				if(i<=j)
				{
					
					System.out.print(num++ +" ");
				}
				else
					System.out.print(" "+" ");
					//System.out.print(" "); to get inverse Triangle
			}
			//num++;
			System.out.println();
		}
	}
}
