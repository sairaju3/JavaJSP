package rightAngle_triangle;
//1 
//a b 
//1 2 3 
//a b c d
import java.util.Scanner;

public class NumChar_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=i;j++)
			{	
				if(i%2==0)
					System.out.print(ch++ +" ");
				else
					System.out.print(j+" ");
				
			}
			//ch++;
			System.out.println();
		}
	}
}
