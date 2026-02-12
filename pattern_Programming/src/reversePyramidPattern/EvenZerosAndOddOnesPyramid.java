package reversePyramidPattern;
/*
1 0 1 0 1 0 1 
  1 0 1 0 1 
    1 0 1 
      1 

 */
import java.util.Scanner;

public class EvenZerosAndOddOnesPyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int star=2*row-1;
		int space=0;

		for(int i=1;i<=row;i++)
		{
			
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) 
			{
				if(k%2==0)
					System.out.print(0 + " ");
				else
					System.out.print(1 +" ");
			}
			star=star-2;
			space++;

			
			System.out.println();
		}
	}
}


