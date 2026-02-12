package reverseRightAngleTriangle;
/*
e d c b a 
d c b a 
c b a 
b a 
a 
 */
import java.util.Scanner;

public class PatternChar2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		// char ch= (char)(96+row);
		for(int i=row;i>=1;i--)
		{
			//char ch=(char) ((char) 96+i);
			char ch = (char)(96+i);
			for(int j=1;j<=i;j++)
			{		
				System.out.print(ch-- +" ");
				
			}
			System.out.println();
		}
	}
}



