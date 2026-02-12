package diamondPatterns_programs;
/*
    1 
  2 2 2 
3 3 3 3 3 
  4 4 4 
    5 
 */
import java.util.Scanner;

public class DiamondNumberPattern 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		
		int star=1;
		int space=row/2;
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(num +" ");
			}
			if(i<=row/2)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
			num++;
			System.out.println();		
		}
	}
}
