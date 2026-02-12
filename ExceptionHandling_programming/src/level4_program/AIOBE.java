package level4_program;

import java.util.Scanner;

public class AIOBE 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {3,6,4,2,9,7};
		
		System.out.println("Enter the Index to get The element");
		int index=sc.nextInt();
		while(true)
		{
			try {
				System.out.println(a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Re_enter the index Value");
				index=sc.nextInt();
			}
		}
	}
}
