package diamondPatterns_programs;
/*
    a 
  a b c 
a b c d e 
  a b c 
    a 
 */
import java.util.Scanner;

public class DiamondCharPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		
		int star=1;
		int space=row/2;
		
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(ch++ +" ");
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
			System.out.println();		
		}
	}
}

