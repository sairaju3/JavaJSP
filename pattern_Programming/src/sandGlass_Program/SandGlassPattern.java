package sandGlass_Program;
/*

* * * * * 
  * * * 
    * 
  * * * 
* * * * * 

 */

import java.util.Scanner;

public class SandGlassPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		
		int star=row;
		int space=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*"+" ");
			}
			if(i<=row/2)
			{
				star=star-2;
				space++;
			}
			else
			{
				star=star+2;
				space--;	
			}
		
			System.out.println();		
		}
	}
}
