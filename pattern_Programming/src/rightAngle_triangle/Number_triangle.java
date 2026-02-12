package rightAngle_triangle;
//1 
//2 2 
//3 3 3 
//4 4 4 4 
import java.util.Scanner;

public class Number_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		//int num = 1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
}
