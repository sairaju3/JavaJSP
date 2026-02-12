
package pattern_Programs;
/*

    *     
    *     
* * * * * 
    *     
    *     
 
 */


import java.util.Scanner;

public class Program9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		System.out.println("Enter the column Value");
		int col = sc.nextInt();

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if( i==row/2+1 || j==col/2+1)
				
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}



