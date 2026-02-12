package reverseRightAngleTriangle;
/*
4 4 4 4 
3 3 3 
2 2 
1
 
 */
import java.util.Scanner;

public class Pattern2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		int num=row;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{		
				System.out.print(num+" ");
			}
			num--;
			System.out.println();
		}
	}
}
