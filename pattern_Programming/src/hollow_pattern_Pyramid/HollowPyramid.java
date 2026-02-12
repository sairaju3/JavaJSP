package hollow_pattern_Pyramid;
/*
        * 
      *   * 
    *       * 
  *           * 
* * * * * * * * *

 */
import java.util.Scanner;

public class HollowPyramid 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Value");
		int row=sc.nextInt();
		int star=1;
		int space=row-1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i==row || k==1 || k==star)
					System.out.print("*"+" ");
				else
					System.out.print(" "+ " ");
				
			}
			star=star+2;
			space--;
			System.out.println();
			
		}
	}
}
