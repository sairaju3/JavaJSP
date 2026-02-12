package level3_program;

import java.util.Scanner;

public class AIOBE 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {5,19,3,4,33,12};
		System.out.println("Enter the Index to get The element");
		int index=sc.nextInt();
		try {
			System.out.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Re-Enter the Index to get The element");
			index=sc.nextInt();
			try {
				System.out.println(a[index]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(" Enter the Valid number");
				index=sc.nextInt();
				try {
					System.out.println(a[index]);
				}
				catch(ArrayIndexOutOfBoundsException e2)
				{
					System.out.println("Plese Enter the Valid number");
					index=sc.nextInt();
					System.out.println(a[index]);
				}
			}
		}
	}
}
