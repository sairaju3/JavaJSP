package sandGlass_Program;

import java.util.Scanner;

public class Hourglass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Value");
		int row=sc.nextInt();
		if(row%2==0)
			row++;
		int space=0;
		int star=row;
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" "+" ");
			}
			char ch='a';
			for(int j=1;j<=star;j++)
			{
				if(i==1 || i==row || j==1 || j==star)
				{
					//if(j<=star/2+1)
						System.out.print(ch++ +" ");
					//else
					//	System.out.print(ch--+" ");
				}
				else
					System.out.print(" "+" ");
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
