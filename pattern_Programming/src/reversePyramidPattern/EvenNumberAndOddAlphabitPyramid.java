package reversePyramidPattern;
/*
a 1 b 2 c 3 d 
  a 1 b 2 c 
    a 1 b 
      a 
 */
import java.util.Scanner;

public class EvenNumberAndOddAlphabitPyramid 
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
			char ch='a';
			int num=1;
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) 
			{
				if(k%2==0)
					System.out.print(num++ + " ");
				else
					System.out.print(ch++ +" ");
			}
			star=star-2;
			space++;

			
			System.out.println();
		}
	}
}


