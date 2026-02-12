package reversePyramidPattern;
/*
d d d d d d d 
  c c c c c 
    b b b 
      a 
 */
import java.util.Scanner;

public class ReverseCharPyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		int star=2*row-1;
		int space=0;
		char ch=(char)(96+row);
		for(int i=1;i<=row;i++)
		{
			
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) 
			{
				System.out.print(ch + " ");
			}
			star=star-2;
			space++;
			ch--;
			System.out.println();
		}
	}
}

