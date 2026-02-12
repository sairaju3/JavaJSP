
package level2_program;

import java.util.Scanner;

public class AIOBE 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {3,9,4,23,32,21};
		
		System.out.println("Enter the Index to get The element");
		int index=sc.nextInt();
		try
		{
			System.out.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Re-Enter the Index to get The element ");
			index=sc.nextInt();
			System.out.println(a[index]);
		}
	}
}
