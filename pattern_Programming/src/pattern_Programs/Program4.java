
package pattern_Programs;
/* 1 2 3
   4 5 6
   7 8 9  */
import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		System.out.println("Enter the columns Value");
		int col = sc.nextInt();
		
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
	}
}
