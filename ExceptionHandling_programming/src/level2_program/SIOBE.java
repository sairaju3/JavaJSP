package level2_program;

import java.util.Scanner;

public class SIOBE 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = new String("SAI RAJU");
		System.out.println("Enter the index to get character");
		int index=sc.nextInt();
		
		try {
			System.out.println(s.charAt(index));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Enter the Valid index ");
			index=sc.nextInt();
			System.out.println(s.charAt(index));
		}
				
		
	}
}
