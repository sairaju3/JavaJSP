package pyramidPattern;

import java.util.Scanner;
public class PyramidNumberPattern3 {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Row Value");
			int row = sc.nextInt();
			int star = 1;
			int space = row - 1;
			
			int num=1;
			
			for (int i = 1; i <= row; i++) 
			{
				
				for (int j = 1; j <= space; j++) 
				{
					System.out.print(" " + " ");
				}
				for (int k = 1; k <= star; k++) 
				{
					System.out.print(num++ + " ");
				}
				star = star + 2;
				space--;
				
				System.out.println();
			}
		}

	

}

