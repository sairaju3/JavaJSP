package level4_program;

import java.util.Scanner;

public class Divide 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a Number");
		int a = sc.nextInt();
		System.out.println("Enter the a Number");
		int b = sc.nextInt();
		
		while(true)
		{
			try {
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Re_Enter The B Number");
				b=sc.nextInt();
				
			}
		}
	}
}
