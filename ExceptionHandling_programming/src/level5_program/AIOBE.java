package level5_program;

import java.util.Scanner;

public class AIOBE 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {3,6,4,2,9,7};
		
		System.out.println("Enter the Index to get The element");
		int index=sc.nextInt();
		int chance=0;
		while(true)
		{
			try {
				System.out.println(a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				if(chance==3)
				{
					System.out.println("sorry your chances are reached");
					break;
				}
				System.out.println("you have "+(3-chance)+" chances");
				System.out.println("Re_enter the index Value");
				index=sc.nextInt();
				chance++;
			}
		}
	}
}
