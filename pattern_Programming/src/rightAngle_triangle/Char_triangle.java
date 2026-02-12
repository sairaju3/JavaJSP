package rightAngle_triangle;
//a 
//b b 
//c c c 
//d d d d 
import java.util.Scanner;

public class Char_triangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(ch +" ");
				
			}
			ch++;
			System.out.println();
		}
	}
}
