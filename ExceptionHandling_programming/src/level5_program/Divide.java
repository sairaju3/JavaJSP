package level5_program;

import java.util.Scanner;

public class Divide 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The a Number");
		int a = sc.nextInt();
		System.out.println("Enter The b Number");
		int b = sc.nextInt();
		int count=3;
		while(true)
		{
			try {
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Re-Enter The B Number.");
				b=sc.nextInt();
				count--;
				
			}
			if(count==0)
			{
				break;
				//System.out.println("");
			}
		}
	}
}
