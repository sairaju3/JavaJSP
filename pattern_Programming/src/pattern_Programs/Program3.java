package pattern_Programs;


// Number Print and Charater Print 
/* 1 2 3 4    a b c d
   1 2 3 4	  a b c d
   1 2 3 4    a b c d  */

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row value ");
		int row = sc.nextInt();
		System.out.println("Enter the Column Value");
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			
			char ch='a';
			for(int j=1;j<=col;j++)
			{
				System.out.print(ch++ +" ");//  a b c d    a b c d    a b c d    a b c d
			
			//System.out.print(i +" ");//   1 1 1 1    2 2 2 2    3 3 3 3    4 4 4 4
			
			//System.out.print(j +" ");//   1 2 3 4    1 2 3 4    1 2 3 4    1 2 3 4
			}
			System.out.println();
		}
	}
}
