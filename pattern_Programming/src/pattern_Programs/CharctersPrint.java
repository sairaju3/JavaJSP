package pattern_Programs;

import java.util.Scanner;

// 1. a b c d
// 2. e f g h
// 3. i j k l
// 4. m n o p

public class CharctersPrint 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		System.out.println("Enter the column Value");
		int col = sc.nextInt();
		char ch='a';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
	}
}
