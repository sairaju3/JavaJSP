package reverseRightAngleTriangle;
/*
d d d d
c c c
b b
a
 */
import java.util.Scanner;

public class PatternChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		char ch = (char)(96+row);
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{		
				System.out.print(ch +" ");	
			}
			ch--;
			System.out.println();
		}
	}
}


