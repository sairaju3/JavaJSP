package reverseRightAngleTriangle;
/*
1 0 1 0 
1 0 1 
0 1 
0 
*/

import java.util.Scanner;

public class PatternzeroAndOne
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int move=1;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{	
				if(move%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
				move++;
			}
			
			System.out.println();
		}
	}
}

