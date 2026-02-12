package rightAngle_triangle;
//1 
//0 0 
//1 1 1 
//0 0 0 0
import java.util.Scanner;
public class Number3OneAndZero_triangle 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row Value");
			int row=sc.nextInt();
			
			
			for(int i=1;i<=row;i++)
			{
				
				for(int j=1;j<=i;j++)
				{	
					if(i%2==0)
						System.out.print(0 +" ");
					else
						System.out.print(1+" ");
					
				}	
				System.out.println();
			}
		}
}
