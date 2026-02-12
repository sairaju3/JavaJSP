package pattern_Programs;
// a 1  b  2 
// d 4  e  5 
// g 7  h  8 
// j 10 k 11 
import java.util.Scanner;

public class CombinationProgram3 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		System.out.println("Enter the columns Value");
		int col = sc.nextInt();
		char ch='a';
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j%2==0 )
					System.out.print(num++ +" ");
					
				else
					System.out.print(ch++ +" ");
			}
			ch++;
			num++;
			System.out.println();
		}
	}
}

