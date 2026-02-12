package mirroredRightAngleTriangle;
/*
 
    	1 
      0 1 
    0 1 0 
  1 0 1 0 
1 0 1 0 1 

*/

import java.util.Scanner;

public class NumberOneAndZero
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int move=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{	
				if(i+j>=row+1)
				{
					if(move%2==0)
						System.out.print(0+" ");
					else
						System.out.print(1+" ");
					move++;
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
