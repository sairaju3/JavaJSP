package pattern_Programs;
//1 a 1 a 
//2 b 2 b 
//3 c 3 c 
//4 d 4 d 

import java.util.Scanner;

public class CombinationProgram4 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		System.out.println("Enter the columns Value");
		int col = sc.nextInt();
		char ch='a';
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j%2==0 )
					System.out.print(ch+" ");
					
				else
					System.out.print(num +" ");
			}
			ch++;
			num++;
			System.out.println();
		}
	}
}

