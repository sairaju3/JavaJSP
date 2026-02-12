package rightAngle_triangle;
import java.util.Scanner;

/*

A 
1 A 
1 A 1 
A 1 A 1 
A 1 A 1 A  
 
*/
public class TriangleAand1_pattern
{
		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row Value");
			int row=sc.nextInt();
			int move=1;
			for(int i=1;i<=row;i++)
			{
				
				for(int j=1;j<=i;j++)
				{	
					if(move%2==0)
						System.out.print(1 +" ");
					else
						System.out.print('A'+" ");
					move++;
				}	
				System.out.println();
			}
		}
}
