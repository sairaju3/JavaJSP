package mirroredRightAngleTriangle;
/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
 */
import java.util.Scanner;
public class Triangle_pattern 
{
		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row Value");
			int row=sc.nextInt();
	
			for(int i=1;i<=row;i++)
			{
				
				for(int j=1;j<=row;j++)
				{	
					if(i+j>=row+1)
						System.out.print("*"+" ");
					else
						System.out.print(" "+" ");
					
				}	
				System.out.println();
			}
		}
}
