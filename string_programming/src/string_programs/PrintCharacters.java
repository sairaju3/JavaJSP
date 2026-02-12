package string_programs;

import java.util.Scanner;

public class PrintCharacters 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String..");
		String st=sc.next();
		System.out.println("The Characters Present in :- "+st);
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch = st.charAt(i);
			System.out.println(ch);
		}
	}
}
