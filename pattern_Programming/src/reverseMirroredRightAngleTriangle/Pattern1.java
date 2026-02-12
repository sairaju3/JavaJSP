package reverseMirroredRightAngleTriangle;
/*

* * * * *
  * * * *
    * * *
      * *
        *

 */

import java.util.Scanner;
public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{	
				if(i<=j)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
					//System.out.print(" "); to get inverse Triangle
			}
			System.out.println();
		}
	}
}

