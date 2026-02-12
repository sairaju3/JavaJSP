package sandGlass_Program;

/*

A 1 A 1 A 
  A 0 A 
    A 
  A 0 A 
A 1 A 1 A 

 */
import java.util.Scanner;

public class SandGlassAndOnePattern
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
//			char ch='a';
//			int num=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k%2!=0)
					System.out.print("A" +" ");
				else if(i%2!=0)
					System.out.print(1+" ");
				else
					System.out.print( 0+" ");
				
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
		//num++;
			System.out.println();		
		}
	}
}
