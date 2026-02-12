package pattern_Programs;
/*

 	1 0 1 0 1 	
 	0 1 0 1 0 
	1 0 1 0 1 
	0 1 0 1 0 
	1 0 1 0 1 
 
*/
import java.util.Scanner;

public class ChessBoardpattern 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row=sc.nextInt();
		System.out.println("Enter the column value");
		int col=sc.nextInt();
		int move=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(move%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
				move++;
			}
			System.out.println();
		}
	}
}
