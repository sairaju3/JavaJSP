package alphabits;

	import java.util.Scanner;

	public class U_program 
	{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row Value");
			int row=sc.nextInt();
			System.out.println("Enter The Col Value");
			int col = sc.nextInt();
			
			for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=col;j++)
				{
					if(  (j==1 && i!=row) || (i==row && j!=1 && j!=col)|| (j==col && i!=row) )
						
						System.out.print("*"+" ");
					else
						System.out.print(" "+" ");
				}
				System.out.println();
			}
		}
	}
