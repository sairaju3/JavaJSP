package reverseMirroredRightAngleTriangle;
/*
a b c d e 
  2 2 2 2 
    c d e 
      4 4 
        e 
 */
import java.util.Scanner;

public class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		//int move=1;
		for(int i=1;i<=row;i++)
		{	
			char ch=(char)(96+i);
			for(int j=1;j<=row;j++)
			{	
				if(i<=j)
				{
					if(i%2==0)
						System.out.print(i +" ");
					else
						System.out.print(ch++ +" ");
				}
				else
					System.out.print(" "+" ");
				//move++;	
			}
			System.out.println();
		}
	}
}

