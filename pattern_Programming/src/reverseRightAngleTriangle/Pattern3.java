package reverseRightAngleTriangle;
/*

1 2 3 4 5 
1 2 3 4
1 2 3
1 2 
1
 
 */
import java.util.Scanner;

public class Pattern3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			int num=1;
			for(int j=1;j<=i;j++)
			{		
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
	}
}

