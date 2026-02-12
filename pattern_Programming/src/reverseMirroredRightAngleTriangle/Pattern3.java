package reverseMirroredRightAngleTriangle;
/*
a b c d 
  a b c 
    a b 
      a 
 */
import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
	
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=row;j++)
			{	
				if(i<=j)
				{
					
					System.out.print(ch++ +" ");
				}
				else
					System.out.print(" "+" ");
					//System.out.print(" "); to get inverse Triangle
			}
			//num++;
			System.out.println();
		}
	}
}

