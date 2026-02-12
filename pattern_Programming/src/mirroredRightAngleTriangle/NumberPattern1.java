package mirroredRightAngleTriangle;
/*
        A 
      1 A 
    1 A 1 
  A 1 A 1 
A 1 A 1 A   

*/

import java.util.Scanner;

public class NumberPattern1
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
						System.out.print(1+" ");
					else
						System.out.print("A ");
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
