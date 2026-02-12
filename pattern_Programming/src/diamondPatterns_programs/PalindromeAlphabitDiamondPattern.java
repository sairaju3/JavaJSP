package diamondPatterns_programs;
/*
    a 
  b a b 
c b a b c 
  b a b 
    a
     
 */
import java.util.Scanner;

public class PalindromeAlphabitDiamondPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		
		int star=1;
		int space=row/2;
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<=star/2)
					System.out.print(ch-- +" ");
				else
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
				ch-=2;
			}
			
			System.out.println();		
		}
	}
}
