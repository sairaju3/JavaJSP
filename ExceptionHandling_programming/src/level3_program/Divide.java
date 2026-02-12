package level3_program;

import java.util.Scanner;

public class Divide 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number");
		int a=sc.nextInt();
		System.out.println("Enter the b number");
		int b=sc.nextInt();
		
		
		try 
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter the b Number");
			 b=sc.nextInt();
			 
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Re_Enter The B value");
				b=sc.nextInt();
				try
				{
					System.out.println(a/b);
				}
				catch(ArithmeticException e2)
				{
					System.out.println("Please Re_Enter The B value");
					b=sc.nextInt();
					System.out.println(a/b);
				}
			}
			
		}
		
	}
}
